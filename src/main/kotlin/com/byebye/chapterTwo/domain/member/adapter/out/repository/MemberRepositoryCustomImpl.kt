package com.byebye.chapterTwo.domain.member.adapter.out.repository

import com.byebye.chapterTwo.domain.member.adapter.out.entity.MemberEntity
import com.byebye.chapterTwo.domain.member.adapter.out.entity.QMemberEntity.memberEntity
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository

@Repository
class MemberRepositoryCustomImpl (
    private val jpaQueryFactory: JPAQueryFactory
) : MemberRepositoryCustom {

    override fun findByName(name: String): MemberEntity? {
        val result = jpaQueryFactory
            .select(memberEntity)
            .from(memberEntity)
            .where(
                memberEntity.name.eq(name),
            ).fetchOne()

        return result
    }

    override fun existsByName(name: String): Boolean {

        return jpaQueryFactory
            .selectOne()
            .from(memberEntity)
            .where(
                memberEntity.name.eq(name),
            ).fetchOne() != null
    }
}