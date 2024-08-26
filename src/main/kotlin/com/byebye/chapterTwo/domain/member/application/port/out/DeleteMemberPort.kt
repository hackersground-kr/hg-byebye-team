package com.byebye.chapterTwo.domain.member.application.port.out

import com.byebye.chapterTwo.domain.member.application.model.Member

interface DeleteMemberPort {
    fun deleteMember(member:Member)
}