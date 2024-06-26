package dev.project.awbd.controller;

import dev.project.awbd.model.Review;
import dev.project.awbd.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public String getAllReviews(@RequestParam(defaultValue = "0") int page,
                                @RequestParam(defaultValue = "10") int size,
                                @RequestParam(defaultValue = "id") String sort,
                                @RequestParam(defaultValue = "asc") String order,
                                Model model) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<Review> reviews = reviewService.getAllReviews(pageable);
        model.addAttribute("reviews", reviews);
        return "reviews/list";
    }

    @GetMapping("/{id}")
    public String getReviewById(@PathVariable Long id, Model model) {
        Optional<Review> review = reviewService.getReviewById(id);
        review.ifPresent(value -> model.addAttribute("review", value));
        return "reviews/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("review", new Review());
        return "reviews/create";
    }

    @PostMapping
    public String createReview(@ModelAttribute Review review) {
        reviewService.saveReview(review);
        return "redirect:/reviews";
    }

    @DeleteMapping("/{id}")
    public String deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
        return "redirect:/reviews";
    }
}
