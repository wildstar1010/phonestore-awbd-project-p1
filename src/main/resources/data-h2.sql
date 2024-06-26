-- Insert sample data into users table
INSERT INTO users (username, password, enabled) VALUES ('user1', 'parola', true);

-- Insert sample data into authorities table
INSERT INTO authorities (username, authority) VALUES ('user1', 'ROLE_USER');

INSERT INTO Brand (name) VALUES ('Apple'), ('Samsung'), ('Google');
INSERT INTO Model (name, brand_id) VALUES ('iPhone 12', 1), ('Galaxy S21', 2), ('Pixel 5', 3);
INSERT INTO Customer (name) VALUES ('John Doe'), ('Jane Smith');
INSERT INTO Store (name) VALUES ('Store 1'), ('Store 2');
INSERT INTO Employee (name, store_id) VALUES ('Employee 1', 1), ('Employee 2', 2);
INSERT INTO Phone (name, brand_id, model_id) VALUES ('iPhone 12', 1, 1), ('Galaxy S21', 2, 2), ('Pixel 5', 3, 3);
INSERT INTO Stock (phone_id, store_id) VALUES (1, 1), (2, 1), (3, 2);
INSERT INTO `Order` (customer_id, phone_id, employee_id) VALUES (1, 1, 1), (2, 2, 2);
INSERT INTO Rental (customer_id, phone_id, employee_id) VALUES (1, 3, 1), (2, 1, 2);
INSERT INTO Payment () VALUES (), ();
INSERT INTO Repair (phone_id, customer_id) VALUES (1, 1), (2, 2);
INSERT INTO Accessory (name, brand_id) VALUES ('Charger', 1), ('Headphones', 2);
INSERT INTO phone_accessory (phone_id, accessory_id) VALUES (1, 1), (2, 2);
INSERT INTO Review (content, phone_id, customer_id) VALUES ('Great phone!', 1, 1), ('Not bad', 2, 2);
INSERT INTO employee_repair (employee_id, repair_id) VALUES (1, 1), (2, 2);
