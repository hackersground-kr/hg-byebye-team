package com.byebye.chapterTwo.domain.member.application.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/application/service/RetrieveMemberService;", "Lcom/byebye/chapterTwo/domain/member/application/port/in/RetrieveMemberUseCase;", "loadMemberPort", "Lcom/byebye/chapterTwo/domain/member/application/port/out/LoadMemberPort;", "jwtUtils", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;", "(Lcom/byebye/chapterTwo/domain/member/application/port/out/LoadMemberPort;Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;)V", "retrieveMember", "Lcom/byebye/chapterTwo/global/common/BaseResponse;", "Lcom/byebye/chapterTwo/domain/member/adapter/in/dto/res/RetrieveMemberResponse;", "chapterTwo"})
public class RetrieveMemberService implements com.byebye.chapterTwo.domain.member.application.port.in.RetrieveMemberUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort loadMemberPort = null;
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils = null;
    
    public RetrieveMemberService(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort loadMemberPort, @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<com.byebye.chapterTwo.domain.member.adapter.in.dto.res.RetrieveMemberResponse> retrieveMember() {
        return null;
    }
}