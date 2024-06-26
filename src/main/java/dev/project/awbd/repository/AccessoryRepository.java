package dev.project.awbd.repository;

import dev.project.awbd.model.Accessory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccessoryRepository extends JpaRepository<Accessory, Long>, JpaSpecificationExecutor<Accessory> {
    Page<Accessory> findAll(Pageable pageable);
}
