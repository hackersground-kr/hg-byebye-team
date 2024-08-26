package com.byebye.chapterTwo.domain.member.application.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/application/service/EditMemberService;", "Lcom/byebye/chapterTwo/domain/member/application/port/in/EditMemberUseCase;", "memberAdapter", "Lcom/byebye/chapterTwo/domain/member/adapter/out/MemberAdapter;", "(Lcom/byebye/chapterTwo/domain/member/adapter/out/MemberAdapter;)V", "editMember", "Lcom/byebye/chapterTwo/global/common/BaseResponse;", "", "dto", "Lcom/byebye/chapterTwo/domain/member/adapter/in/dto/req/EditMemberRequest;", "id", "", "chapterTwo"})
public class EditMemberService implements com.byebye.chapterTwo.domain.member.application.port.in.EditMemberUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.adapter.out.MemberAdapter memberAdapter = null;
    
    public EditMemberService(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.out.MemberAdapter memberAdapter) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<kotlin.Unit> editMember(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.in.dto.req.EditMemberRequest dto, long id) {
        return null;
    }
}