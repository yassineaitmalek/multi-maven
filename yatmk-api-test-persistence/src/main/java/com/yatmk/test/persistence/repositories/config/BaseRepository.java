package com.yatmk.test.persistence.repositories.config;

import org.springframework.data.repository.NoRepositoryBean;

import com.yatmk.test.persistence.models.config.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends AbstractRepository<T, Long> {

}