package dev.project.awbd.controller;

import dev.project.awbd.exception.ResourceNotFoundException;
import dev.project.awbd.model.Phone;
import dev.project.awbd.service.PhoneService;
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
@RequestMapping("/phones")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping
    public String getAllPhones(@RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "10") int size,
                               @RequestParam(defaultValue = "id") String sort,
                               @RequestParam(defaultValue = "asc") String order,
                               Model model) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<Phone> phones = phoneService.getAllPhones(pageable);
        model.addAttribute("phones", phones);
        return "phones/list";
    }

    @GetMapping("/{id}")
    public String getPhoneById(@PathVariable Long id, Model model) {
        Optional<Phone> phone = phoneService.getPhoneById(id);
        if (phone.isPresent()) {
            model.addAttribute("phone", phone.get());
            return "phones/detail";
        } else {
            throw new ResourceNotFoundException("Phone not found with id: " + id);
        }
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("phone", new Phone());
        return "phones/create";
    }

    @PostMapping
    public String createPhone(@ModelAttribute Phone phone) {
        phoneService.savePhone(phone);
        return "redirect:/phones";
    }

    @DeleteMapping("/{id}")
    public String deletePhone(@PathVariable Long id) {
        phoneService.deletePhone(id);
        return "redirect:/phones";
    }
    @ExceptionHandler(ResourceNotFoundException.class)
    public String handleResourceNotFoundException(ResourceNotFoundException ex, Model model) {
        model.addAttribute("error", ex.getMessage());
        return "error/404";
    }
}
