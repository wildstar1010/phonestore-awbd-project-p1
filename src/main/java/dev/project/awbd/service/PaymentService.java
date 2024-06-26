package dev.project.awbd.service;

import dev.project.awbd.model.Payment;
import dev.project.awbd.repository.PaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    private static final Logger logger = LoggerFactory.getLogger(PaymentService.class);

    @Autowired
    private PaymentRepository paymentRepository;

    public Page<Payment> getAllPayments(Pageable pageable) {
        logger.info("Fetching all payments");
        return paymentRepository.findAll(pageable);
    }

    public Optional<Payment> getPaymentById(Long id) {
        logger.info("Fetching payment by id: {}", id);
        return paymentRepository.findById(id);
    }

    public Payment savePayment(Payment payment) {
        logger.info("Saving payment: {}", payment);
        return paymentRepository.save(payment);
    }

    public void deletePayment(Long id) {
        logger.info("Deleting payment by id: {}", id);
        paymentRepository.deleteById(id);
    }
}
