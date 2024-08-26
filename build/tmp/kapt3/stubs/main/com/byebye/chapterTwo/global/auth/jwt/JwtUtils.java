package com.byebye.chapterTwo.global.auth.jwt;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0012J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;", "", "jwtProperties", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtProperties;", "userDetailsService", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "(Lcom/byebye/chapterTwo/global/auth/jwt/JwtProperties;Lorg/springframework/security/core/userdetails/UserDetailsService;)V", "secretKey", "Ljavax/crypto/SecretKey;", "checkTokenInfo", "Lcom/byebye/chapterTwo/global/auth/jwt/exception/type/JwtErrorType;", "token", "", "createToken", "member", "Lcom/byebye/chapterTwo/domain/member/application/model/Member;", "tokenExpired", "", "generate", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtInfo;", "getAuthentication", "Lorg/springframework/security/core/Authentication;", "getMember", "getToken", "getUsername", "refreshToken", "chapterTwo"})
public class JwtUtils {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.global.auth.jwt.JwtProperties jwtProperties = null;
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.security.core.userdetails.UserDetailsService userDetailsService = null;
    @org.jetbrains.annotations.NotNull()
    private final javax.crypto.SecretKey secretKey = null;
    
    public JwtUtils(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.global.auth.jwt.JwtProperties jwtProperties, @org.jetbrains.annotations.NotNull()
    org.springframework.security.core.userdetails.UserDetailsService userDetailsService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.domain.member.application.model.Member getMember() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.auth.jwt.exception.type.JwtErrorType checkTokenInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.auth.jwt.JwtInfo generate(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.application.model.Member member) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.core.Authentication getAuthentication(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String refreshToken(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.application.model.Member member) {
        return null;
    }
    
    private java.lang.String createToken(com.byebye.chapterTwo.domain.member.application.model.Member member, long tokenExpired) {
        return null;
    }
}