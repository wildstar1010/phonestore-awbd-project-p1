package dev.project.awbd.controller;

import dev.project.awbd.model.Rental;
import dev.project.awbd.service.RentalService;
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
@RequestMapping("/rentals")
public class RentalController {
    @Autowired
    private RentalService rentalService;

    @GetMapping
    public String getAllRentals(@RequestParam(defaultValue = "0") int page,
                                @RequestParam(defaultValue = "10") int size,
                                @RequestParam(defaultValue = "id") String sort,
                                @RequestParam(defaultValue = "asc") String order,
                                Model model) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<Rental> rentals = rentalService.getAllRentals(pageable);
        model.addAttribute("rentals", rentals);
        return "rentals/list";
    }

    @GetMapping("/{id}")
    public String getRentalById(@PathVariable Long id, Model model) {
        Optional<Rental> rental = rentalService.getRentalById(id);
        rental.ifPresent(value -> model.addAttribute("rental", value));
        return "rentals/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("rental", new Rental());
        return "rentals/create";
    }

    @PostMapping
    public String createRental(@ModelAttribute Rental rental) {
        rentalService.saveRental(rental);
        return "redirect:/rentals";
    }

    @DeleteMapping("/{id}")
    public String deleteRental(@PathVariable Long id) {
        rentalService.deleteRental(id);
        return "redirect:/rentals";
    }
}