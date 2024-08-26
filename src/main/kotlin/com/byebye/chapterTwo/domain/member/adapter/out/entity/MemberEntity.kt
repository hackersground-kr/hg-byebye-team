package com.byebye.chapterTwo.domain.member.adapter.out.entity

import jakarta.persistence.*

@Entity
data class MemberEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var name: String = "",

    @Column(nullable = false)
    var phoneNum: String = "",

    @Column(nullable = false)
    var password: String = "",

    @Column(nullable = false)
    var role: String = "ROLE_USER",

)
