package dev.project.awbd.controller;

import dev.project.awbd.model.Store;
import dev.project.awbd.service.StoreService;
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
@RequestMapping("/stores")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @GetMapping
    public String getAllStores(@RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "10") int size,
                               @RequestParam(defaultValue = "id") String sort,
                               @RequestParam(defaultValue = "asc") String order,
                               Model model) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<Store> stores = storeService.getAllStores(pageable);
        model.addAttribute("stores", stores);
        return "stores/list";
    }

    @GetMapping("/{id}")
    public String getStoreById(@PathVariable Long id, Model model) {
        Optional<Store> store = storeService.getStoreById(id);
        store.ifPresent(value -> model.addAttribute("store", value));
        return "stores/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("store", new Store());
        return "stores/create";
    }

    @PostMapping
    public String createStore(@ModelAttribute Store store) {
        storeService.saveStore(store);
        return "redirect:/stores";
    }

    @DeleteMapping("/{id}")
    public String deleteStore(@PathVariable Long id) {
        storeService.deleteStore(id);
        return "redirect:/stores";
    }
}
