package com.byebye.chapterTwo.domain.member.adapter.in.controller;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/member"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/adapter/in/controller/LoginMemberController;", "", "loginMemberUseCase", "Lcom/byebye/chapterTwo/domain/member/application/port/in/LoginMemberUseCase;", "(Lcom/byebye/chapterTwo/domain/member/application/port/in/LoginMemberUseCase;)V", "loginMember", "Lcom/byebye/chapterTwo/global/common/BaseResponse;", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtInfo;", "memberDTO", "Lcom/byebye/chapterTwo/domain/member/adapter/in/dto/req/LoginMemberRequest;", "chapterTwo"})
public class LoginMemberController {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.application.port.in.LoginMemberUseCase loginMemberUseCase = null;
    
    public LoginMemberController(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.application.port.in.LoginMemberUseCase loginMemberUseCase) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/login"})
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<com.byebye.chapterTwo.global.auth.jwt.JwtInfo> loginMember(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.in.dto.req.LoginMemberRequest memberDTO) {
        return null;
    }
}