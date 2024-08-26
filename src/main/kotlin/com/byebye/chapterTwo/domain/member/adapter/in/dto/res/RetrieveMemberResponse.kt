package com.byebye.chapterTwo.domain.member.adapter.`in`.dto.res

import com.byebye.chapterTwo.domain.member.application.model.Member

data class RetrieveMemberResponse (

    val id: Long,
    val phoneNum: String,
    val name: String,

) {
    
    constructor (member: Member) : this (
        id = member.id!!,
        phoneNum = member.phoneNum,
        name = member.name,
    )

}