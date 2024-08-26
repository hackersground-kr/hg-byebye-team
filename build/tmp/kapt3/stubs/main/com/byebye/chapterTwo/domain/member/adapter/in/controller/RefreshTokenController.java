package com.byebye.chapterTwo.domain.member.adapter.in.controller;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/member"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/adapter/in/controller/RefreshTokenController;", "", "refreshTokenUseCase", "Lcom/byebye/chapterTwo/domain/member/application/port/in/RefreshTokenUseCase;", "(Lcom/byebye/chapterTwo/domain/member/application/port/in/RefreshTokenUseCase;)V", "refreshToken", "Lcom/byebye/chapterTwo/global/common/BaseResponse;", "", "token", "chapterTwo"})
public class RefreshTokenController {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.application.port.in.RefreshTokenUseCase refreshTokenUseCase = null;
    
    public RefreshTokenController(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.application.port.in.RefreshTokenUseCase refreshTokenUseCase) {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/refresh"})
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.lang.String> refreshToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
}