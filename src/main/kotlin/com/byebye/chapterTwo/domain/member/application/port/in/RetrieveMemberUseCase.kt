package com.byebye.chapterTwo.domain.member.application.port.`in`

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.res.RetrieveMemberResponse
import com.byebye.chapterTwo.global.common.BaseResponse

interface RetrieveMemberUseCase {

    fun retrieveMember(): BaseResponse<RetrieveMemberResponse>

}