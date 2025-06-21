package com.yatmk.test.persistence.repositories.local.dsl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yatmk.test.persistence.config.LocalDB;
import com.yatmk.test.persistence.models.local.SoftDeleteEntity;
import com.yatmk.test.persistence.repositories.config.BaseDSLRepository;

@Repository
public class SoftDeleteEntityDSLRepository extends BaseDSLRepository<SoftDeleteEntity> {

  public SoftDeleteEntityDSLRepository(@Qualifier(LocalDB.EMF) EntityManager entityManager) {
    super(SoftDeleteEntity.class, entityManager);

  }

}