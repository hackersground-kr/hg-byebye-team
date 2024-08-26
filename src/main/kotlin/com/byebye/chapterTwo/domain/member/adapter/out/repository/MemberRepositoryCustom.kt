package com.byebye.chapterTwo.domain.member.adapter.out.repository

import com.byebye.chapterTwo.domain.member.adapter.out.entity.MemberEntity

interface MemberRepositoryCustom {

    fun findByName(name: String): MemberEntity?

    fun existsByName(name: String): Boolean

}