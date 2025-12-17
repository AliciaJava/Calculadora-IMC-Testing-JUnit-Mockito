
# Demo Calculadora

Proyecto **Spring Boot** que implementa una calculadora simple y demuestra **testing unitario** con **JUnit** y **Mockito**, además de integración con **Thymeleaf** para la interfaz web.

---

## 📌 Características

- Operaciones básicas de calculadora: suma, resta, multiplicación y división
- Testing unitario con **JUnit 4.13.2**
- Uso de **Mockito** para simulación de dependencias
- Aplicación web con **Spring Boot** y **Thymeleaf**
- Desarrollo rápido con **Spring Boot DevTools**

---

## 🛠️ Tecnologías Utilizadas

- **Java:** 1.8  
- **Spring Boot:** 3.4.4  
- **Spring Web**  
- **Spring Boot DevTools**  
- **Thymeleaf**  
- **JUnit 4**  
- **Mockito**  
- **Maven**  

---

## 📋 Requisitos Previos

- Java JDK 1.8
- Maven 3.6+
- IDE recomendado: Spring Tool Suite (STS), Eclipse o IntelliJ IDEA

---

## ⚙️ Ejecución del Proyecto

Desde la raíz del proyecto:

```bash
mvn spring-boot:run
````

O empaqueta y ejecuta:

```bash
mvn clean package
java -jar target/demo-0.0.1-SNAPSHOT.war
```

La aplicación estará disponible en:

```
http://localhost:8080
```

---

## 🧪 Ejecución de Pruebas

Ejecuta todas las pruebas unitarias y de integración con:

```bash
mvn test
```

---

## 📁 Estructura del Proyecto

```
src
 └── main
     ├── java/com/demo
     │    └── clases de la calculadora
     └── resources
          └── templates (Thymeleaf)
          └── application.properties
```

---

## 🚀 Objetivo del Proyecto

* Aprender **Spring Boot** y **Thymeleaf**
* Practicar testing con **JUnit** y **Mockito**
* Implementar CRUD y operaciones básicas en un proyecto web simple
* Integrar buenas prácticas de desarrollo y pruebas unitarias

---

## 📄 Licencia

Proyecto con fines educativos y de aprendizaje.
Uso libre para prácticas personales.

---

## ✍️ Autor

Desarrollado como ejercicio de aprendizaje de **Spring Boot**, **JUnit** y **Mockito**.


