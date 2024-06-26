package dev.project.awbd.repository;

import dev.project.awbd.model.Model;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ModelRepository extends JpaRepository<Model, Long>, JpaSpecificationExecutor<Model> {
    Page<Model> findAll(Pageable pageable);
}
