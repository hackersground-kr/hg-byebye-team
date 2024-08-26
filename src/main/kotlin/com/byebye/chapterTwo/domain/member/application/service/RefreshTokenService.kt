package com.byebye.chapterTwo.domain.member.application.service

import com.byebye.chapterTwo.domain.member.application.port.`in`.RefreshTokenUseCase
import com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort
import com.byebye.chapterTwo.global.auth.exception.CustomException
import com.byebye.chapterTwo.global.auth.jwt.JwtUtils
import com.byebye.chapterTwo.global.auth.jwt.exception.JwtErrorCode
import com.byebye.chapterTwo.global.auth.jwt.exception.type.JwtErrorType
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.stereotype.Service

@Service
class RefreshTokenService (
    private val jwtUtils: JwtUtils,
    private val loadMemberPort: LoadMemberPort
) : RefreshTokenUseCase {

    override fun refreshToken(token: String): BaseResponse<String> {
        val got = jwtUtils.getToken(token)

        if (jwtUtils.checkTokenInfo(got) == JwtErrorType.ExpiredJwtException) {
            throw CustomException(JwtErrorCode.JWT_TOKEN_EXPIRED)
        }

        val member = loadMemberPort.loadMemberWithName(
            jwtUtils.getUsername(got)
        )

        return BaseResponse (
            message = "리프레시 성공 !",
            data = jwtUtils.refreshToken(member)
        )
    }

}