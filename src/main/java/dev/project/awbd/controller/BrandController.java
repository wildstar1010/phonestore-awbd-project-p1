package dev.project.awbd.controller;

import dev.project.awbd.model.Brand;
import dev.project.awbd.service.BrandService;
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
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping
    public String getAllBrands(@RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "10") int size,
                               @RequestParam(defaultValue = "id") String sort,
                               @RequestParam(defaultValue = "asc") String order,
                               Model model) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<Brand> brands = brandService.getAllBrands(pageable);
        model.addAttribute("brands", brands);
        return "brands/list";
    }

    @GetMapping("/{id}")
    public String getBrandById(@PathVariable Long id, Model model) {
        Optional<Brand> brand = brandService.getBrandById(id);
        brand.ifPresent(value -> model.addAttribute("brand", value));
        return "brands/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("brand", new Brand());
        return "brands/create";
    }

    @PostMapping
    public String createBrand(@ModelAttribute Brand brand) {
        brandService.saveBrand(brand);
        return "redirect:/brands";
    }

    @DeleteMapping("/{id}")
    public String deleteBrand(@PathVariable Long id) {
        brandService.deleteBrand(id);
        return "redirect:/brands";
    }
}
