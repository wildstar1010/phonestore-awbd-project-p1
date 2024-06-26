package dev.project.awbd.service;

import dev.project.awbd.model.Repair;
import dev.project.awbd.repository.RepairRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class RepairService {
    private static final Logger logger = LoggerFactory.getLogger(RepairService.class);

    @Autowired
    private RepairRepository repairRepository;

    public Page<Repair> getAllRepairs(Pageable pageable) {
        logger.info("Fetching all repairs");
        return repairRepository.findAll(pageable);
    }

    public Optional<Repair> getRepairById(Long id) {
        logger.info("Fetching repair by id: {}", id);
        return repairRepository.findById(id);
    }

    public Repair saveRepair(Repair repair) {
        logger.info("Saving repair: {}", repair);
        return repairRepository.save(repair);
    }

    public void deleteRepair(Long id) {
        logger.info("Deleting repair by id: {}", id);
        repairRepository.deleteById(id);
    }
}
