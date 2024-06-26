Aplicație Web pentru Vânzarea și Închirierea Telefoanelor
Introducere

Această aplicație web este destinată gestionării procesului de vânzare și închiriere a telefoanelor mobile. Aplicația utilizează arhitectura MVC (Model-View-Controller) și este construită cu ajutorul Spring Boot, Spring Data JPA, Spring Security și Thymeleaf pentru partea de front-end. Baza de date utilizată este MySQL, dar aplicația poate funcționa și cu o bază de date H2 pentru testare.
Funcționalități

    Gestionarea Entităților: Aplicația gestionează următoarele entități: Telefoane, Branduri, Modele, Clienți, Comenzi, Închirieri, Plăți, Angajați, Magazine, Stocuri, Reparații, Accesorii și Recenzii.
    Operații CRUD: Implementarea operațiilor CRUD (Create, Read, Update, Delete) pentru toate entitățile.
    Validare și Tratarea Excepțiilor: Validarea datelor de intrare și tratarea excepțiilor pentru a asigura integritatea datelor și a oferi feedback utilizatorilor.
    Securitate: Autentificare și autorizare utilizând Spring Security cu autentificare JDBC și control al accesului bazat pe roluri.
    Mesagerie: Integrare cu RabbitMQ pentru trimiterea și recepționarea mesajelor.
    Gestionarea Fișierelor: Funcționalitate de încărcare și descărcare a fișierelor.
    Testare: Teste unitare și de integrare pentru verificarea corectitudinii aplicației.
    Paginare și Sortare: Funcționalități de paginare și sortare a datelor afișate.

Structura Proiectului
dev.project.awbd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── dev
│   │   │       └── project
│   │   │           └── awbd
│   │   │               ├── config
│   │   │               │   ├── AppConfig.java
│   │   │               │   ├── DataSourceConfig.java
│   │   │               │   ├── SecurityConfig.java
│   │   │               │   └── RabbitMQConfig.java
│   │   │               ├── controller
│   │   │               │   ├── BrandController.java
│   │   │               │   ├── CustomerController.java
│   │   │               │   ├── FileController.java
│   │   │               │   ├── ModelController.java
│   │   │               │   ├── PhoneController.java
│   │   │               │   └── RegistrationController.java
│   │   │               ├── exception
│   │   │               │   ├── GlobalExceptionHandler.java
│   │   │               │   ├── InvalidDataException.java
│   │   │               │   ├── ResourceNotFoundException.java
│   │   │               │   └── DatabaseException.java
│   │   │               ├── model
│   │   │               │   ├── Accessory.java
│   │   │               │   ├── Brand.java
│   │   │               │   ├── Customer.java
│   │   │               │   ├── Employee.java
│   │   │               │   ├── Model.java
│   │   │               │   ├── Order.java
│   │   │               │   ├── Payment.java
│   │   │               │   ├── Phone.java
│   │   │               │   ├── Rental.java
│   │   │               │   ├── Repair.java
│   │   │               │   ├── Review.java
│   │   │               │   ├── Stock.java
│   │   │               │   ├── Store.java
│   │   │               │   ├── User.java
│   │   │               │   └── Authority.java
│   │   │               ├── repository
│   │   │               │   ├── AccessoryRepository.java
│   │   │               │   ├── BrandRepository.java
│   │   │               │   ├── CustomerRepository.java
│   │   │               │   ├── EmployeeRepository.java
│   │   │               │   ├── ModelRepository.java
│   │   │               │   ├── OrderRepository.java
│   │   │               │   ├── PaymentRepository.java
│   │   │               │   ├── PhoneRepository.java
│   │   │               │   ├── RentalRepository.java
│   │   │               │   ├── RepairRepository.java
│   │   │               │   ├── ReviewRepository.java
│   │   │               │   ├── StockRepository.java
│   │   │               │   ├── StoreRepository.java
│   │   │               │   ├── UserRepository.java
│   │   │               │   └── AuthorityRepository.java
│   │   │               ├── service
│   │   │               │   ├── AccessoryService.java
│   │   │               │   ├── BrandService.java
│   │   │               │   ├── CustomerService.java
│   │   │               │   ├── EmployeeService.java
│   │   │               │   ├── MessagingService.java
│   │   │               │   ├── ModelService.java
│   │   │               │   ├── OrderService.java
│   │   │               │   ├── PaymentService.java
│   │   │               │   ├── PhoneService.java
│   │   │               │   ├── RentalService.java
│   │   │               │   ├── RepairService.java
│   │   │               │   ├── ReviewService.java
│   │   │               │   ├── StockService.java
│   │   │               │   ├── StoreService.java
│   │   │               │   ├── UserService.java
│   │   │               │   └── AuthorityService.java
│   │   │               ├── util
│   │   │               │   └── ValidationUtil.java
│   │   │               ├── PhoneApplication.java
│   │   │               └── H2Application.java
│   │   │               └── MySQLApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── application-h2.properties
│   │       ├── application-mysql.properties
│   │       ├── schema-h2.sql
│   │       ├── schema-mysql.sql
│   │       ├── data-h2.sql
│   │       ├── data-mysql.sql
│   │       ├── static
│   │       │   ├── css
│   │       │   │   └── styles.css
│   │       │   ├── js
│   │       │   │   └── scripts.js
│   │       │   └── images
│   │       │       └── logo.png
│   │       └── templates
│   │           ├── brands
│   │           │   ├── list.html
│   │           │   ├── detail.html
│   │           │   └── create.html
│   │           ├── customers
│   │           │   ├── list.html
│   │           │   ├── detail.html
│   │           │   └── create.html
│   │           ├── models
│   │           │   ├── list.html
│   │           │   ├── detail.html
│   │           │   └── create.html
│   │           ├── phones
│   │           │   ├── list.html
│   │           │   ├── detail.html
│   │           │   └── create.html
│   │           ├── files
│   │           │   ├── upload.html
│   │           │   └── list.html
│   │           ├── register.html
│   │           ├── error
│   │           │   ├── 400.html
│   │           │   ├── 404.html
│   │           │   └── 500.html
│   │           ├── fragments
│   │           │   ├── header.html
│   │           │   └── footer.html
│   │           └── login.html
│   └── test
│       └── java
│           └── dev
│

Diagrama ASCII cu relatii:
+----------------+
|     Brand      |
+----------------+
| id             |
| name           |
+----------------+
1
|
| M
+----------------+
|     Model      |
+----------------+
| id             |
| name           |
| brand_id       |
+----------------+
1
|
| M
+----------------+
|     Phone      |
+----------------+
| id             |
| name           |
| brand_id       |
| model_id       |
+----------------+
1
|
| M
+----------------+
|    Accessory   |
+----------------+
| id             |
| name           |
| brand_id       |
+----------------+

    +----------------+
    |   Customer     |
    +----------------+
    | id             |
    | name           |
    | email          |
    +----------------+
            1
            |
            | M
    +----------------+
    |     Order      |
    +----------------+
    | id             |
    | customer_id    |
    | phone_id       |
    | employee_id    |
    +----------------+
            1
            |
            | 1
    +----------------+
    |    Payment     |
    +----------------+
    | id             |
    | order_id       |
    | rental_id      |
    +----------------+

    +----------------+
    |    Rental      |
    +----------------+
    | id             |
    | customer_id    |
    | phone_id       |
    | employee_id    |
    +----------------+
            1
            |
            | M
    +----------------+
    |    Repair      |
    +----------------+
    | id             |
    | phone_id       |
    | customer_id    |
    +----------------+
            1
            |
            | M
    +----------------+
    |   Employee     |
    +----------------+
    | id             |
    | name           |
    | store_id       |
    +----------------+
            1
            |
            | M
    +----------------+
    |     Store      |
    +----------------+
    | id             |
    | name           |
    +----------------+
            1
            |
            | M
    +----------------+
    |    Stock       |
    +----------------+
    | id             |
    | phone_id       |
    | store_id       |
    +----------------+
            1
            |
            | M
    +----------------+
    |    Review      |
    +----------------+
    | id             |
    | phone_id       |
    | customer_id    |
    | rating         |
    | comment        |
    +----------------+

Entities and Their Relationships
Phone (Telefon):

    ManyToOne with Brand (Un telefon aparține unei singure mărci)
    ManyToOne with Model (Un telefon aparține unui singur model)
    OneToMany with Order (Un telefon poate fi inclus în mai multe comenzi)
    OneToMany with Rental (Un telefon poate fi închiriat de mai multe ori)
    OneToMany with Repair (Un telefon poate avea mai multe reparații)
    OneToMany with Review (Un telefon poate avea mai multe recenzii)
    OneToMany with Stock (Un telefon poate fi în stoc în mai multe magazine)
    ManyToMany with Accessory (Un telefon poate fi compatibil cu mai multe accesorii)

Brand (Marcă):

    OneToMany with Phone (O marcă poate avea mai multe telefoane)
    OneToMany with Accessory (O marcă poate avea mai multe accesorii)
    OneToMany with Model (O marcă poate avea mai multe modele)

Model (Model):

    ManyToOne with Brand (Un model aparține unei singure mărci)
    OneToMany with Phone (Un model poate avea mai multe telefoane)

Customer (Client):

    OneToMany with Order (Un client poate plasa mai multe comenzi)
    OneToMany with Rental (Un client poate închiria mai multe telefoane)
    OneToMany with Repair (Un client poate solicita mai multe reparații)
    OneToMany with Review (Un client poate scrie mai multe recenzii)

Order (Comandă):

    ManyToOne with Customer (O comandă aparține unui singur client)
    ManyToOne with Phone (O comandă este pentru un singur telefon)
    ManyToOne with Employee (O comandă este procesată de un singur angajat)
    OneToOne with Payment (O comandă are o singură plată asociată)

Rental (Închiriere):

    ManyToOne with Customer (O închiriere aparține unui singur client)
    ManyToOne with Phone (O închiriere este pentru un singur telefon)
    ManyToOne with Employee (O închiriere este procesată de un singur angajat)
    OneToOne with Payment (O închiriere are o singură plată asociată)

Payment (Plată):

    OneToOne with Order (O plată este asociată cu o singură comandă)
    OneToOne with Rental (O plată este asociată cu o singură închiriere)

Employee (Angajat):

    ManyToOne with Store (Un angajat lucrează într-un singur magazin)
    OneToMany with Order (Un angajat poate procesa mai multe comenzi)
    OneToMany with Rental (Un angajat poate procesa mai multe închirieri)
    ManyToMany with Repair (Un angajat poate efectua mai multe reparații, și o reparație poate fi efectuată de mai mulți angajați)

Store (Magazin):

    OneToMany with Employee (Un magazin are mai mulți angajați)
    OneToMany with Stock (Un magazin are stocuri pentru mai multe telefoane)

Stock (Stoc):

    ManyToOne with Phone (Un stoc este pentru un anumit model de telefon)
    ManyToOne with Store (Un stoc este asociat unui anumit magazin)

Repair (Reparație):

    ManyToOne with Phone (O reparație este pentru un anumit telefon)
    ManyToOne with Customer (O reparație este solicitată de un client)
    ManyToMany with Employee (O reparație poate fi efectuată de mai mulți angajați)

Accessory (Accesoriu):

    ManyToOne with Brand (Un accesoriu aparține unei mărci)
    ManyToMany with Phone (Un accesoriu poate fi compatibil cu mai multe telefoane)

Review (Recenzie):

    ManyToOne with Phone (O recenzie este pentru un anumit telefon)
    ManyToOne with Customer (O recenzie este scrisă de un client)

Database Entities with Relationships and Fields

Here is the detailed description of the entities, their relationships, and fields:
1. Brand

   Fields:
   id: Long
   name: String

   Relationships:
   OneToMany with Phone
   OneToMany with Accessory
   OneToMany with Model

2. Model

   Fields:
   id: Long
   name: String
   brand: Brand

   Relationships:
   ManyToOne with Brand
   OneToMany with Phone

3. Phone

   Fields:
   id: Long
   name: String
   brand: Brand
   model: Model

   Relationships:
   ManyToOne with Brand
   ManyToOne with Model
   OneToMany with Order
   OneToMany with Rental
   OneToMany with Repair
   OneToMany with Review
   OneToMany with Stock
   ManyToMany with Accessory

4. Accessory

   Fields:
   id: Long
   name: String
   brand: Brand

   Relationships:
   ManyToOne with Brand
   ManyToMany with Phone

5. Customer

   Fields:
   id: Long
   name: String
   email: String

   Relationships:
   OneToMany with Order
   OneToMany with Rental
   OneToMany with Repair
   OneToMany with Review

6. Order

   Fields:
   id: Long
   customer: Customer
   phone: Phone
   employee: Employee

   Relationships:
   ManyToOne with Customer
   ManyToOne with Phone
   ManyToOne with Employee
   OneToOne with Payment

7. Payment

   Fields:
   id: Long
   order: Order
   rental: Rental

   Relationships:
   OneToOne with Order
   OneToOne with Rental

8. Rental

   Fields:
   id: Long
   customer: Customer
   phone: Phone
   employee: Employee

   Relationships:
   ManyToOne with Customer
   ManyToOne with Phone
   ManyToOne with Employee
   OneToOne with Payment

9. Repair

   Fields:
   id: Long
   phone: Phone
   customer: Customer

   Relationships:
   ManyToOne with Phone
   ManyToOne with Customer
   ManyToMany with Employee

10. Employee

    Fields:
    id: Long
    name: String
    store: Store

    Relationships:
    ManyToOne with Store
    OneToMany with Order
    OneToMany with Rental
    ManyToMany with Repair

11. Store

    Fields:
    id: Long
    name: String

    Relationships:
    OneToMany with Employee
    OneToMany with Stock

12. Stock

    Fields:
    id: Long
    phone: Phone
    store: Store

    Relationships:
    ManyToOne with Phone
    ManyToOne with Store

13. Review

    Fields:
    id: Long
    phone: Phone
    customer: Customer
    rating: Integer
    comment: String

    Relationships:
    ManyToOne with Phone
    ManyToOne with Customer


