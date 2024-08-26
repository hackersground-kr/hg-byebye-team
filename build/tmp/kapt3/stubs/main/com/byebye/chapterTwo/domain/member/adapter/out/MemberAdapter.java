package com.byebye.chapterTwo.domain.member.adapter.out;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/adapter/out/MemberAdapter;", "Lcom/byebye/chapterTwo/domain/member/application/port/out/SaveMemberPort;", "Lcom/byebye/chapterTwo/domain/member/application/port/out/LoadMemberPort;", "Lcom/byebye/chapterTwo/domain/member/application/port/out/ExistMemberPort;", "Lcom/byebye/chapterTwo/domain/member/application/port/out/DeleteMemberPort;", "memberRepository", "Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepository;", "memberMapper", "Lcom/byebye/chapterTwo/domain/member/adapter/out/mapper/MemberMapper;", "(Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepository;Lcom/byebye/chapterTwo/domain/member/adapter/out/mapper/MemberMapper;)V", "getMemberMapper", "()Lcom/byebye/chapterTwo/domain/member/adapter/out/mapper/MemberMapper;", "getMemberRepository", "()Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepository;", "deleteMember", "", "member", "Lcom/byebye/chapterTwo/domain/member/application/model/Member;", "existMemberWithName", "", "name", "", "loadMemberWithId", "id", "", "loadMemberWithName", "saveMember", "chapterTwo"})
public class MemberAdapter implements com.byebye.chapterTwo.domain.member.application.port.out.SaveMemberPort, com.byebye.chapterTwo.domain.member.application.port.out.LoadMemberPort, com.byebye.chapterTwo.domain.member.application.port.out.ExistMemberPort, com.byebye.chapterTwo.domain.member.application.port.out.DeleteMemberPort {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepository memberRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.member.adapter.out.mapper.MemberMapper memberMapper = null;
    
    public MemberAdapter(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepository memberRepository, @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.adapter.out.mapper.MemberMapper memberMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepository getMemberRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.domain.member.adapter.out.mapper.MemberMapper getMemberMapper() {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public void saveMember(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.application.model.Member member) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public void deleteMember(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.member.application.model.Member member) {
    }
    
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.domain.member.application.model.Member loadMemberWithId(long id) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.domain.member.application.model.Member loadMemberWithName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override()
    public boolean existMemberWithName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
}