package dev.project.awbd.service;

import dev.project.awbd.model.Model;
import dev.project.awbd.repository.ModelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class ModelService {
    private static final Logger logger = LoggerFactory.getLogger(ModelService.class);

    @Autowired
    private ModelRepository modelRepository;

    public Page<Model> getAllModels(Pageable pageable) {
        logger.info("Fetching all models");
        return modelRepository.findAll(pageable);
    }

    public Optional<Model> getModelById(Long id) {
        logger.info("Fetching model by id: {}", id);
        return modelRepository.findById(id);
    }

    public Model saveModel(Model model) {
        logger.info("Saving model: {}", model);
        return modelRepository.save(model);
    }

    public void deleteModel(Long id) {
        logger.info("Deleting model by id: {}", id);
        modelRepository.deleteById(id);
    }
}
