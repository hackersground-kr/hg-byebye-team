package com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req

import com.fasterxml.jackson.annotation.JsonProperty

class EditMemberRequest (

    @JsonProperty("name") val name: String,

)