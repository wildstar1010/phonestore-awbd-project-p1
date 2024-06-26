package dev.project.awbd.service;

import dev.project.awbd.model.Customer;
import dev.project.awbd.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private CustomerRepository customerRepository;

    public Page<Customer> getAllCustomers(Pageable pageable) {
        logger.info("Fetching all customers");
        return customerRepository.findAll(pageable);
    }

    public Optional<Customer> getCustomerById(Long id) {
        logger.info("Fetching customer by id: {}", id);
        return customerRepository.findById(id);
    }

    public Customer saveCustomer(Customer customer) {
        logger.info("Saving customer: {}", customer);
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        logger.info("Deleting customer by id: {}", id);
        customerRepository.deleteById(id);
    }
}
