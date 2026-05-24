Acest proiect contine teste automate UI si API dezvoltate in Java folosind libraria Selenium,TestNG si Rest Assured.

 Scopul proiectului este validarea functionalitatilor aplicatiei SauceDemo

 Structura proiectului:
 src/test/java
 │
 ├── base
 │   └── BaseTest.java
 │
 ├── pages
 │   ├── CartPage.java
 │   ├── CheckoutPage.java
 │   ├── InvertoryPage.java
 │   └── LoginPage.java
 │
 ├── tests
 │   ├── AddToCardTest.java
 │   └── CheckoutTest.java
 │   └── LoginTest.java
 │
 │
 └── utils
     ├── ConfigReader.java
     └── ScreenshotUtils.java
     └── WaitUtils.java

BaseTest

  Aceasta clasa gestioneaza: initializarea browserului, deschiderea aplicatiei, inchiderea browserului dupa executia testelor.
  Se folosesc metodele @BeforeMethod si @AfterMethod.

LoginPage

   Clasa contine : locatorii elementelor de login, metode pentru introducerea userName/password,metoda reutilizabila login.

InvertoryPage

   Gestioneaza add to card,card badge, navigarea catre cos.
   Contine metode reutilizabile pentru actiunile utilizatorului.

CartPage

   Contine functionalitati pentru : verificarea produselor din cos, remove product, continuarea catre checkout.

CheckoutPage

   Gestioneaza: completarea informatiilor de checkout, finalizarea comenzii, validarea mesajului de confirmare.

WaitsUtils

   Clasa utilitara folosita pentru Explicit Waits.
   Ajuta la: : stabilirea testelor, sincronizarea elementelor, evitarea folosirii threed.sleep.

ScreenshotUrils

   Folosita pentru capturarea screenshot-urilor in cazul erorilor sau pentru debugging.

AddToCard

   Acest test valideaza functionalitatea de adaugare a unui produs in cosul de cumparaturi.
