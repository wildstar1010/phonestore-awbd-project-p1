package dev.project.awbd.controller;

import dev.project.awbd.model.Customer;
import dev.project.awbd.service.CustomerService;
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
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String getAllCustomers(@RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "10") int size,
                                  @RequestParam(defaultValue = "id") String sort,
                                  @RequestParam(defaultValue = "asc") String order,
                                  Model model) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<Customer> customers = customerService.getAllCustomers(pageable);
        model.addAttribute("customers", customers);
        return "customers/list";
    }

    @GetMapping("/{id}")
    public String getCustomerById(@PathVariable Long id, Model model) {
        Optional<Customer> customer = customerService.getCustomerById(id);
        customer.ifPresent(value -> model.addAttribute("customer", value));
        return "customers/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customers/create";
    }

    @PostMapping
    public String createCustomer(@ModelAttribute Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customers";
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers";
    }
}
