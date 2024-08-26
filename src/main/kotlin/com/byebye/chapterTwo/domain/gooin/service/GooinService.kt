package com.byebye.chapterTwo.domain.gooin.service

import com.byebye.chapterTwo.domain.exception.GooinErrorCode
import com.byebye.chapterTwo.domain.gooin.dto.Gooin
import com.byebye.chapterTwo.domain.gooin.dto.req.AddGooinRequest
import com.byebye.chapterTwo.domain.gooin.entity.GooinEntity
import com.byebye.chapterTwo.domain.gooin.mapper.GooinMapper
import com.byebye.chapterTwo.domain.gooin.repository.GooinRepository
import com.byebye.chapterTwo.global.auth.exception.CustomErrorCode
import com.byebye.chapterTwo.global.auth.exception.CustomException
import com.byebye.chapterTwo.global.auth.jwt.JwtUtils
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.stereotype.Service

@Service
class GooinService(
    private val gooinRepository: GooinRepository,
    private val jwtUtils: JwtUtils,
    private val gooinMapper: GooinMapper
) {

    fun saveGooin(dto: AddGooinRequest) : BaseResponse<String>{
        gooinRepository.save(
            gooinMapper.toEntity(Gooin(
                    dto,
                    jwtUtils.getMember().id!!
                )
            )
        )
        return BaseResponse(
            status = 201,
            message = "구인 신청 성공!!"
        )
    }

    fun getGooin() : BaseResponse<List<GooinEntity>> {
        return BaseResponse(
            message = "조회 성공",
            data = gooinRepository.findAll()
        )
    }

    fun editGooin(id:Long,dto: AddGooinRequest) : BaseResponse<String>{
        val gooin = gooinRepository.findById(id).orElseThrow { CustomException(GooinErrorCode.GOOIN_NOT_FOUND) }
            .let {
                gooinMapper.toDomain(it)
            }
        gooin.editGooin(dto)
        gooinRepository.save(gooinMapper.toEntity(gooin))
        return BaseResponse(
            message = "수정 성공"
        )
    }

}