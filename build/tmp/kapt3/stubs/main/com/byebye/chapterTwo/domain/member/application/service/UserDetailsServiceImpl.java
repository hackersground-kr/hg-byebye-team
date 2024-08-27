package com.byebye.chapterTwo.domain.member.application.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/application/service/UserDetailsServiceImpl;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "memberRepository", "Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepository;", "memberMapper", "Lcom/byebye/chapterTwo/domain/member/adapter/out/mapper/MemberMapper;", "(Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepository;Lcom/byebye/chapterTwo/domain/member/adapter/out/mapper/MemberMapper;)V", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "username", "", "chapterTwo"})
public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepository memberRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.adapter.out.mapper.MemberMapper memberMapper = null;
    
    public UserDetailsServiceImpl(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepository memberRepository, @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.out.mapper.MemberMapper memberMapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
}