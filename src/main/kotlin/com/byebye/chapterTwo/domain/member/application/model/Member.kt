package com.byebye.chapterTwo.domain.member.application.model

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.EditMemberRequest
import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.RegisterMemberRequest

data class Member (

    val id: String,
    var name: String,
    val password: String,
    val role: MemberRole,
    var phoneNum: String

) {

    constructor(dto: RegisterMemberRequest, encrypted: String) : this (
        id = dto.id,
        name = dto.name,
        password = encrypted,
        role = MemberRole("ROLE_USER"),
        phoneNum = dto.phoneNum
    )

    fun editMember (dto: EditMemberRequest) {
        this.name = dto.name
    }

}