package com.byebye.chapterTwo.domain.member.application.service

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.res.RetrieveMemberResponse
import com.byebye.chapterTwo.domain.member.application.model.Member
import com.byebye.chapterTwo.domain.member.application.port.`in`.RetrieveMemberUseCase
import com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort
import com.byebye.chapterTwo.global.auth.jwt.JwtUtils
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.stereotype.Service

@Service
class RetrieveMemberService (
    private val loadMemberPort: LoadMemberPort,
    private val jwtUtils: JwtUtils
) : RetrieveMemberUseCase {

    override fun retrieveMember(): BaseResponse<RetrieveMemberResponse> {
        val member: Member = loadMemberPort.loadMemberWithId(jwtUtils.getMember().id!!)

        return BaseResponse (
            message = "멤버 정보 조회 성공 !!",
            data = RetrieveMemberResponse(member)
        )
    }
}