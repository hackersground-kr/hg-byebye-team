package com.byebye.chapterTwo.domain.gooin.dto.req

import com.fasterxml.jackson.annotation.JsonProperty

data class AddGooinRequest(
    @JsonProperty("title") val title: String,
    @JsonProperty("description") val description: String,
)
