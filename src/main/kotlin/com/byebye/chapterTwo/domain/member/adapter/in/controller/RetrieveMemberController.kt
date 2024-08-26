package com.byebye.chapterTwo.domain.member.adapter.`in`.controller

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.res.RetrieveMemberResponse
import com.byebye.chapterTwo.domain.member.application.port.`in`.RetrieveMemberUseCase
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class RetrieveMemberController (
    private val retrieveMemberUseCase: RetrieveMemberUseCase
) {

    @GetMapping("/myInfo")
    fun getMyInfo(): BaseResponse<RetrieveMemberResponse> {
        return retrieveMemberUseCase.retrieveMember()
    }

}