# Learn Spring Security - Học cách xây dựng Security, JsonWebToken (JWT) và Oauth2

## 1. Phần mềm và ngôn ngữ lập trình được sử dụng trong việc xây dựng Project

Project Spring Security được xây dựng và phát triển bằng:

- **Ngôn ngữ lập trình** - Java (version 21)
- **Framework** - Spring Framework v3.5.7
- **Công cụ quản lý dự án** - Maven
- **Cơ sở dữ liệu** - Phần mềm XAMPP (có thể thay thế cho MySQL)
- **IDE soạn code** - Phần mềm Intellij IDEA Ultimate (có thể sử dụng Visual Studio Code, hay là IntelliJ IDEA Community Edition)
- **Công cụ test API** - Postman
- **Quản lý và lưu trữ Project** - GitBash và GitHub
- **Website hỗ trợ tạo các dependencies trong Project** - "start.spring.io" và "mvnrepository.com"

## 2. Dependencies trong Project

Project Spring Security sử dụng các dependencies sau:

### **Core Spring Boot Dependencies**
- **spring-boot-starter-security** - Spring Security (version theo parent: 3.5.6)
- **spring-boot-starter-validation** - Validation framework
- **spring-boot-starter-web** - Web MVC
- **spring-boot-starter-data-jpa** - JPA/Hibernate ORM
- **spring-boot-starter-test** - Testing framework

### **Database**
- **mysql-connector-j** - MySQL JDBC Driver

### **Development Tools**
- **spring-boot-devtools** - Live reload & debugging
- **lombok** - Code generation (annotations)

### **JWT Token Management**
- **jjwt-api** v0.12.5 - JWT token creation/validation
- **jjwt-impl** v0.12.5 - JWT implementation (runtime)
- **jjwt-jackson** v0.12.5 - JWT JSON processing (runtime)

### **Testing**
- **spring-security-test** - Security testing utilities

### **Parent Version**
- **spring-boot-starter-parent** v3.5.6 (sử dụng Java 21)

## 3. Bài giảng về Spring Security

Telusko. (2024, August 11). Spring Security 6 with Spring Boot and JWT Tutorial [Video]. YouTube. https://www.youtube.com/watch?v=oeni_9g7too
