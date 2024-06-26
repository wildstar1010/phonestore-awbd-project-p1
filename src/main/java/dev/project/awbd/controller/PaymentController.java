package dev.project.awbd.controller;

import dev.project.awbd.model.Payment;
import dev.project.awbd.service.PaymentService;
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
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public String getAllPayments(@RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "10") int size,
                                 @RequestParam(defaultValue = "id") String sort,
                                 @RequestParam(defaultValue = "asc") String order,
                                 Model model) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(order), sort);
        Page<Payment> payments = paymentService.getAllPayments(pageable);
        model.addAttribute("payments", payments);
        return "payments/list";
    }

    @GetMapping("/{id}")
    public String getPaymentById(@PathVariable Long id, Model model) {
        Optional<Payment> payment = paymentService.getPaymentById(id);
        payment.ifPresent(value -> model.addAttribute("payment", value));
        return "payments/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("payment", new Payment());
        return "payments/create";
    }

    @PostMapping
    public String createPayment(@ModelAttribute Payment payment) {
        paymentService.savePayment(payment);
        return "redirect:/payments";
    }

    @DeleteMapping("/{id}")
    public String deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
        return "redirect:/payments";
    }
}
