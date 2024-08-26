package com.byebye.chapterTwo.domain.member.application.port.`in`

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.EditMemberRequest
import com.byebye.chapterTwo.global.common.BaseResponse

interface EditMemberUseCase {

    fun editMember(dto: EditMemberRequest, id: Long): BaseResponse<Unit>

}