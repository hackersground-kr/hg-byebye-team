package com.byebye.chapterTwo.global.auth.jwt

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
data class JwtProperties (

    @Value("\${spring.application.jwt.secretKey}") val secretKey: String,

    @Value("\${spring.application.jwt.expiration}") val accessExpired: Long,

    @Value("\${spring.application.jwt.refreshExpiration}") val refreshExpired: Long

)