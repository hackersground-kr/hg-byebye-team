package com.byebye.chapterTwo.domain.member.application.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/application/service/LoginMemberService;", "Lcom/byebye/chapterTwo/domain/member/application/port/in/LoginMemberUseCase;", "jwtUtils", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;", "bCryptPasswordEncoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "loadMemberPort", "Lcom/byebye/chapterTwo/domain/member/application/port/out/LoadMemberPort;", "(Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;Lcom/byebye/chapterTwo/domain/member/application/port/out/LoadMemberPort;)V", "loginMember", "Lcom/byebye/chapterTwo/global/common/BaseResponse;", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtInfo;", "memberDTO", "Lcom/byebye/chapterTwo/domain/member/adapter/in/dto/req/LoginMemberRequest;", "chapterTwo"})
public class LoginMemberService implements com.byebye.chapterTwo.domain.member.application.port.in.LoginMemberUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils = null;
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder = null;
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort loadMemberPort = null;
    
    public LoginMemberService(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils, @org.jetbrains.annotations.NotNull()
    org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder, @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort loadMemberPort) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<com.byebye.chapterTwo.global.auth.jwt.JwtInfo> loginMember(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.in.dto.req.LoginMemberRequest memberDTO) {
        return null;
    }
}