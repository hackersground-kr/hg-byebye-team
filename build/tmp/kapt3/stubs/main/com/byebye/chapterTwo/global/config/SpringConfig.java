package com.byebye.chapterTwo.global.config;

@org.springframework.context.annotation.Configuration()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\bH\u0017\u00a8\u0006\t"}, d2 = {"Lcom/byebye/chapterTwo/global/config/SpringConfig;", "", "()V", "bCryptPasswordEncoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "restTemplate", "Lorg/springframework/web/client/RestTemplate;", "chapterTwo"})
public class SpringConfig {
    
    public SpringConfig() {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public com.fasterxml.jackson.databind.ObjectMapper objectMapper() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.web.client.RestTemplate restTemplate() {
        return null;
    }
}