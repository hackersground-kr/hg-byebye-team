package com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req

import com.fasterxml.jackson.annotation.JsonProperty

data class LoginMemberRequest (

    @JsonProperty("name") val name: String,
    @JsonProperty("password") val password: String

)