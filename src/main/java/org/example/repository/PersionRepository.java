package org.example.repository;

import org.example.entity.PersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersionRepository extends CrudRepository<PersionEntity,Long> {
}
