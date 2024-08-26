package com.byebye.chapterTwo.domain.member.adapter.out.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepositoryCustom;", "", "existsByName", "", "name", "", "findByName", "Lcom/byebye/chapterTwo/domain/member/adapter/out/entity/MemberEntity;", "chapterTwo"})
public abstract interface MemberRepositoryCustom {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.byebye.chapterTwo.domain.member.adapter.out.entity.MemberEntity findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract boolean existsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
}