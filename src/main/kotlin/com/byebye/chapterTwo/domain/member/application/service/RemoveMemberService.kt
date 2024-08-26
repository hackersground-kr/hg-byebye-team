package com.byebye.chapterTwo.domain.member.application.service

import com.byebye.chapterTwo.domain.member.application.port.`in`.RemoveMemberUseCase
import com.byebye.chapterTwo.domain.member.application.port.out.DeleteMemberPort
import com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.stereotype.Service

@Service
class RemoveMemberService(
    private val loadMemberPort: LoadMemberPort,
    private val deleteMemberPort: DeleteMemberPort
) : RemoveMemberUseCase {

    override fun removeMember(id: Long): BaseResponse<Unit> {
        val member = loadMemberPort.loadMemberWithId(id)

        deleteMemberPort.deleteMember(member)

        return BaseResponse(
            message = "멤버가 삭제되었어요."
        )
    }

}