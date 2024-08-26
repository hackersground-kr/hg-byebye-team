package com.byebye.chapterTwo.global.auth.jwt;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/byebye/chapterTwo/global/auth/jwt/JwtUserDetails;", "Lorg/springframework/security/core/userdetails/UserDetails;", "member", "Lcom/byebye/chapterTwo/domain/member/application/model/Member;", "(Lcom/byebye/chapterTwo/domain/member/application/model/Member;)V", "id", "", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMember", "()Lcom/byebye/chapterTwo/domain/member/application/model/Member;", "getAuthorities", "", "Lorg/springframework/security/core/GrantedAuthority;", "getPassword", "", "getUsername", "isAccountNonExpired", "", "isAccountNonLocked", "isCredentialsNonExpired", "isEnabled", "chapterTwo"})
public final class JwtUserDetails implements org.springframework.security.core.userdetails.UserDetails {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.application.model.Member member = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    
    public JwtUserDetails(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.application.model.Member member) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.byebye.chapterTwo.domain.member.application.model.Member getMember() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPassword() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getUsername() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isAccountNonExpired() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isAccountNonLocked() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isCredentialsNonExpired() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isEnabled() {
        return false;
    }
}