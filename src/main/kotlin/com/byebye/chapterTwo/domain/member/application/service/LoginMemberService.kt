package com.byebye.chapterTwo.domain.member.application.service

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.LoginMemberRequest
import com.byebye.chapterTwo.domain.member.application.model.Member
import com.byebye.chapterTwo.domain.member.application.port.`in`.LoginMemberUseCase
import com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort
import com.byebye.chapterTwo.global.auth.exception.CustomException
import com.byebye.chapterTwo.global.auth.jwt.JwtInfo
import com.byebye.chapterTwo.global.auth.jwt.JwtUtils
import com.byebye.chapterTwo.global.auth.jwt.exception.JwtErrorCode
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class LoginMemberService(
    private val jwtUtils: JwtUtils,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder,
    private val loadMemberPort: LoadMemberPort,
) : LoginMemberUseCase {

    override fun loginMember(memberDTO: LoginMemberRequest): BaseResponse<JwtInfo> {
        val member: Member = loadMemberPort.loadMemberWithName(memberDTO.name)

        if (!bCryptPasswordEncoder.matches(memberDTO.password, member.password)) {
            throw CustomException(JwtErrorCode.JWT_MEMBER_NOT_MATCH)
        }

        val jwtInfo = jwtUtils.generate(member)

        return BaseResponse (
            message = "토큰 발급 성공 !!",
            data = jwtInfo
        )
    }
}