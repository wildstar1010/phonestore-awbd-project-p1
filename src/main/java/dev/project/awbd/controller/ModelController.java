package dev.project.awbd.controller;

import dev.project.awbd.service.ModelService;
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
@RequestMapping("/models")
public class ModelController {
    @Autowired
    private ModelService modelService;

    @GetMapping
    public String getAllModels(@RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "10") int size,
                               @RequestParam(defaultValue = "id") String sort,
                               @RequestParam(defaultValue = "asc") String order,
                               Model uiModel) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<dev.project.awbd.model.Model> models = modelService.getAllModels(pageable);
        uiModel.addAttribute("models", models);
        return "models/list";
    }

    @GetMapping("/{id}")
    public String getModelById(@PathVariable Long id, Model uiModel) {
        Optional<dev.project.awbd.model.Model> modelEntity = modelService.getModelById(id);
        modelEntity.ifPresent(value -> uiModel.addAttribute("model", value));
        return "models/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model uiModel) {
        uiModel.addAttribute("modelEntity", new dev.project.awbd.model.Model());
        return "models/create";
    }

    @PostMapping
    public String createModel(@ModelAttribute dev.project.awbd.model.Model modelEntity) {
        modelService.saveModel(modelEntity);
        return "redirect:/models";
    }

    @DeleteMapping("/{id}")
    public String deleteModel(@PathVariable Long id) {
        modelService.deleteModel(id);
        return "redirect:/models";
    }
}
