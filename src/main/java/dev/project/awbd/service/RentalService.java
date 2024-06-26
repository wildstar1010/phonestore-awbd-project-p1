package dev.project.awbd.service;

import dev.project.awbd.model.Rental;
import dev.project.awbd.repository.RentalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class RentalService {
    private static final Logger logger = LoggerFactory.getLogger(RentalService.class);

    @Autowired
    private RentalRepository rentalRepository;

    public Page<Rental> getAllRentals(Pageable pageable) {
        logger.info("Fetching all rentals");
        return rentalRepository.findAll(pageable);
    }

    public Optional<Rental> getRentalById(Long id) {
        logger.info("Fetching rental by id: {}", id);
        return rentalRepository.findById(id);
    }

    public Rental saveRental(Rental rental) {
        logger.info("Saving rental: {}", rental);
        return rentalRepository.save(rental);
    }

    public void deleteRental(Long id) {
        logger.info("Deleting rental by id: {}", id);
        rentalRepository.deleteById(id);
    }
}
