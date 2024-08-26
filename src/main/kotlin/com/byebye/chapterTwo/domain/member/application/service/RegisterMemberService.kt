package com.byebye.chapterTwo.domain.member.application.service

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.RegisterMemberRequest
import com.byebye.chapterTwo.domain.member.application.exception.MemberErrorCode
import com.byebye.chapterTwo.domain.member.application.model.Member
import com.byebye.chapterTwo.domain.member.application.port.`in`.RegisterMemberUseCase
import com.byebye.chapterTwo.domain.member.application.port.out.ExistMemberPort
import com.byebye.chapterTwo.domain.member.application.port.out.SaveMemberPort
import com.byebye.chapterTwo.global.auth.exception.CustomException
import com.byebye.chapterTwo.global.auth.jwt.JwtInfo
import com.byebye.chapterTwo.global.auth.jwt.JwtUtils
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service
class RegisterMemberService(
    private val saveMemberPort: SaveMemberPort,
    private val existMemberPort: ExistMemberPort,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder,
    private val jwtUtils: JwtUtils
) : RegisterMemberUseCase {

    override fun registerMember(@RequestBody dto: RegisterMemberRequest): BaseResponse<JwtInfo> {
        val member = Member(dto, bCryptPasswordEncoder.encode(dto.password))

        if (existMemberPort.existMemberWithName(member.name)) {
            throw CustomException(MemberErrorCode.MEMBER_ALREADY_EXIST)
        }

        saveMemberPort.saveMember(member)

        return BaseResponse(
            message = "회원가입 성공 !!",
            data = jwtUtils.generate(member)
        )
    }
}