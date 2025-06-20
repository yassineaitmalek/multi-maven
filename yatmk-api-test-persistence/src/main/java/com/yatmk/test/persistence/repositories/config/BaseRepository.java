package com.yatmk.test.persistence.repositories.config;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T> extends AbstractRepository<T, Long> {

}