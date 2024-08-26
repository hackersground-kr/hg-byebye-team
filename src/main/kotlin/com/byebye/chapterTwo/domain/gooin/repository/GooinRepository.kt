package com.byebye.chapterTwo.domain.gooin.repository

import com.byebye.chapterTwo.domain.gooin.entity.GooinEntity
import org.springframework.data.jpa.repository.JpaRepository

interface GooinRepository: JpaRepository<GooinEntity, Long> {
}