package com.byebye.chapterTwo.domain.member.application.port.`in`

import com.byebye.chapterTwo.global.common.BaseResponse

interface RemoveMemberUseCase {

    fun removeMember(id: Long) : BaseResponse<Unit>

}