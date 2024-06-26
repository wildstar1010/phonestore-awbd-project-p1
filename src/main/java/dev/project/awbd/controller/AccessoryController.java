package dev.project.awbd.controller;

import dev.project.awbd.model.Accessory;
import dev.project.awbd.service.AccessoryService;
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
@RequestMapping("/accessories")
public class AccessoryController {
    @Autowired
    private AccessoryService accessoryService;

    @GetMapping
    public String getAllAccessories(@RequestParam(defaultValue = "0") int page,
                                    @RequestParam(defaultValue = "10") int size,
                                    @RequestParam(defaultValue = "id") String sort,
                                    @RequestParam(defaultValue = "asc") String order,
                                    Model model) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<Accessory> accessories = accessoryService.getAllAccessories(pageable);
        model.addAttribute("accessories", accessories);
        return "accessories/list";
    }

    @GetMapping("/{id}")
    public String getAccessoryById(@PathVariable Long id, Model model) {
        Optional<Accessory> accessory = accessoryService.getAccessoryById(id);
        accessory.ifPresent(value -> model.addAttribute("accessory", value));
        return "accessories/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("accessory", new Accessory());
        return "accessories/create";
    }

    @PostMapping
    public String createAccessory(@ModelAttribute Accessory accessory) {
        accessoryService.saveAccessory(accessory);
        return "redirect:/accessories";
    }

    @DeleteMapping("/{id}")
    public String deleteAccessory(@PathVariable Long id) {
        accessoryService.deleteAccessory(id);
        return "redirect:/accessories";
    }
}
