-- Use the database
USE phonestore;


-- Insert Brands
INSERT INTO Brand (name) VALUES
('Apple'), ('Samsung'), ('Google'), ('OnePlus'), ('Nokia'),
('Sony'), ('LG'), ('HTC'), ('Motorola'), ('Huawei'),
('Xiaomi'), ('Oppo'), ('Vivo'), ('Realme'), ('Asus'),
('Blackberry'), ('Lenovo'), ('Microsoft'), ('Honor'), ('ZTE');

-- Insert Models
INSERT INTO Model (name, brand_id) VALUES
('iPhone 12', 1), ('Galaxy S21', 2), ('Pixel 5', 3), ('OnePlus 9', 4), ('Nokia 8.3', 5),
('Xperia 5', 6), ('V60 ThinQ', 7), ('Desire 21', 8), ('Edge Plus', 9), ('P40 Pro', 10),
('Mi 11', 11), ('Find X3', 12), ('X60 Pro', 13), ('GT 5G', 14), ('ROG Phone 5', 15),
('KEY2', 16), ('Z6 Pro', 17), ('Surface Duo', 18), ('Magic 3', 19), ('Axon 20', 20);

-- Insert Customers
INSERT INTO Customer (name) VALUES
('John Doe'), ('Jane Smith'), ('Alice Johnson'), ('Robert Brown'), ('David Wilson'),
('Emily Davis'), ('Michael White'), ('Sarah Martin'), ('James Lee'), ('Linda Clark');

-- Insert Stores
INSERT INTO Store (name) VALUES
('Store 1'), ('Store 2'), ('Store 3'), ('Store 4'), ('Store 5');

-- Insert Employees
INSERT INTO Employee (name, store_id) VALUES
('Employee 1', 1), ('Employee 2', 2), ('Employee 3', 3), ('Employee 4', 4), ('Employee 5', 5);

-- Insert Phones
INSERT INTO Phone (name, brand_id, model_id) VALUES
('iPhone 12', 1, 1), ('Galaxy S21', 2, 2), ('Pixel 5', 3, 3), ('OnePlus 9', 4, 4), ('Nokia 8.3', 5, 5);

-- Insert Stocks
INSERT INTO Stock (phone_id, store_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5);

-- Insert Orders
INSERT INTO `Order` (customer_id, phone_id, employee_id) VALUES
(1, 1, 1), (2, 2, 2), (3, 3, 3), (4, 4, 4), (5, 5, 5);

-- Insert Rentals
INSERT INTO Rental (customer_id, phone_id, employee_id) VALUES
(1, 2, 1), (2, 3, 2), (3, 4, 3), (4, 5, 4), (5, 1, 5);

-- Insert Payments
INSERT INTO Payment () VALUES (), (), (), (), ();

-- Insert Repairs
INSERT INTO Repair (phone_id, customer_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5);

-- Insert Accessories
INSERT INTO Accessory (name, brand_id) VALUES
('Charger', 1), ('Headphones', 2), ('Case', 3), ('Screen Protector', 4), ('Car Mount', 5);

-- Insert Phone-Accessory Relationships
INSERT INTO phone_accessory (phone_id, accessory_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5);

-- Insert Reviews
INSERT INTO Review (content, phone_id, customer_id) VALUES
('Great phone!', 1, 1), ('Not bad', 2, 2), ('Could be better', 3, 3), ('Excellent!', 4, 4), ('Very satisfied', 5, 5);

-- Insert Employee-Repair Relationships
INSERT INTO employee_repair (employee_id, repair_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5);
