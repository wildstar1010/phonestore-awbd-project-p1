package dev.project.awbd.service;

import dev.project.awbd.model.Store;
import dev.project.awbd.repository.StoreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {
    private static final Logger logger = LoggerFactory.getLogger(StoreService.class);

    @Autowired
    private StoreRepository storeRepository;

    public Page<Store> getAllStores(Pageable pageable) {
        logger.info("Fetching all stores");
        return storeRepository.findAll(pageable);
    }

    public Optional<Store> getStoreById(Long id) {
        logger.info("Fetching store by id: {}", id);
        return storeRepository.findById(id);
    }

    public Store saveStore(Store store) {
        logger.info("Saving store: {}", store);
        return storeRepository.save(store);
    }

    public void deleteStore(Long id) {
        logger.info("Deleting store by id: {}", id);
        storeRepository.deleteById(id);
    }
}