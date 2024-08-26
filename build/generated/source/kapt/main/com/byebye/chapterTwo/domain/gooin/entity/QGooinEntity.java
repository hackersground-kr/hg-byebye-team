package com.byebye.chapterTwo.domain.gooin.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGooinEntity is a Querydsl query type for GooinEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGooinEntity extends EntityPathBase<GooinEntity> {

    private static final long serialVersionUID = 271581058L;

    public static final QGooinEntity gooinEntity = new QGooinEntity("gooinEntity");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath title = createString("title");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QGooinEntity(String variable) {
        super(GooinEntity.class, forVariable(variable));
    }

    public QGooinEntity(Path<GooinEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGooinEntity(PathMetadata metadata) {
        super(GooinEntity.class, metadata);
    }

}

