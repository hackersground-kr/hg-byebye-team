package com.byebye.chapterTwo.global.auth.exception

import org.springframework.http.HttpStatus

interface CustomErrorCode {

    val status: HttpStatus
    val message: String

}