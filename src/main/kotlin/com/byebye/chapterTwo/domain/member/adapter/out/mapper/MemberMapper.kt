package com.byebye.chapterTwo.domain.member.adapter.out.mapper

import com.byebye.chapterTwo.domain.member.adapter.out.entity.MemberEntity
import com.byebye.chapterTwo.domain.member.application.model.Member
import com.byebye.chapterTwo.domain.member.application.model.MemberRole
import org.springframework.stereotype.Component

@Component
class MemberMapper{

    fun toDomain(entity: MemberEntity): Member {
        return Member (
            id = entity.id!!,
            name = entity.name,
            phoneNum = entity.phoneNum,
            password = entity.password,
            role = MemberRole(entity.role),
        )
    }

    fun toEntity(domain: Member): MemberEntity {
        return MemberEntity (
            id = domain.id?: 0,
            name = domain.name,
            phoneNum = domain.phoneNum,
            password = domain.password,
        )
    }

}