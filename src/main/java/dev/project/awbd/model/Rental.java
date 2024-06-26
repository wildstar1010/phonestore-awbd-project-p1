package dev.project.awbd.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull(message = "Customer is mandatory")
    private Customer customer;

    @ManyToOne
    @NotNull(message = "Phone is mandatory")
    private Phone phone;

    @ManyToOne
    @NotNull(message = "Employee is mandatory")
    private Employee employee;

    @OneToOne
    @NotNull(message = "Payment is mandatory")
    private Payment payment;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
