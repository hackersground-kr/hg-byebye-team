package com.byebye.chapterTwo.domain.member.application.port.`in`

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.LoginMemberRequest
import com.byebye.chapterTwo.global.auth.jwt.JwtInfo
import com.byebye.chapterTwo.global.common.BaseResponse

interface LoginMemberUseCase {

    fun loginMember(memberDTO: LoginMemberRequest): BaseResponse<JwtInfo>

}