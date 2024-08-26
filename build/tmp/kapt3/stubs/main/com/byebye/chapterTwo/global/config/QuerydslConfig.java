package com.byebye.chapterTwo.global.config;

@org.springframework.context.annotation.Configuration()
@org.springframework.transaction.annotation.EnableTransactionManagement()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/byebye/chapterTwo/global/config/QuerydslConfig;", "", "()V", "entityManager", "Ljakarta/persistence/EntityManager;", "getEntityManager", "()Ljakarta/persistence/EntityManager;", "setEntityManager", "(Ljakarta/persistence/EntityManager;)V", "jpaQueryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "chapterTwo"})
public class QuerydslConfig {
    @jakarta.persistence.PersistenceContext()
    public jakarta.persistence.EntityManager entityManager;
    
    public QuerydslConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public jakarta.persistence.EntityManager getEntityManager() {
        return null;
    }
    
    public void setEntityManager(@org.jetbrains.annotations.NotNull()
    jakarta.persistence.EntityManager p0) {
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public com.querydsl.jpa.impl.JPAQueryFactory jpaQueryFactory() {
        return null;
    }
}