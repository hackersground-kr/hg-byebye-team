package com.byebye.chapterTwo.global.auth.exception;

@org.springframework.web.bind.annotation.RestControllerAdvice()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0007"}, d2 = {"Lcom/byebye/chapterTwo/global/auth/exception/CustomExceptionHandler;", "", "()V", "handleCustomException", "Lorg/springframework/http/ResponseEntity;", "customException", "Lcom/byebye/chapterTwo/global/auth/exception/CustomException;", "chapterTwo"})
public class CustomExceptionHandler {
    
    public CustomExceptionHandler() {
        super();
    }
    
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {com.byebye.chapterTwo.global.auth.exception.CustomException.class})
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<java.lang.Object> handleCustomException(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.global.auth.exception.CustomException customException) {
        return null;
    }
}