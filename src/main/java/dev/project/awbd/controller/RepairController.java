package dev.project.awbd.controller;

import dev.project.awbd.model.Repair;
import dev.project.awbd.service.RepairService;
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
@RequestMapping("/repairs")
public class RepairController {
    @Autowired
    private RepairService repairService;

    @GetMapping
    public String getAllRepairs(@RequestParam(defaultValue = "0") int page,
                                @RequestParam(defaultValue = "10") int size,
                                @RequestParam(defaultValue = "id") String sort,
                                @RequestParam(defaultValue = "asc") String order,
                                Model model) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<Repair> repairs = repairService.getAllRepairs(pageable);
        model.addAttribute("repairs", repairs);
        return "repairs/list";
    }

    @GetMapping("/{id}")
    public String getRepairById(@PathVariable Long id, Model model) {
        Optional<Repair> repair = repairService.getRepairById(id);
        repair.ifPresent(value -> model.addAttribute("repair", value));
        return "repairs/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("repair", new Repair());
        return "repairs/create";
    }

    @PostMapping
    public String createRepair(@ModelAttribute Repair repair) {
        repairService.saveRepair(repair);
        return "redirect:/repairs";
    }

    @DeleteMapping("/{id}")
    public String deleteRepair(@PathVariable Long id) {
        repairService.deleteRepair(id);
        return "redirect:/repairs";
    }
}