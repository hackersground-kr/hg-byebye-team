package com.byebye.chapterTwo.domain.member.application.port.in;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/application/port/in/LoginMemberUseCase;", "", "loginMember", "Lcom/byebye/chapterTwo/global/common/BaseResponse;", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtInfo;", "memberDTO", "Lcom/byebye/chapterTwo/domain/member/adapter/in/dto/req/LoginMemberRequest;", "chapterTwo"})
public abstract interface LoginMemberUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.byebye.chapterTwo.global.common.BaseResponse<com.byebye.chapterTwo.global.auth.jwt.JwtInfo> loginMember(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.in.dto.req.LoginMemberRequest memberDTO);
}