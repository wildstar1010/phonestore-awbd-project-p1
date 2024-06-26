package dev.project.awbd.service;

import dev.project.awbd.model.Employee;
import dev.project.awbd.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    public Page<Employee> getAllEmployees(Pageable pageable) {
        logger.info("Fetching all employees");
        return employeeRepository.findAll(pageable);
    }

    public Optional<Employee> getEmployeeById(Long id) {
        logger.info("Fetching employee by id: {}", id);
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        logger.info("Saving employee: {}", employee);
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        logger.info("Deleting employee by id: {}", id);
        employeeRepository.deleteById(id);
    }
}
