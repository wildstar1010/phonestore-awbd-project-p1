package dev.project.awbd.service;

import dev.project.awbd.model.Order;
import dev.project.awbd.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private OrderRepository orderRepository;

    public Page<Order> getAllOrders(Pageable pageable) {
        logger.info("Fetching all orders");
        return orderRepository.findAll(pageable);
    }

    public Optional<Order> getOrderById(Long id) {
        logger.info("Fetching order by id: {}", id);
        return orderRepository.findById(id);
    }

    public Order saveOrder(Order order) {
        logger.info("Saving order: {}", order);
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        logger.info("Deleting order by id: {}", id);
        orderRepository.deleteById(id);
    }
}
