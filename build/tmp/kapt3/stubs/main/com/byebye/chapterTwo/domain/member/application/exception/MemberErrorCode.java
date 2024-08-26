package com.byebye.chapterTwo.domain.member.application.exception;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/application/exception/MemberErrorCode;", "", "Lcom/byebye/chapterTwo/global/auth/exception/CustomErrorCode;", "status", "Lorg/springframework/http/HttpStatus;", "message", "", "(Ljava/lang/String;ILorg/springframework/http/HttpStatus;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lorg/springframework/http/HttpStatus;", "MEMBER_NOT_FOUND", "MEMBER_ALREADY_EXIST", "MEMBER_NOT_SUFFICIENT", "MEMBER_ALREADY_SUFFICIENT", "chapterTwo"})
public enum MemberErrorCode implements com.byebye.chapterTwo.global.auth.exception.CustomErrorCode {
    /*public static final*/ MEMBER_NOT_FOUND /* = new MEMBER_NOT_FOUND(null, null) */,
    /*public static final*/ MEMBER_ALREADY_EXIST /* = new MEMBER_ALREADY_EXIST(null, null) */,
    /*public static final*/ MEMBER_NOT_SUFFICIENT /* = new MEMBER_NOT_SUFFICIENT(null, null) */,
    /*public static final*/ MEMBER_ALREADY_SUFFICIENT /* = new MEMBER_ALREADY_SUFFICIENT(null, null) */;
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.http.HttpStatus status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    
    MemberErrorCode(org.springframework.http.HttpStatus status, java.lang.String message) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.HttpStatus getStatus() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.byebye.chapterTwo.domain.member.application.exception.MemberErrorCode> getEntries() {
        return null;
    }
}