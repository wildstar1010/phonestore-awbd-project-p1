-- Disable foreign key checks
SET FOREIGN_KEY_CHECKS=0;

-- Drop all tables if they exist
DROP TABLE IF EXISTS Accessory;
DROP TABLE IF EXISTS Brand;
DROP TABLE IF EXISTS Customer;
DROP TABLE IF EXISTS Employee;
DROP TABLE IF EXISTS Model;
DROP TABLE IF EXISTS `Order`;
DROP TABLE IF EXISTS Payment;
DROP TABLE IF EXISTS Phone;
DROP TABLE IF EXISTS Rental;
DROP TABLE IF EXISTS Repair;
DROP TABLE IF EXISTS Review;
DROP TABLE IF EXISTS Stock;
DROP TABLE IF EXISTS Store;
DROP TABLE IF EXISTS User;

-- Enable foreign key checks
SET FOREIGN_KEY_CHECKS=1;

-- Create the tables again
CREATE TABLE IF NOT EXISTS Brand (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Model (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    brand_id BIGINT,
    FOREIGN KEY (brand_id) REFERENCES Brand(id)
);

CREATE TABLE IF NOT EXISTS Phone (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    brand_id BIGINT,
    model_id BIGINT,
    FOREIGN KEY (brand_id) REFERENCES Brand(id),
    FOREIGN KEY (model_id) REFERENCES Model(id)
);

CREATE TABLE IF NOT EXISTS Store (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Customer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Employee (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    store_id BIGINT,
    FOREIGN KEY (store_id) REFERENCES Store(id)
);

CREATE TABLE IF NOT EXISTS Payment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS Stock (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    phone_id BIGINT,
    store_id BIGINT,
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (store_id) REFERENCES Store(id)
);

CREATE TABLE IF NOT EXISTS `Order` (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT,
    phone_id BIGINT,
    employee_id BIGINT,
    payment_id BIGINT,
    FOREIGN KEY (customer_id) REFERENCES Customer(id),
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (employee_id) REFERENCES Employee(id),
    FOREIGN KEY (payment_id) REFERENCES Payment(id)
);

CREATE TABLE IF NOT EXISTS Accessory (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    phone_id BIGINT,
    brand_id BIGINT,
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (brand_id) REFERENCES Brand(id)
);

CREATE TABLE IF NOT EXISTS Rental (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT,
    phone_id BIGINT,
    employee_id BIGINT,
    rental_date DATE,
    return_date DATE,
    payment_id BIGINT,
    FOREIGN KEY (customer_id) REFERENCES Customer(id),
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (employee_id) REFERENCES Employee(id),
    FOREIGN KEY (payment_id) REFERENCES Payment(id)
);

CREATE TABLE IF NOT EXISTS Repair (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    phone_id BIGINT,
    repair_date DATE,
    description VARCHAR(255),
    customer_id BIGINT, -- Added this line
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (customer_id) REFERENCES Customer(id) -- Added this line
);

CREATE TABLE IF NOT EXISTS Review (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT,
    phone_id BIGINT,
    rating INT,
    comment VARCHAR(255),
    FOREIGN KEY (customer_id) REFERENCES Customer(id),
    FOREIGN KEY (phone_id) REFERENCES Phone(id)
);

CREATE TABLE IF NOT EXISTS User (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);
