package dev.project.awbd.service;

import dev.project.awbd.model.Phone;
import dev.project.awbd.repository.PhoneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneService {
    private static final Logger logger = LoggerFactory.getLogger(PhoneService.class);

    @Autowired
    private PhoneRepository phoneRepository;

    public Page<Phone> getAllPhones(Pageable pageable) {
        logger.info("Fetching all phones");
        return phoneRepository.findAll(pageable);
    }

    public Optional<Phone> getPhoneById(Long id) {
        logger.info("Fetching phone by id: {}", id);
        return phoneRepository.findById(id);
    }

    public Phone savePhone(Phone phone) {
        logger.info("Saving phone: {}", phone);
        return phoneRepository.save(phone);
    }

    public void deletePhone(Long id) {
        logger.info("Deleting phone by id: {}", id);
        phoneRepository.deleteById(id);
    }
}
