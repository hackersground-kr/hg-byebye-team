package com.byebye.chapterTwo.domain.gooin.mapper

import com.byebye.chapterTwo.domain.gooin.dto.Gooin
import com.byebye.chapterTwo.domain.gooin.entity.GooinEntity
import org.springframework.stereotype.Component

@Component
class GooinMapper {
    fun toDomain(entity: GooinEntity): Gooin {
        return Gooin (
            id = entity.id!!,
            title = entity.title,
            description = entity.description,
            userId = entity.userId
        )
    }

    fun toEntity(domain: Gooin): GooinEntity {
        return GooinEntity (
            id = domain.id?: 0,
            title = domain.title,
            description = domain.description,
            userId = domain.userId
        )
    }
}