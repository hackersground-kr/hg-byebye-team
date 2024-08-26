package com.byebye.chapterTwo.domain.member.adapter.out.repository

import com.byebye.chapterTwo.domain.member.adapter.out.entity.MemberEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository: CrudRepository<MemberEntity, Long>, MemberRepositoryCustom {

    override fun findByName(name: String): MemberEntity?

    override fun existsByName(name: String): Boolean

}