package com.byebye.chapterTwo.domain.member.adapter.`in`.controller

import com.byebye.chapterTwo.domain.member.application.port.`in`.RemoveMemberUseCase
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class RemoveMemberController(
    private val removeMemberUseCase: RemoveMemberUseCase
) {

    @DeleteMapping("/remove")
    fun removeMember(id: Long): BaseResponse<Unit> {
        return removeMemberUseCase.removeMember(id)
    }

}