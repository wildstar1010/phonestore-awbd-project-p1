CREATE TABLE Brand (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Model (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    brand_id BIGINT,
    FOREIGN KEY (brand_id) REFERENCES Brand(id)
);

CREATE TABLE Phone (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    brand_id BIGINT,
    model_id BIGINT,
    FOREIGN KEY (brand_id) REFERENCES Brand(id),
    FOREIGN KEY (model_id) REFERENCES Model(id)
);

CREATE TABLE Customer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Employee (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    store_id BIGINT
);

CREATE TABLE Store (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Stock (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    phone_id BIGINT,
    store_id BIGINT,
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (store_id) REFERENCES Store(id)
);

CREATE TABLE `Order` (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT,
    phone_id BIGINT,
    employee_id BIGINT,
    payment_id BIGINT,
    FOREIGN KEY (customer_id) REFERENCES Customer(id),
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (employee_id) REFERENCES Employee(id)
);

CREATE TABLE Rental (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT,
    phone_id BIGINT,
    employee_id BIGINT,
    payment_id BIGINT,
    FOREIGN KEY (customer_id) REFERENCES Customer(id),
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (employee_id) REFERENCES Employee(id)
);

CREATE TABLE Payment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE Repair (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    phone_id BIGINT,
    customer_id BIGINT,
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (customer_id) REFERENCES Customer(id)
);

CREATE TABLE Accessory (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    brand_id BIGINT,
    FOREIGN KEY (brand_id) REFERENCES Brand(id)
);

CREATE TABLE phone_accessory (
    phone_id BIGINT,
    accessory_id BIGINT,
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (accessory_id) REFERENCES Accessory(id),
    PRIMARY KEY (phone_id, accessory_id)
);

CREATE TABLE Review (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    content TEXT NOT NULL,
    phone_id BIGINT,
    customer_id BIGINT,
    FOREIGN KEY (phone_id) REFERENCES Phone(id),
    FOREIGN KEY (customer_id) REFERENCES Customer(id)
);

CREATE TABLE employee_repair (
    employee_id BIGINT,
    repair_id BIGINT,
    FOREIGN KEY (employee_id) REFERENCES Employee(id),
    FOREIGN KEY (repair_id) REFERENCES Repair(id),
    PRIMARY KEY (employee_id, repair_id)
);
