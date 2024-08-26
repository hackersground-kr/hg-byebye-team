package com.byebye.chapterTwo.domain.member.adapter.out

import com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepository
import com.byebye.chapterTwo.domain.member.adapter.out.mapper.MemberMapper
import com.byebye.chapterTwo.domain.member.application.exception.MemberErrorCode
import com.byebye.chapterTwo.domain.member.application.model.Member
import com.byebye.chapterTwo.domain.member.application.port.out.DeleteMemberPort
import com.byebye.chapterTwo.domain.member.application.port.out.ExistMemberPort
import com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort
import com.byebye.chapterTwo.domain.member.application.port.out.SaveMemberPort
import com.byebye.chapterTwo.global.auth.exception.CustomException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class MemberAdapter (
    val memberRepository: MemberRepository,
    val memberMapper: MemberMapper
) : SaveMemberPort, LoadMemberPort, ExistMemberPort, DeleteMemberPort {

    @Transactional
    override fun saveMember(member: Member) {
        memberRepository.save(
            memberMapper.toEntity(member)
        )
    }

    @Transactional
    override fun deleteMember(member: Member) {
        memberRepository.delete(
            memberMapper.toEntity(member)
        )
    }

    @Transactional(readOnly= true)
    override fun loadMemberWithId(id: Long): Member {
        return memberMapper.toDomain(
            memberRepository.findByIdOrNull(id)
                ?: throw CustomException(MemberErrorCode.MEMBER_NOT_FOUND)
        )
    }

    @Transactional(readOnly = true)
    override fun loadMemberWithName(name: String): Member {
        return memberMapper.toDomain(
            memberRepository.findByName(name)
                ?: throw CustomException(MemberErrorCode.MEMBER_NOT_FOUND)
        )
    }

    @Transactional(readOnly = true)
    override fun existMemberWithName(name: String): Boolean {
        return memberRepository.existsByName(name)
    }
}