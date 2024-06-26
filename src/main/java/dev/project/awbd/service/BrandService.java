package dev.project.awbd.service;

import dev.project.awbd.model.Brand;
import dev.project.awbd.repository.BrandRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {
    private static final Logger logger = LoggerFactory.getLogger(BrandService.class);

    @Autowired
    private BrandRepository brandRepository;

    public Page<Brand> getAllBrands(Pageable pageable) {
        logger.info("Fetching all brands");
        return brandRepository.findAll(pageable);
    }

    public Optional<Brand> getBrandById(Long id) {
        logger.info("Fetching brand by id: {}", id);
        return brandRepository.findById(id);
    }

    public Brand saveBrand(Brand brand) {
        logger.info("Saving brand: {}", brand);
        return brandRepository.save(brand);
    }

    public void deleteBrand(Long id) {
        logger.info("Deleting brand by id: {}", id);
        brandRepository.deleteById(id);
    }
}
