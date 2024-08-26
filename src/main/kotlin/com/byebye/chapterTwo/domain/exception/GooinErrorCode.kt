package com.byebye.chapterTwo.domain.exception

import com.byebye.chapterTwo.global.auth.exception.CustomErrorCode
import org.springframework.http.HttpStatus

enum class GooinErrorCode (
    override val status: HttpStatus,
    override val message: String,
) : CustomErrorCode {

    GOOIN_NOT_FOUND(HttpStatus.NOT_FOUND,  "해당 구인 신청을 찾을 수 없습니다"),
    GOOIN_ALREADY_EXIST(HttpStatus.CONFLICT,  "해당 구인 신청이 이미 존재합니다")

}