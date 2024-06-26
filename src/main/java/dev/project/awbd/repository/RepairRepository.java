package dev.project.awbd.repository;

import dev.project.awbd.model.Repair;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RepairRepository extends JpaRepository<Repair, Long>, JpaSpecificationExecutor<Repair> {
    Page<Repair> findAll(Pageable pageable);
}
