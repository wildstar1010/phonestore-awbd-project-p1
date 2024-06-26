package dev.project.awbd.service;

import dev.project.awbd.model.Review;
import dev.project.awbd.repository.ReviewRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    private static final Logger logger = LoggerFactory.getLogger(ReviewService.class);

    @Autowired
    private ReviewRepository reviewRepository;

    public Page<Review> getAllReviews(Pageable pageable) {
        logger.info("Fetching all reviews");
        return reviewRepository.findAll(pageable);
    }

    public Optional<Review> getReviewById(Long id) {
        logger.info("Fetching review by id: {}", id);
        return reviewRepository.findById(id);
    }

    public Review saveReview(Review review) {
        logger.info("Saving review: {}", review);
        return reviewRepository.save(review);
    }

    public void deleteReview(Long id) {
        logger.info("Deleting review by id: {}", id);
        reviewRepository.deleteById(id);
    }
}
