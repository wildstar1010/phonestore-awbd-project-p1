package dev.project.awbd.service;

import dev.project.awbd.model.Stock;
import dev.project.awbd.repository.StockRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {
    private static final Logger logger = LoggerFactory.getLogger(StockService.class);

    @Autowired
    private StockRepository stockRepository;

    public Page<Stock> getAllStocks(Pageable pageable) {
        logger.info("Fetching all stocks");
        return stockRepository.findAll(pageable);
    }

    public Optional<Stock> getStockById(Long id) {
        logger.info("Fetching stock by id: {}", id);
        return stockRepository.findById(id);
    }

    public Stock saveStock(Stock stock) {
        logger.info("Saving stock: {}", stock);
        return stockRepository.save(stock);
    }

    public void deleteStock(Long id) {
        logger.info("Deleting stock by id: {}", id);
        stockRepository.deleteById(id);
    }
}
