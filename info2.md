Documentația Proiectului

Acest proiect reprezintă o aplicație web pentru vânzarea și închirierea telefoanelor mobile. Aplicația este construită folosind arhitectura MVC (Model-View-Controller) și utilizează Spring Boot, Spring Data JPA, Spring Security și Thymeleaf pentru partea de front-end.
Structura Proiectului

    Config:
        AppConfig.java: Configurația generală a aplicației. Definește diverse beans utilizate în aplicație.
        DataSourceConfig.java: Configurația surselor de date, inclusiv conexiunile la baza de date H2 și MySQL.
        SecurityConfig.java: Configurația pentru securitate, incluzând autentificarea și autorizarea utilizând Spring Security.
        RabbitMQConfig.java: Configurația pentru RabbitMQ, definind coada utilizată pentru trimiterea și recepționarea mesajelor.

    Controller:
        Aceste clase gestionează toate cererile HTTP și direcționează datele către serviciile corespunzătoare. Exemple: BrandController, CustomerController, FileController, ModelController, PhoneController, RegistrationController.

    Exception:
        GlobalExceptionHandler.java: Gestionează global excepțiile din aplicație și oferă răspunsuri corespunzătoare.
        InvalidDataException.java: Excepție specifică pentru date invalide.
        ResourceNotFoundException.java: Excepție pentru resurse care nu au fost găsite.
        DatabaseException.java: Excepție specifică pentru probleme legate de baza de date.

    Model:
        Aceste clase reprezintă entitățile JPA și definesc relațiile între ele. Exemple: Phone, Brand, Model, Customer, Order, Rental, Payment, Employee, Store, Stock, Repair, Accessory, Review.

    Repository:
        Aceste interfețe extind JpaRepository pentru a oferi metode CRUD pentru fiecare entitate. Exemple: PhoneRepository, BrandRepository, ModelRepository, CustomerRepository, OrderRepository.

    Service:
        Aceste clase implementează logica de business pentru fiecare entitate și sunt utilizate de controlere pentru a accesa datele și a efectua operații. Exemple: PhoneService, BrandService, ModelService, CustomerService.

    Util:
        ValidationUtil.java: Clase utilitare pentru validarea datelor. Asigură că datele introduse respectă regulile de validare definite.

    Resurse:
        application.properties: Fișierul de configurare principal pentru aplicație. Conține setările generale pentru conexiunea la baza de date, portul serverului, și alte configurări esențiale.
        application-h2.properties: Configurații specifice pentru baza de date H2, utilizată în timpul testării aplicației.
        application-mysql.properties: Configurații specifice pentru baza de date MySQL, utilizată în producție.
        schema-h2.sql: Script SQL pentru crearea schemelor în baza de date H2. Definirea tabelelor și relațiilor între acestea.
        schema-mysql.sql: Script SQL pentru crearea schemelor în baza de date MySQL. Similar cu schema-h2.sql, dar ajustat pentru MySQL.
        data-h2.sql și data-mysql.sql: Scripturi SQL pentru inserarea datelor inițiale în bazele de date H2 și MySQL.

Cerințele Proiectului

    Relațiile între entități:
        S-au creat relații între entități folosind anotările JPA @OneToOne, @OneToMany, @ManyToOne, @ManyToMany. De exemplu, o entitate Phone poate avea o relație ManyToOne cu Brand și Model, OneToMany cu Order, Rental, Repair, Review, Stock și ManyToMany cu Accessory.

    Operații CRUD:
        Toate operațiile CRUD (Create, Read, Update, Delete) sunt implementate pentru fiecare entitate. Acestea sunt gestionate de repository-urile JPA și expuse prin intermediul serviciilor și controlerelor.

    Testarea aplicației cu profiluri și baze de date diferite:
        Aplicația utilizează două baze de date diferite: H2 pentru testare și MySQL pentru producție. Profilurile de testare și producție sunt configurate în fișierele application-h2.properties și application-mysql.properties.

    Testare unitare și de integrare:
        Aplicația include teste unitare și de integrare pentru verificarea funcționalității corecte a componentelor. Testele sunt scrise pentru fiecare serviciu și controler utilizând Spring Boot Test.

    Validarea datelor și tratarea excepțiilor:
        Validarea datelor se face folosind anotările @Valid și @NotNull din Spring Validation. Excepțiile sunt gestionate la nivel global prin intermediul GlobalExceptionHandler.

    Log-uri:
        Log-urile sunt implementate folosind SLF4J și sunt utilizate pentru a înregistra activități importante și erori în aplicație. Opțional, pot fi implementate aspecte pentru a captura informații suplimentare despre execuția aplicației.

    Paginare și sortare:
        Funcționalitățile de paginare și sortare a datelor sunt implementate folosind Spring Data Pageable și Sort. Controlerele acceptă parametri de paginare și sortare pentru a gestiona cererile de paginare.

    Spring Security:
        Aplicația include autentificare și autorizare utilizând Spring Security. Autentificarea este realizată cu JDBC, iar accesul la resurse este controlat pe baza rolurilor utilizatorilor.

Această documentație oferă o imagine de ansamblu asupra proiectului, explicând scopul fiecărui folder și fișier, precum și modul în care cerințele specificate au fost îndeplinite.