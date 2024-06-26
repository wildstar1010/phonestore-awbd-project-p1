package dev.project.awbd.controller;

import dev.project.awbd.model.Stock;
import dev.project.awbd.service.StockService;
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
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping
    public String getAllStocks(@RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "10") int size,
                               @RequestParam(defaultValue = "id") String sort,
                               @RequestParam(defaultValue = "asc") String order,
                               Model model) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<Stock> stocks = stockService.getAllStocks(pageable);
        model.addAttribute("stocks", stocks);
        return "stocks/list";
    }

    @GetMapping("/{id}")
    public String getStockById(@PathVariable Long id, Model model) {
        Optional<Stock> stock = stockService.getStockById(id);
        stock.ifPresent(value -> model.addAttribute("stock", value));
        return "stocks/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("stock", new Stock());
        return "stocks/create";
    }

    @PostMapping
    public String createStock(@ModelAttribute Stock stock) {
        stockService.saveStock(stock);
        return "redirect:/stocks";
    }

    @DeleteMapping("/{id}")
    public String deleteStock(@PathVariable Long id) {
        stockService.deleteStock(id);
        return "redirect:/stocks";
    }
}
