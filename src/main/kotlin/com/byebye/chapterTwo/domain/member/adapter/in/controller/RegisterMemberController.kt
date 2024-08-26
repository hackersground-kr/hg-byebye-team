package com.byebye.chapterTwo.domain.member.adapter.`in`.controller

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.RegisterMemberRequest
import com.byebye.chapterTwo.domain.member.application.port.`in`.RegisterMemberUseCase
import com.byebye.chapterTwo.global.auth.jwt.JwtInfo
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class RegisterMemberController (
    private val registerMemberUseCase: RegisterMemberUseCase
) {

    @PostMapping("/register")
    fun createMember(@RequestBody memberDTO: RegisterMemberRequest): BaseResponse<JwtInfo> {
        return registerMemberUseCase.registerMember(memberDTO)
    }

}