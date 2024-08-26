package com.byebye.chapterTwo.global.auth.jwt.exception.type;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/byebye/chapterTwo/global/auth/jwt/exception/type/JwtErrorType;", "", "(Ljava/lang/String;I)V", "OK", "ExpiredJwtException", "SignatureException", "MalformedJwtException", "UnsupportedJwtException", "IllegalArgumentException", "UNKNOWN_EXCEPTION", "chapterTwo"})
public enum JwtErrorType {
    /*public static final*/ OK /* = new OK() */,
    /*public static final*/ ExpiredJwtException /* = new ExpiredJwtException() */,
    /*public static final*/ SignatureException /* = new SignatureException() */,
    /*public static final*/ MalformedJwtException /* = new MalformedJwtException() */,
    /*public static final*/ UnsupportedJwtException /* = new UnsupportedJwtException() */,
    /*public static final*/ IllegalArgumentException /* = new IllegalArgumentException() */,
    /*public static final*/ UNKNOWN_EXCEPTION /* = new UNKNOWN_EXCEPTION() */;
    
    JwtErrorType() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.byebye.chapterTwo.global.auth.jwt.exception.type.JwtErrorType> getEntries() {
        return null;
    }
}