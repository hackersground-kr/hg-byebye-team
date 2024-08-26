package com.byebye.chapterTwo.global.config;

@org.springframework.context.annotation.Configuration()
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/byebye/chapterTwo/global/config/SecurityConfig;", "", "jwtUtils", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "corsConfigurationSource", "Lorg/springframework/web/cors/CorsConfigurationSource;", "filterChain", "Lorg/springframework/security/web/SecurityFilterChain;", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "chapterTwo"})
public class SecurityConfig {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    public SecurityConfig(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.web.SecurityFilterChain filterChain(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.web.cors.CorsConfigurationSource corsConfigurationSource() {
        return null;
    }
}