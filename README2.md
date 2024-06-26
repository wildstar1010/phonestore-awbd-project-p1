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
│   │   │               ├── util
│   │   │               │   └── ValidationUtil.java
│   │   │               ├── PhoneApplication.java
│   │   │               ├── H2Application.java
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
│               └── project
│                   └── awbd
│                       ├── BrandControllerTest.java
│                       ├── CustomerControllerTest.java
│                       ├── ModelControllerTest.java
│                       ├── PhoneControllerTest.java
│                       ├── RegistrationControllerTest.java
│                       ├── BrandServiceTest.java
│                       ├── CustomerServiceTest.java
│                       ├── ModelServiceTest.java
│                      .
│                      .├── PhoneServiceTest.java
├── RentalServiceTest.java
├── RepairServiceTest.java
├── ReviewServiceTest.java
├── StockServiceTest.java
├── StoreServiceTest.java
│                      .
│                      .
│                      .
│                      .
│                      . 

Relațiile dintre Entități     

### Phone (Telefon)
    ManyToOne cu Brand (Un telefon aparține unei singure mărci)
    ManyToOne cu Model (Un telefon aparține unui singur model)
    OneToMany cu Order (Un telefon poate fi inclus în mai multe comenzi)
    OneToMany cu Rental (Un telefon poate fi închiriat de mai multe ori)
    OneToMany cu Repair (Un telefon poate avea mai multe reparații)
    OneToMany cu Review (Un telefon poate avea mai multe recenzii)
    OneToMany cu Stock (Un telefon poate fi în stoc în mai multe magazine)
    ManyToMany cu Accessory (Un telefon poate fi compatibil cu mai multe accesorii)

### Brand (Marcă)
    OneToMany cu Phone (O marcă poate avea mai multe telefoane)
    OneToMany cu Accessory (O marcă poate avea mai multe accesorii)

### Model (Model)
    ManyToOne cu Brand (Un model aparține unei singure mărci)
    OneToMany cu Phone (Un model poate avea mai multe telefoane)

### Customer (Client)
    OneToMany cu Order (Un client poate plasa mai multe comenzi)
    OneToMany cu Rental (Un client poate închiria mai multe telefoane)
    OneToMany cu Repair (Un client poate solicita mai multe reparații)
    OneToMany cu Review (Un client poate scrie mai multe recenzii)

### Order (Comandă)
    ManyToOne cu Customer (O comandă aparține unui singur client)
    ManyToOne cu Phone (O comandă este pentru un singur telefon)
    ManyToOne cu Employee (O comandă este procesată de un singur angajat)
    OneToOne cu Payment (O comandă are o singură plată asociată)

### Rental (Închiriere)
    ManyToOne cu Customer (O închiriere aparține unui singur client)
    ManyToOne cu Phone (O închiriere este pentru un singur telefon)
    ManyToOne cu Employee (O închiriere este procesată de un singur angajat)
    OneToOne cu Payment (O închiriere are o singură plată asociată)

### Payment (Plată)
    OneToOne cu Order (O plată este asociată cu o singură comandă)
    OneToOne cu Rental (O plată este asociată cu o singură închiriere)

### Employee (Angajat)
    ManyToOne cu Store (Un angajat lucrează într-un singur magazin)
    OneToMany cu Order (Un angajat poate procesa mai multe comenzi)
    OneToMany cu Rental (Un angajat poate procesa mai multe închirieri)
    ManyToMany cu Repair (Un angajat poate efectua mai multe reparații, și o reparație poate fi efectuată de mai mulți angajați)

### Store (Magazin)
    OneToMany cu Employee (Un magazin are mai mulți angajați)
    OneToMany cu Stock (Un magazin are stocuri pentru mai multe telefoane)

### Stock (Stoc)
    ManyToOne cu Phone (Un stoc este pentru un anumit model de telefon)
    ManyToOne cu Store (Un stoc este asociat unui anumit magazin)

### Repair (Reparație)
    ManyToOne cu Phone (O reparație este pentru un anumit telefon)
    ManyToOne cu Customer (O reparație este solicitată de un client)
    ManyToMany cu Employee (O reparație poate fi efectuată de mai mulți angajați)

### Accessory (Accesoriu)
    ManyToOne cu Brand (Un accesoriu aparține unei mărci)
    ManyToMany cu Phone (Un accesoriu poate fi compatibil cu mai multe telefoane)

### Review (Recenzie)
    ManyToOne cu Phone (O recenzie este pentru un anumit telefon)
    ManyToOne cu Customer (O recenzie este scrisă de un client)

Structura Bazei de Date și Relațiile Entităților

Phone --(ManyToOne)--> Brand
Phone --(ManyToOne)--> Model
Phone --(OneToMany)--> Order
Phone --(OneToMany)--> Rental
Phone --(OneToMany)--> Repair
Phone --(OneToMany)--> Review
Phone --(OneToMany)--> Stock
Phone --(ManyToMany)--> Accessory

Brand --(OneToMany)--> Phone
Brand --(OneToMany)--> Accessory

Model --(ManyToOne)--> Brand
Model --(OneToMany)--> Phone

Customer --(OneToMany)--> Order
Customer --(OneToMany)--> Rental
Customer --(OneToMany)--> Repair
Customer --(OneToMany)--> Review

Order --(ManyToOne)--> Customer
Order --(ManyToOne)--> Phone
Order --(ManyToOne)--> Employee
Order --(OneToOne)--> Payment

Rental --(ManyToOne)--> Customer
Rental --(ManyToOne)--> Phone
Rental --(ManyToOne)--> Employee
Rental --(OneToOne)--> Payment

Payment --(OneToOne)--> Order
Payment --(OneToOne)--> Rental

Employee --(ManyToOne)--> Store
Employee --(OneToMany)--> Order
Employee --(OneToMany)--> Rental
Employee --(ManyToMany)--> Repair

Store --(OneToMany)--> Employee
Store --(OneToMany)--> Stock

Stock --(ManyToOne)--> Phone
Stock --(ManyToOne)--> Store

Repair --(ManyToOne)--> Phone
Repair --(ManyToOne)--> Customer
Repair --(ManyToMany)--> Employee

Accessory --(ManyToOne)--> Brand
Accessory --(ManyToMany)--> Phone

Review --(ManyToOne)--> Phone
Review --(ManyToOne)--> Customer

Structura Proiectului
Configurații
AppConfig.java

    Rol: Configurația generală a aplicației. Definește diverse beans utilizate în aplicație.

DataSourceConfig.java

    Rol: Configurația surselor de date, inclusiv conexiunile la baza de date H2 și MySQL.

SecurityConfig.java

    Rol: Configurația pentru securitate, incluzând autentificarea și autorizarea utilizând Spring Security.

RabbitMQConfig.java

    Rol: Configurația pentru RabbitMQ, definind coada utilizată pentru trimiterea și recepționarea mesajelor.

Controlere
BrandController.java

    Rol: Gestionează toate operațiile legate de branduri (crearea, citirea, actualizarea și ștergerea brandurilor).

CustomerController.java

    Rol: Gestionează operațiile legate de clienți, incluzând CRUD și autentificarea utilizatorilor.

FileController.java

    Rol: Gestionează încărcarea și descărcarea fișierelor.

ModelController.java

    Rol: Gestionează operațiile CRUD pentru modelele de telefoane.

PhoneController.java

    Rol: Gestionează operațiile legate de telefoane, incluzând adăugarea, vizualizarea, actualizarea și ștergerea telefoanelor.

RegistrationController.java

    Rol: Gestionează înregistrarea utilizatorilor noi.

Excepții
GlobalExceptionHandler.java

    Rol: Gestionează global excepțiile din aplicație și oferă răspunsuri corespunzătoare.

InvalidDataException.java

    Rol: Excepție specifică pentru date invalide.

ResourceNotFoundException.java

    Rol: Excepție pentru resurse care nu au fost găsite.

DatabaseException.java

    Rol: Excepție specifică pentru probleme legate de baza de date.

Modele

    Phone.java: Reprezintă entitatea Phone și definește relațiile cu alte entități.
    Brand.java: Reprezintă entitatea Brand și definește relațiile cu alte entități.
    Model.java: Reprezintă entitatea Model și definește relațiile cu alte entități.
    Customer.java: Reprezintă entitatea Customer și definește relațiile cu alte entități.
    Order.java: Reprezintă entitatea Order și definește relațiile cu alte entități.
    Rental.java: Reprezintă entitatea Rental și definește relațiile cu alte entități.
    Payment.java: Reprezintă entitatea Payment și definește relațiile cu alte entități.
    Employee.java: Reprezintă entitatea Employee și definește relațiile cu alte entități.
    Store.java: Reprezintă entitatea Store și definește relațiile cu alte entități.
    Stock.java: Reprezintă entitatea Stock și definește relațiile cu alte entități.
    Repair.java: Reprezintă entitatea Repair și definește relațiile cu alte entități.
    Accessory.java: Reprezintă entitatea Accessory și definește relațiile cu alte entități.
    Review.java: Reprezintă entitatea Review și definește relațiile cu alte entități.

Repositories

    PhoneRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Phone.
    BrandRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Brand.
    ModelRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Model.
    CustomerRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Customer.
    OrderRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Order.
    RentalRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Rental.
    PaymentRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Payment.
    EmployeeRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Employee.
    StoreRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Store.
    StockRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Stock.
    RepairRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Repair.
    AccessoryRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Accessory.
    ReviewRepository.java: Extinde JpaRepository pentru a oferi metode CRUD pentru entitatea Review.

Servicii

    PhoneService.java: Implementează logica de business pentru entitatea Phone și este utilizat de controler pentru a accesa datele și a efectua operații.
    BrandService.java: Implementează logica de business pentru entitatea Brand.
    ModelService.java: Implementează logica de business pentru entitatea Model.
    CustomerService.java: Implementează logica de business pentru entitatea Customer.
    OrderService.java: Implementează logica de business pentru entitatea Order.
    RentalService.java: Implementează logica de business pentru entitatea Rental.
    PaymentService.java: Implementează logica de business pentru entitatea Payment.
    EmployeeService.java: Implementează logica de business pentru entitatea Employee.
    StoreService.java: Implementează logica de business pentru entitatea Store.
    StockService.java: Implementează logica de business pentru entitatea Stock.
    RepairService.java: Implementează logica de business pentru entitatea Repair.
    AccessoryService.java: Implementează logica de business pentru entitatea Accessory.
    ReviewService.java: Implementează logica de business pentru entitatea Review.

Utilitare
ValidationUtil.java

    Rol: Clase utilitare pentru validarea datelor. Asigură că datele introduse respectă regulile de validare definite.

Aplicații

    PhoneApplication.java: Punctul de intrare al aplicației pentru baza de date MySQL. Configurarea principală a aplicației și inițializarea componentelor necesare pentru rularea aplicației cu MySQL.
    H2Application.java: Punctul de intrare al aplicației pentru baza de date H2. Configurarea specifică pentru testare cu H2, oferind o soluție de bază de date in-memory pentru testare rapidă și ușoară.
    MySQLApplication.java: Punctul de intrare alternativ al aplicației pentru rularea aplicației cu MySQL. Aceasta permite comutarea între baza de date H2 și MySQL în funcție de cerințe.

Resurse
application.properties

    Rol: Fișierul de configurare principal pentru aplicație. Conține setările generale pentru conexiunea la baza de date, portul serverului, și alte configurări esențiale.

application-h2.properties

    Rol: Configurații specifice pentru baza de date H2, utilizată în timpul testării aplicației.

application-mysql.properties

    Rol: Configurații specifice pentru baza de date MySQL, utilizată în producție.

schema-h2.sql

    Rol: Script SQL pentru crearea schemelor în baza de date H2. Definirea tabelelor și relațiilor între acestea.

schema-mysql.sql

    Rol: Script SQL pentru crearea schemelor în baza de date MySQL. Similar cu schema-h2.sql, dar ajustat pentru MySQL.

Fișiere Statice
css/styles.css

    Rol: Fișierul CSS pentru stilizarea paginilor. Conține stilurile utilizate în întreaga aplicație pentru a asigura un design consistent.

js/scripts.js

    Rol: Fișierul JavaScript pentru funcționalități client-side. Include scripturi pentru interactivitatea paginilor web.

images/logo.png

    Rol: Logo-ul aplicației, afișat pe paginile web.

Șabloane Thymeleaf
brands/list.html

    Rol: Șablon pentru listarea brandurilor.

brands/detail.html

    Rol: Șablon pentru detaliile unui brand.

brands/create.html

    Rol: Șablon pentru crearea unui brand nou.

customers/list.html

    Rol: Șablon pentru listarea clienților.

customers/detail.html

    Rol: Șablon pentru detaliile unui client.

customers/create.html

    Rol: Șablon pentru crearea unui client nou.

models/list.html

    Rol: Șablon pentru listarea modelelor.

models/detail.html

    Rol: Șablon pentru detaliile unui model.

models/create.html

    Rol: Șablon pentru crearea unui model nou.

phones/list.html

    Rol: Șablon pentru listarea telefoanelor.

phones/detail.html

    Rol: Șablon pentru detaliile unui telefon.

phones/create.html

    Rol: Șablon pentru crearea unui telefon nou.

files/upload.html

    Rol: Șablon pentru încărcarea fișierelor.

files/list.html

    Rol: Șablon pentru listarea fișierelor încărcate.

register.html

    Rol: Șablon pentru înregistrarea utilizatorilor.

error/400.html

    Rol: Șablon pentru eroarea 400.

error/404.html

    Rol: Șablon pentru eroarea 404.

error/500.html

    Rol: Șablon pentru eroarea 500.

fragments/header.html

    Rol: Șablon pentru header-ul paginii.

fragments/footer.html

    Rol: Șablon pentru footer-ul paginii.

login.html

    Rol: Șablon pentru pagina de autentificare.

Teste
controller
BrandControllerTest.java

    Rol: Teste unitare pentru operațiile din BrandController.

CustomerControllerTest.java

    Rol: Teste unitare pentru operațiile din CustomerController.

ModelControllerTest.java

    Rol: Teste unitare pentru operațiile din ModelController.

PhoneControllerTest.java

    Rol: Teste unitare pentru operațiile din PhoneController.

RegistrationControllerTest.java

    Rol: Teste unitare pentru operațiile din RegistrationController.

service
BrandServiceTest.java

    Rol: Teste unitare pentru BrandService.

CustomerServiceTest.java

    Rol: Teste unitare pentru CustomerService.

ModelServiceTest.java

    Rol: Teste unitare pentru ModelService.

PhoneServiceTest.java

    Rol: Teste unitare pentru PhoneService.

Explicații ale Dependențelor

    Spring Boot Starter Web: Pentru a crea aplicații web folosind Spring MVC.
    Spring Boot Starter Data JPA: Pentru accesul și gestionarea datelor folosind JPA cu Hibernate.
    Spring Boot Starter Security: Pentru implementarea autentificării și autorizării în aplicație.
    Spring Boot Starter Thymeleaf: Pentru utilizarea Thymeleaf ca motor de template pentru vizualizările front-end.
    Spring Boot Starter Validation: Pentru validarea datelor de intrare în formulare.
    Spring Boot Starter Test: Pentru testele unitare și de integrare.
    H2 Database: Pentru utilizarea unei baze de date in-memory în timpul testării.
    MySQL Connector: Pentru conectarea la o bază de date MySQL.
    Spring Boot Starter AMQP: Pentru integrarea cu RabbitMQ pentru mesagerie.
    ModelMapper: Pentru maparea obiectelor DTO la entități și invers.
    SLF4J: Pentru logging.
    Commons FileUpload și Commons IO: Pentru gestionarea încărcării și descărcării fișierelor.

Concluzie

Acest proiect MVC pentru gestionarea vânzării și închirierii telefoanelor mobile este construit utilizând cele mai bune practici și tehnologii moderne. Structura clară și detaliată a proiectului asigură o dezvoltare și întreținere ușoară, iar funcționalitățile avansate oferă o experiență completă utilizatorilor finali.