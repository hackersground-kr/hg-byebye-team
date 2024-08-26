package com.byebye.chapterTwo.domain.member.application.port.`in`

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.RegisterMemberRequest
import com.byebye.chapterTwo.global.auth.jwt.JwtInfo
import com.byebye.chapterTwo.global.common.BaseResponse

interface RegisterMemberUseCase {

    fun registerMember(dto: RegisterMemberRequest): BaseResponse<JwtInfo>

}