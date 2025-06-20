package com.yatmk.test.persistence.repositories.local;

import org.springframework.stereotype.Repository;

import com.yatmk.test.persistence.models.local.SoftDeleteEntity;
import com.yatmk.test.persistence.repositories.config.BaseRepository;

@Repository
public interface SoftDeleteEntityRepository extends BaseRepository<SoftDeleteEntity> {

}
