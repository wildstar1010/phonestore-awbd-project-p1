USE phonestore;

-- Insert into Brand table
INSERT INTO Brand (name) VALUES
('Apple'), ('Samsung'), ('Nokia'), ('Sony'), ('LG'),
('Huawei'), ('OnePlus'), ('Xiaomi'), ('Oppo'), ('Vivo'),
('Motorola'), ('Google'), ('HTC'), ('Asus'), ('Lenovo'),
('Realme'), ('TCL'), ('ZTE'), ('Microsoft'), ('Honor');

-- Insert into Model table
INSERT INTO Model (name, brand_id) VALUES
('iPhone 13', 1), ('Galaxy S21', 2), ('Nokia 8.3', 3), ('Xperia 5', 4), ('LG V60', 5),
('P40', 6), ('OnePlus 8T', 7), ('Mi 11', 8), ('Reno 5', 9), ('V21', 10),
('Moto G100', 11), ('Pixel 5', 12), ('Desire 20', 13), ('Zenfone 7', 14), ('Legion', 15),
('Realme 7', 16), ('10 Pro', 17), ('Axon 30', 18), ('Surface Duo', 19), ('Magic 3', 20);

-- Insert into Phone table
INSERT INTO Phone (name, brand_id, model_id) VALUES
('iPhone 13 Pro', 1, 1), ('iPhone 13 Mini', 1, 1), ('Galaxy S21 Ultra', 2, 2),
('Galaxy S21 Plus', 2, 2), ('Nokia 8.3 5G', 3, 3), ('Xperia 5 II', 4, 4),
('LG V60 ThinQ', 5, 5), ('P40 Pro', 6, 6), ('OnePlus 8T Pro', 7, 7),
('Mi 11 Ultra', 8, 8), ('Reno 5 Pro', 9, 9), ('V21e', 10, 10),
('Moto G100 Plus', 11, 11), ('Pixel 5a', 12, 12), ('Desire 20 Pro', 13, 13),
('Zenfone 7 Pro', 14, 14), ('Legion Pro', 15, 15), ('Realme 7 Pro', 16, 16),
('10 Pro Plus', 17, 17), ('Axon 30 Ultra', 18, 18);

-- Insert into Store table
INSERT INTO Store (name) VALUES
('Store A'), ('Store B'), ('Store C'), ('Store D'), ('Store E'),
('Store F'), ('Store G'), ('Store H'), ('Store I'), ('Store J'),
('Store K'), ('Store L'), ('Store M'), ('Store N'), ('Store O'),
('Store P'), ('Store Q'), ('Store R'), ('Store S'), ('Store T');

-- Insert into Customer table
INSERT INTO Customer (name) VALUES
('John Doe'), ('Jane Smith'), ('Michael Johnson'), ('Emily Davis'), ('David Brown'),
('Chris White'), ('Patricia Black'), ('Linda Green'), ('Barbara Blue'), ('Steven Red'),
('Mary Yellow'), ('Susan Pink'), ('Paul Orange'), ('Jessica Purple'), ('Laura Grey'),
('Nancy Silver'), ('Karen Gold'), ('Betty Copper'), ('Dorothy Bronze'), ('Sandra Diamond');

-- Insert into Employee table
INSERT INTO Employee (name, store_id) VALUES
('Alice', 1), ('Bob', 1), ('Charlie', 2), ('Diana', 2), ('Eve', 1),
('Frank', 3), ('Grace', 3), ('Heidi', 4), ('Ivan', 4), ('Judy', 3),
('Mallory', 5), ('Oscar', 5), ('Peggy', 6), ('Sybil', 6), ('Trent', 5),
('Victor', 7), ('Wendy', 7), ('Xavier', 8), ('Yolanda', 8), ('Zara', 7);

-- Insert into Payment table
INSERT INTO Payment () VALUES (), (), (), (), (),
(), (), (), (), (),
(), (), (), (), (),
(), (), (), (), ();

-- Insert into Stock table
INSERT INTO Stock (phone_id, store_id) VALUES
(1, 1), (2, 1), (3, 2), (4, 2), (5, 1),
(6, 3), (7, 3), (8, 4), (9, 4), (10, 3),
(11, 5), (12, 5), (13, 6), (14, 6), (15, 5),
(16, 7), (17, 7), (18, 8), (19, 8), (20, 7);

-- Insert into Order table
INSERT INTO `Order` (customer_id, phone_id, employee_id, payment_id) VALUES
(1, 1, 1, 1), (2, 2, 2, 2), (3, 3, 3, 3),
(4, 1, 4, 4), (5, 2, 5, 5), (6, 3, 6, 6),
(7, 4, 7, 7), (8, 5, 8, 8), (9, 6, 9, 9),
(10, 7, 10, 10), (11, 8, 11, 11), (12, 9, 12, 12),
(13, 10, 13, 13), (14, 11, 14, 14), (15, 12, 15, 15),
(16, 13, 16, 16), (17, 14, 17, 17), (18, 15, 18, 18),
(19, 16, 19, 19), (20, 17, 20, 20);

-- Insert into Accessory table
INSERT INTO Accessory (name, phone_id, brand_id) VALUES
('Case', 1, 1), ('Charger', 2, 2), ('Headphones', 3, 3),
('Screen Protector', 4, 4), ('Power Bank', 5, 5), ('Cover', 6, 6),
('Holder', 7, 7), ('Stand', 8, 8), ('Car Charger', 9, 9),
('USB Cable', 10, 10), ('Wireless Charger', 11, 11), ('Earbuds', 12, 12),
('Dock', 13, 13), ('Memory Card', 14, 14), ('SIM Card', 15, 15),
('Adapter', 16, 16), ('Bluetooth Speaker', 17, 17), ('Selfie Stick', 18, 18),
('VR Headset', 19, 19), ('Stylus', 20, 20);

-- Insert into Rental table
INSERT INTO Rental (customer_id, phone_id, employee_id, rental_date, return_date, payment_id) VALUES
(1, 1, 1, '2023-06-01', '2023-06-15', 1), (2, 2, 2, '2023-06-05', '2023-06-20', 2),
(3, 3, 3, '2023-06-10', '2023-06-25', 3), (4, 1, 4, '2023-06-15', '2023-06-30', 4),
(5, 2, 5, '2023-06-20', '2023-07-05', 5), (6, 3, 6, '2023-07-01', '2023-07-15', 6),
(7, 4, 7, '2023-07-05', '2023-07-20', 7), (8, 5, 8, '2023-07-10', '2023-07-25', 8),
(9, 6, 9, '2023-07-15', '2023-07-30', 9), (10, 7, 10, '2023-07-20', '2023-08-05', 10),
(11, 8, 11, '2023-08-01', '2023-08-15', 11), (12, 9, 12, '2023-08-05', '2023-08-20', 12),
(13, 10, 13, '2023-08-10', '2023-08-25', 13), (14, 11, 14, '2023-08-15', '2023-08-30', 14),
(15, 12, 15, '2023-08-20', '2023-09-05', 15), (16, 13, 16, '2023-08-25', '2023-09-10', 16),
(17, 14, 17, '2023-09-01', '2023-09-15', 17), (18, 15, 18, '2023-09-05', '2023-09-20', 18),
(19, 16, 19, '2023-09-10', '2023-09-25', 19), (20, 17, 20, '2023-09-15', '2023-09-30', 20);

-- Insert into Repair table
INSERT INTO Repair (phone_id, repair_date, description) VALUES
(1, '2023-06-01', 'Screen replacement'), (2, '2023-06-05', 'Battery replacement'),
(3, '2023-06-10', 'Speaker repair'), (4, '2023-06-15', 'Microphone repair'),
(5, '2023-06-20', 'Camera replacement'), (6, '2023-06-25', 'Charging port repair'),
(7, '2023-07-01', 'Screen repair'), (8, '2023-07-05', 'Software update'),
(9, '2023-07-10', 'Water damage repair'), (10, '2023-07-15', 'Button replacement'),
(11, '2023-07-20', 'Back cover replacement'), (12, '2023-07-25', 'Wi-Fi repair'),
(13, '2023-08-01', 'Bluetooth repair'), (14, '2023-08-05', 'Fingerprint sensor repair'),
(15, '2023-08-10', 'Face recognition repair'), (16, '2023-08-15', 'SIM tray repair'),
(17, '2023-08-20', 'Antenna repair'), (18, '2023-08-25', 'Proximity sensor repair'),
(19, '2023-09-01', 'GPS repair'), (20, '2023-09-05', 'Gyroscope repair');

-- Insert into Review table
INSERT INTO Review (customer_id, phone_id, rating, comment) VALUES
(1, 1, 5, 'Excellent'), (2, 2, 4, 'Good'), (3, 3, 3, 'Average'),
(4, 4, 2, 'Poor'), (5, 5, 1, 'Very bad'), (6, 6, 5, 'Excellent'),
(7, 7, 4, 'Good'), (8, 8, 3, 'Average'), (9, 9, 2, 'Poor'),
(10, 10, 1, 'Very bad'), (11, 11, 5, 'Excellent'), (12, 12, 4, 'Good'),
(13, 13, 3, 'Average'), (14, 14, 2, 'Poor'), (15, 15, 1, 'Very bad'),
(16, 16, 5, 'Excellent'), (17, 17, 4, 'Good'), (18, 18, 3, 'Average'),
(19, 19, 2, 'Poor'), (20, 20, 1, 'Very bad');

-- Insert into User table
INSERT INTO User (username, password) VALUES
('user1', 'pass1'), ('user2', 'pass2'), ('user3', 'pass3'),
('user4', 'pass4'), ('user5', 'pass5'), ('user6', 'pass6'),
('user7', 'pass7'), ('user8', 'pass8'), ('user9', 'pass9'),
('user10', 'pass10'), ('user11', 'pass11'), ('user12', 'pass12'),
('user13', 'pass13'), ('user14', 'pass14'), ('user15', 'pass15'),
('user16', 'pass16'), ('user17', 'pass17'), ('user18', 'pass18'),
('user19', 'pass19'), ('user20', 'pass20');
