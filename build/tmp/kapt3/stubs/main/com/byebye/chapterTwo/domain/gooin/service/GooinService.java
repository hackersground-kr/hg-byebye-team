package com.byebye.chapterTwo.domain.gooin.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/byebye/chapterTwo/domain/gooin/service/GooinService;", "", "gooinRepository", "Lcom/byebye/chapterTwo/domain/gooin/repository/GooinRepository;", "jwtUtils", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;", "(Lcom/byebye/chapterTwo/domain/gooin/repository/GooinRepository;Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;)V", "saveGooin", "", "dto", "Lcom/byebye/chapterTwo/domain/gooin/dto/req/AddGooinRequest;", "chapterTwo"})
public class GooinService {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.gooin.repository.GooinRepository gooinRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils = null;
    
    public GooinService(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.gooin.repository.GooinRepository gooinRepository, @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils) {
        super();
    }
    
    public void saveGooin(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.gooin.dto.req.AddGooinRequest dto) {
    }
}