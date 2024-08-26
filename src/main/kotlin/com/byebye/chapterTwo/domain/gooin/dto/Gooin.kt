package com.byebye.chapterTwo.domain.gooin.dto

import com.byebye.chapterTwo.domain.gooin.dto.req.AddGooinRequest

data class Gooin(
    val id: Long? = null,
    var title: String,
    var description: String,
    val userId: Long,
){
    constructor(dto: AddGooinRequest, userId: Long) : this(
        id = null?:0,
        title = dto.title,
        description = dto.description,
        userId = userId
    )

    fun editGooin(dto: AddGooinRequest){
        this.title=dto.title
        this.description= dto.description
    }

}
