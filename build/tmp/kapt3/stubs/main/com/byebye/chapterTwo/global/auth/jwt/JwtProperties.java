package com.byebye.chapterTwo.global.auth.jwt;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0097\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/byebye/chapterTwo/global/auth/jwt/JwtProperties;", "", "secretKey", "", "accessExpired", "", "refreshExpired", "(Ljava/lang/String;JJ)V", "getAccessExpired", "()J", "getRefreshExpired", "getSecretKey", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "chapterTwo"})
public class JwtProperties {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String secretKey = null;
    private final long accessExpired = 0L;
    private final long refreshExpired = 0L;
    
    public JwtProperties(@org.springframework.beans.factory.annotation.Value(value = "${spring.application.jwt.secretKey}")
    @org.jetbrains.annotations.NotNull()
    java.lang.String secretKey, @org.springframework.beans.factory.annotation.Value(value = "${spring.application.jwt.expiration}")
    long accessExpired, @org.springframework.beans.factory.annotation.Value(value = "${spring.application.jwt.refreshExpiration}")
    long refreshExpired) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getSecretKey() {
        return null;
    }
    
    public long getAccessExpired() {
        return 0L;
    }
    
    public long getRefreshExpired() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.byebye.chapterTwo.global.auth.jwt.JwtProperties copy(@org.springframework.beans.factory.annotation.Value(value = "${spring.application.jwt.secretKey}")
    @org.jetbrains.annotations.NotNull()
    java.lang.String secretKey, @org.springframework.beans.factory.annotation.Value(value = "${spring.application.jwt.expiration}")
    long accessExpired, @org.springframework.beans.factory.annotation.Value(value = "${spring.application.jwt.refreshExpiration}")
    long refreshExpired) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}