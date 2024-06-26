package dev.project.awbd.service;

import dev.project.awbd.model.Accessory;
import dev.project.awbd.repository.AccessoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.List;
import java.util.Optional;

@Service
public class AccessoryService {
    private static final Logger logger = LoggerFactory.getLogger(AccessoryService.class);

    @Autowired
    private AccessoryRepository accessoryRepository;

    public Page<Accessory> getAllAccessories(Pageable pageable) {
        logger.info("Fetching all accessories");
        return accessoryRepository.findAll(pageable);
    }

    public Optional<Accessory> getAccessoryById(Long id) {
        logger.info("Fetching accessory by id: {}", id);
        return accessoryRepository.findById(id);
    }

    public Accessory saveAccessory(Accessory accessory) {
        logger.info("Saving accessory: {}", accessory);
        return accessoryRepository.save(accessory);
    }

    public void deleteAccessory(Long id) {
        logger.info("Deleting accessory by id: {}", id);
        accessoryRepository.deleteById(id);
    }
}
