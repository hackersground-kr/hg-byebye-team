package com.byebye.chapterTwo.domain.member.application.port.`in`

import com.byebye.chapterTwo.global.common.BaseResponse


interface RefreshTokenUseCase {

    fun refreshToken(token: String): BaseResponse<String>

}