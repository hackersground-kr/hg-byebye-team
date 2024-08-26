package com.byebye.chapterTwo.domain.member.application.port.out


interface ExistMemberPort {

    fun existMemberWithName(name: String): Boolean

}