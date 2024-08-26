package com.byebye.chapterTwo.domain.member.adapter.out.repository;

@org.springframework.stereotype.Repository()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepositoryCustomImpl;", "Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepositoryCustom;", "jpaQueryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "(Lcom/querydsl/jpa/impl/JPAQueryFactory;)V", "existsByName", "", "name", "", "findByName", "Lcom/byebye/chapterTwo/domain/member/adapter/out/entity/MemberEntity;", "chapterTwo"})
public class MemberRepositoryCustomImpl implements com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepositoryCustom {
    @org.jetbrains.annotations.NotNull()
    private final com.querydsl.jpa.impl.JPAQueryFactory jpaQueryFactory = null;
    
    public MemberRepositoryCustomImpl(@org.jetbrains.annotations.NotNull()
    com.querydsl.jpa.impl.JPAQueryFactory jpaQueryFactory) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.byebye.chapterTwo.domain.member.adapter.out.entity.MemberEntity findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    public boolean existsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
}