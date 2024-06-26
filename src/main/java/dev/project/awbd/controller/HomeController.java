package dev.project.awbd.controller;

import dev.project.awbd.model.*;
import dev.project.awbd.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private AccessoryRepository accessoryRepository;
    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelRepository modelRepository;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private PhoneRepository phoneRepository;
    @Autowired
    private OrderRepository purchaseOrderRepository;
    @Autowired
    private RentalRepository rentalRepository;
    @Autowired
    private RepairRepository repairRepository;
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private StockRepository stockRepository;
    @Autowired
    private StoreRepository storeRepository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("message", "Index Page");
        return "index";  // Corresponds to index.html
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("message", "Login Page");
        return "login";  // Corresponds to login.html
    }

    @GetMapping("/error")
    public String errorPage(Model model) {
        model.addAttribute("message", "An error occurred");
        return "error";  // Corresponds to error.html
    }

    @GetMapping("/h2-console")
    public String h2Console() {
        // Returning the error page for now
        return "error";
    }

    @GetMapping("/connect-mysql")
    public String connectMysql() {
        // Returning the error page for now
        return "error";
    }

    @GetMapping("/view-data")
    public String viewData() {
        // Returning the error page for now
        return "error";
    }

    @GetMapping("/data")
    public String data(Model model) {
        List<Accessory> accessories = accessoryRepository.findAll();
        List<Brand> brands = brandRepository.findAll();
        List<Customer> customers = customerRepository.findAll();
        List<Employee> employees = employeeRepository.findAll();
        List<dev.project.awbd.model.Model> models = modelRepository.findAll();
        List<Payment> payments = paymentRepository.findAll();
        List<Phone> phones = phoneRepository.findAll();
        List<Order> purchaseOrders = purchaseOrderRepository.findAll();
        List<Rental> rentals = rentalRepository.findAll();
        List<Repair> repairs = repairRepository.findAll();
        List<Review> reviews = reviewRepository.findAll();
        List<Stock> stocks = stockRepository.findAll();
        List<Store> stores = storeRepository.findAll();

        model.addAttribute("accessories", accessories);
        model.addAttribute("brands", brands);
        model.addAttribute("customers", customers);
        model.addAttribute("employees", employees);
        model.addAttribute("models", models);
        model.addAttribute("payments", payments);
        model.addAttribute("phones", phones);
        model.addAttribute("purchaseOrders", purchaseOrders);
        model.addAttribute("rentals", rentals);
        model.addAttribute("repairs", repairs);
        model.addAttribute("reviews", reviews);
        model.addAttribute("stocks", stocks);
        model.addAttribute("stores", stores);

        return "data-view";  // Corresponds to data-view.html
    }
}
