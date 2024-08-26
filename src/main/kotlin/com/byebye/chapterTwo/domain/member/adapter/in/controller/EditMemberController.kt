package com.byebye.chapterTwo.domain.member.adapter.`in`.controller


import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.EditMemberRequest
import com.byebye.chapterTwo.domain.member.application.port.`in`.EditMemberUseCase
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class EditMemberController (
    private val editMemberUseCase: EditMemberUseCase
) {

    @PatchMapping("/edit")
    fun editMember(@RequestBody dto: EditMemberRequest, id: Long) : BaseResponse<Unit> {
        return editMemberUseCase.editMember(dto, id)
    }

}