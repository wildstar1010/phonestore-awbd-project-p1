-- Insert Brands
INSERT INTO Brand (name) VALUES
('Apple'), ('Samsung'), ('Google'), ('OnePlus'), ('Nokia'),
('Sony'), ('LG'), ('HTC'), ('Motorola'), ('Huawei'),
('Xiaomi'), ('Oppo'), ('Vivo'), ('Realme'), ('Asus'),
('Blackberry'), ('Lenovo'), ('Microsoft'), ('Honor'), ('ZTE'),
('Apple'), ('Samsung'), ('Google'), ('OnePlus'), ('Nokia'),
('Sony'), ('LG'), ('HTC'), ('Motorola'), ('Huawei'),
('Xiaomi'), ('Oppo'), ('Vivo'), ('Realme'), ('Asus'),
('Blackberry'), ('Lenovo'), ('Microsoft'), ('Honor'), ('ZTE'),
('Alcatel'), ('Panasonic'), ('Sharp'), ('Meizu'), ('Infinix'),
('Tecno'), ('Lava'), ('Micromax'), ('Coolpad'), ('Gionee');

-- Insert Models
INSERT INTO Model (name, brand_id) VALUES
('iPhone 12', 1), ('Galaxy S21', 2), ('Pixel 5', 3), ('OnePlus 9', 4), ('Nokia 8.3', 5),
('Xperia 5', 6), ('V60 ThinQ', 7), ('Desire 21', 8), ('Edge Plus', 9), ('P40 Pro', 10),
('Mi 11', 11), ('Find X3', 12), ('X60 Pro', 13), ('GT 5G', 14), ('ROG Phone 5', 15),
('KEY2', 16), ('Z6 Pro', 17), ('Surface Duo', 18), ('Magic 3', 19), ('Axon 20', 20),
('iPhone 12', 1), ('Galaxy S21', 2), ('Pixel 5', 3), ('OnePlus 9', 4), ('Nokia 8.3', 5),
('Xperia 5', 6), ('V60 ThinQ', 7), ('Desire 21', 8), ('Edge Plus', 9), ('P40 Pro', 10),
('Mi 11', 11), ('Find X3', 12), ('X60 Pro', 13), ('GT 5G', 14), ('ROG Phone 5', 15),
('KEY2', 16), ('Z6 Pro', 17), ('Surface Duo', 18), ('Magic 3', 19), ('Axon 20', 20),
('One Touch', 21), ('Eluga', 22), ('Aquos', 23), ('M6', 24), ('Zero 8', 25),
('Spark 6', 26), ('Z1', 27), ('Canvas', 28), ('Cool 10', 29), ('F103', 30);

-- Insert Customers
INSERT INTO Customer (name) VALUES
('John Doe'), ('Jane Smith'), ('Alice Johnson'), ('Robert Brown'), ('David Wilson'),
('Emily Davis'), ('Michael White'), ('Sarah Martin'), ('James Lee'), ('Linda Clark'),
('Chris Lewis'), ('Anna Walker'), ('Paul Hall'), ('Emma Young'), ('Mark King'),
('Sophia Wright'), ('Daniel Scott'), ('Olivia Harris'), ('Andrew Green'), ('Grace Baker'),
('John Doe'), ('Jane Smith'), ('Alice Johnson'), ('Robert Brown'), ('David Wilson'),
('Emily Davis'), ('Michael White'), ('Sarah Martin'), ('James Lee'), ('Linda Clark'),
('Chris Lewis'), ('Anna Walker'), ('Paul Hall'), ('Emma Young'), ('Mark King'),
('Sophia Wright'), ('Daniel Scott'), ('Olivia Harris'), ('Andrew Green'), ('Grace Baker'),
('William Adams'), ('Barbara Roberts'), ('Charles Taylor'), ('Nancy Moore'), ('Brian Anderson'),
('Jennifer Thomas'), ('Richard Jackson'), ('Patricia White'), ('Steven Harris'), ('Margaret Martin');

-- Insert Stores
INSERT INTO Store (name) VALUES
('Store 1'), ('Store 2'), ('Store 3'), ('Store 4'), ('Store 5'),
('Store 6'), ('Store 7'), ('Store 8'), ('Store 9'), ('Store 10'),
('Store 11'), ('Store 12'), ('Store 13'), ('Store 14'), ('Store 15'),
('Store 16'), ('Store 17'), ('Store 18'), ('Store 19'), ('Store 20'),
('Store 1'), ('Store 2'), ('Store 3'), ('Store 4'), ('Store 5'),
('Store 6'), ('Store 7'), ('Store 8'), ('Store 9'), ('Store 10'),
('Store 11'), ('Store 12'), ('Store 13'), ('Store 14'), ('Store 15'),
('Store 16'), ('Store 17'), ('Store 18'), ('Store 19'), ('Store 20'),
('Store 21'), ('Store 22'), ('Store 23'), ('Store 24'), ('Store 25');

-- Insert Employees
INSERT INTO Employee (name, store_id) VALUES
('Employee 1', 1), ('Employee 2', 2), ('Employee 3', 3), ('Employee 4', 4), ('Employee 5', 5),
('Employee 6', 6), ('Employee 7', 7), ('Employee 8', 8), ('Employee 9', 9), ('Employee 10', 10),
('Employee 11', 11), ('Employee 12', 12), ('Employee 13', 13), ('Employee 14', 14), ('Employee 15', 15),
('Employee 16', 16), ('Employee 17', 17), ('Employee 18', 18), ('Employee 19', 19), ('Employee 20', 20),
('Employee 1', 1), ('Employee 2', 2), ('Employee 3', 3), ('Employee 4', 4), ('Employee 5', 5),
('Employee 6', 6), ('Employee 7', 7), ('Employee 8', 8), ('Employee 9', 9), ('Employee 10', 10),
('Employee 11', 11), ('Employee 12', 12), ('Employee 13', 13), ('Employee 14', 14), ('Employee 15', 15),
('Employee 16', 16), ('Employee 17', 17), ('Employee 18', 18), ('Employee 19', 19), ('Employee 20', 20),
('Employee 21', 21), ('Employee 22', 22), ('Employee 23', 23), ('Employee 24', 24), ('Employee 25', 25);

-- Insert Phones
INSERT INTO Phone (name, brand_id, model_id) VALUES
('iPhone 12', 1, 1), ('Galaxy S21', 2, 2), ('Pixel 5', 3, 3), ('OnePlus 9', 4, 4), ('Nokia 8.3', 5, 5),
('Xperia 5', 6, 6), ('V60 ThinQ', 7, 7), ('Desire 21', 8, 8), ('Edge Plus', 9, 9), ('P40 Pro', 10, 10),
('Mi 11', 11, 11), ('Find X3', 12, 12), ('X60 Pro', 13, 13), ('GT 5G', 14, 14), ('ROG Phone 5', 15, 15),
('KEY2', 16, 16), ('Z6 Pro', 17, 17), ('Surface Duo', 18, 18), ('Magic 3', 19, 19), ('Axon 20', 20, 20),
('iPhone 12', 1, 1), ('Galaxy S21', 2, 2), ('Pixel 5', 3, 3), ('OnePlus 9', 4, 4), ('Nokia 8.3', 5, 5),
('Xperia 5', 6, 6), ('V60 ThinQ', 7, 7), ('Desire 21', 8, 8), ('Edge Plus', 9, 9), ('P40 Pro', 10, 10),
('Mi 11', 11, 11), ('Find X3', 12, 12), ('X60 Pro', 13, 13), ('GT 5G', 14, 14), ('ROG Phone 5', 15, 15),
('KEY2', 16, 16), ('Z6 Pro', 17, 17), ('Surface Duo', 18, 18), ('Magic 3', 19, 19), ('Axon 20', 20, 20),
('One Touch', 21, 21), ('Eluga', 22, 22), ('Aquos', 23, 23), ('M6', 24, 24), ('Zero 8', 25, 25),
('Spark 6', 26, 26), ('Z1', 27, 27), ('Canvas', 28, 28), ('Cool 10', 29, 29), ('F103', 30, 30);

-- Insert Stocks
INSERT INTO Stock (phone_id, store_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5),
(6, 6), (7, 7), (8, 8), (9, 9), (10, 10),
(11, 11), (12, 12), (13, 13), (14, 14), (15, 15),
(16, 16), (17, 17), (18, 18), (19, 19), (20, 20),
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5),
(6, 6), (7, 7), (8, 8), (9, 9), (10, 10),
(11, 11), (12, 12), (13, 13), (14, 14), (15, 15),
(16, 16), (17, 17), (18, 18), (19, 19), (20, 20),
(21, 21), (22, 22), (23, 23), (24, 24), (25, 25);

-- Insert Orders
INSERT INTO `Order` (customer_id, phone_id, employee_id) VALUES
(1, 1, 1), (2, 2, 2), (3, 3, 3), (4, 4, 4), (5, 5, 5),
(6, 6, 6), (7, 7, 7), (8, 8, 8), (9, 9, 9), (10, 10, 10),
(11, 11, 11), (12, 12, 12), (13, 13, 13), (14, 14, 14), (15, 15, 15),
(16, 16, 16), (17, 17, 17), (18, 18, 18), (19, 19, 19), (20, 20, 20),
(1, 1, 1), (2, 2, 2), (3, 3, 3), (4, 4, 4), (5, 5, 5),
(6, 6, 6), (7, 7, 7), (8, 8, 8), (9, 9, 9), (10, 10, 10),
(11, 11, 11), (12, 12, 12), (13, 13, 13), (14, 14, 14), (15, 15, 15),
(16, 16, 16), (17, 17, 17), (18, 18, 18), (19, 19, 19), (20, 20, 20),
(21, 21, 21), (22, 22, 22), (23, 23, 23), (24, 24, 24), (25, 25, 25);

-- Insert Rentals
INSERT INTO Rental (customer_id, phone_id, employee_id) VALUES
(1, 2, 1), (2, 3, 2), (3, 4, 3), (4, 5, 4), (5, 6, 5),
(6, 7, 6), (7, 8, 7), (8, 9, 8), (9, 10, 9), (10, 11, 10),
(11, 12, 11), (12, 13, 12), (13, 14, 13), (14, 15, 14), (15, 16, 15),
(16, 17, 16), (17, 18, 17), (18, 19, 18), (19, 20, 19), (20, 1, 20),
(1, 2, 1), (2, 3, 2), (3, 4, 3), (4, 5, 4), (5, 6, 5),
(6, 7, 6), (7, 8, 7), (8, 9, 8), (9, 10, 9), (10, 11, 10),
(11, 12, 11), (12, 13, 12), (13, 14, 13), (14, 15, 14), (15, 16, 15),
(16, 17, 16), (17, 18, 17), (18, 19, 18), (19, 20, 19), (20, 1, 20),
(21, 21, 21), (22, 22, 22), (23, 23, 23), (24, 24, 24), (25, 25, 25);


-- Insert Payments
INSERT INTO Payment () VALUES
(), (), (), (), (), (), (), (), (),
(), (), (), (), (), (), (), (), (), (), (),
(), (), (), (), (), (), (), (), (),
(), (), (), (), (), (), (), (), (), (), (),
(), (), (), (), ();

-- Insert Repairs
INSERT INTO Repair (phone_id, customer_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5),
(6, 6), (7, 7), (8, 8), (9, 9), (10, 10),
(11, 11), (12, 12), (13, 13), (14, 14), (15, 15),
(16, 16), (17, 17), (18, 18), (19, 19), (20, 20),
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5),
(6, 6), (7, 7), (8, 8), (9, 9), (10, 10),
(11, 11), (12, 12), (13, 13), (14, 14);

-- Insert Accessories
INSERT INTO Accessory (name, brand_id) VALUES
('Charger', 1), ('Headphones', 2), ('Case', 3), ('Screen Protector', 4), ('Car Mount', 5),
('Power Bank', 6), ('Bluetooth Speaker', 7), ('Wireless Charger', 8), ('Selfie Stick', 9), ('Portable Charger', 10),
('USB Cable', 11), ('Earbuds', 12), ('Memory Card', 13), ('Camera Lens', 14), ('Stylus', 15),
('Phone Holder', 16), ('Docking Station', 17), ('Game Controller', 18), ('VR Headset', 19), ('Fitness Tracker', 20);

-- Insert Phone-Accessory Relationships
INSERT INTO phone_accessory (phone_id, accessory_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5),
(6, 6), (7, 7), (8, 8), (9, 9), (10, 10),
(11, 11), (12, 12), (13, 13), (14, 14), (15, 15),
(16, 16), (17, 17), (18, 18), (19, 19), (20, 20);

-- Insert Reviews
INSERT INTO Review (content, phone_id, customer_id) VALUES
('Great phone!', 1, 1), ('Not bad', 2, 2), ('Could be better', 3, 3), ('Excellent!', 4, 4), ('Very satisfied', 5, 5),
('Good value for money', 6, 6), ('High performance', 7, 7), ('User-friendly', 8, 8), ('Sleek design', 9, 9```sql
('Affordable', 10, 10), ('Average', 11, 11), ('Loved it', 12, 12), ('Amazing!', 13, 13), ('Highly recommend', 14, 14),
('Battery life is great', 15, 15), ('Fast and efficient', 16, 16), ('Superb camera', 17, 17), ('Top-notch', 18, 18), ('Very happy', 19, 19),
('Solid performance', 20, 20), ('Reliable', 1, 1), ('Satisfactory', 2, 2), ('Above expectations', 3, 3), ('Not impressed', 4, 4),
('Decent quality', 5, 5), ('Best in class', 6, 6), ('Works well', 7, 7), ('Would buy again', 8, 8), ('Disappointed', 9, 9);

-- Insert Employee-Repair Relationships
INSERT INTO employee_repair (employee_id, repair_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5),
(6, 6), (7, 7), (8, 8), (9, 9), (10, 10),
(11, 11), (12, 12), (13, 13), (14, 14), (15, 15),
(16, 16), (17, 17), (18, 18), (19, 19), (20, 20);
