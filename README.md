# EdgeApp - Multi-Tenant SaaS Application

A robust Spring Boot-based multi-tenant SaaS (Software as a Service) application featuring user authentication, role-based access control, and account management. This application demonstrates enterprise-level architecture with secure user management and multi-account support.

## 🚀 Features

- **User Authentication & Authorization**: Secure login system with Spring Security integration
- **Multi-Tenant Architecture**: Support for multiple accounts with user-account relationships
- **Role-Based Access Control (RBAC)**: Flexible role management system
- **Account Management**: Comprehensive account information management including:
  - Company details (SIREN, SIRET)
  - Contact information
  - Billing and administrative addresses
  - Banking information
- **User-Account Relations**: Many-to-many relationship between users and accounts with role assignments
- **Thymeleaf Templates**: Server-side rendering for web pages
- **MySQL Database**: Persistent data storage with JPA/Hibernate

## 🛠️ Technology Stack

- **Framework**: Spring Boot 2.7.12
- **Language**: Java 11
- **Security**: Spring Security
- **ORM**: Spring Data JPA / Hibernate
- **Database**: MySQL 8.2.0
- **Template Engine**: Thymeleaf
- **Build Tool**: Maven
- **Server**: Embedded Tomcat (Port 9090)

## 📋 Prerequisites

Before running this application, ensure you have the following installed:

- **Java JDK 11** or higher
- **Maven 3.6+**
- **MySQL Server 8.0+** (running on port 3300)
- **Git** (for cloning the repository)

## 🗄️ Database Schema

The application uses the following main entities:

### User
- `id_user` (Primary Key)
- `login` (Username)
- `password`

### Account
- `id_account` (Primary Key)
- `name` (Account name)
- `siren`, `siret` (French business identifiers)
- `dt_creation`, `dt_subscription` (Dates)
- Contact, administrative, and billing information fields

### Role
- `id_role` (Primary Key)
- `role_name`
- `role_description`

### UserAccountRelation
- `uar_id` (Primary Key)
- `id_user` (Foreign Key → User)
- `id_account` (Foreign Key → Account)
- `id_role` (Foreign Key → Role)
- `flag_last_connection` (Boolean)

## ⚙️ Configuration

### Database Setup

1. Create a MySQL database:
```sql
CREATE DATABASE saasapp;
```

2. Update `src/main/resources/application.properties` with your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3300/saasapp?useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=your_username
spring.datasource.password=your_password
```

The application uses `spring.jpa.hibernate.ddl-auto=update`, which will automatically create/update tables based on your entity classes.

### Application Properties

- **Server Port**: 9090 (configurable in `application.properties`)
- **Database**: MySQL on port 3300
- **Hibernate**: Auto-update mode enabled

## 🏃 Running the Application

### Using Maven

1. Clone the repository:
```bash
git clone https://github.com/engr-muhammad-mansoor/edgeapp.git
cd edgeapp
```

2. Build the project:
```bash
mvn clean install
```

3. Run the application:
```bash
mvn spring-boot:run
```

Or use the Maven wrapper:
```bash
./mvnw spring-boot:run
```

On Windows:
```bash
mvnw.cmd spring-boot:run
```

4. Access the application:
   - Login page: `http://localhost:9090/login`
   - Welcome page (after login): `http://localhost:9090/hello`

## 📁 Project Structure

```
edgeapp/
├── src/
│   ├── main/
│   │   ├── java/com/edge/app/saas/edgeapp/
│   │   │   ├── config/              # Security and configuration
│   │   │   │   ├── CustomUserDetails.java
│   │   │   │   └── WebConfigSecurity.java
│   │   │   ├── controller/          # REST/Web controllers
│   │   │   │   └── LoginController.java
│   │   │   ├── models/              # JPA entities
│   │   │   │   ├── User.java
│   │   │   │   ├── Account.java
│   │   │   │   ├── Role.java
│   │   │   │   └── UserAccountRelation.java
│   │   │   ├── repository/          # Data access layer
│   │   │   │   ├── UserRepository.java
│   │   │   │   ├── AccountRepository.java
│   │   │   │   ├── RoleRepository.java
│   │   │   │   └── UserAccountRelationRepository.java
│   │   │   ├── service/             # Business logic
│   │   │   │   ├── UserService.java
│   │   │   │   ├── CustomUserDetailsService.java
│   │   │   │   └── UserAccountRelationService.java
│   │   │   └── EdgeappApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── templates/           # Thymeleaf templates
│   │           ├── login.html
│   │           └── welcome.html
│   └── test/                        # Test files
├── pom.xml                          # Maven configuration
└── README.md
```

## 🔐 Security Features

- **Spring Security Integration**: Form-based authentication
- **Custom User Details Service**: Custom implementation for user authentication
- **Password Encoding**: Configurable password encoder (currently using NoOpPasswordEncoder for development)
- **CSRF Protection**: Disabled for development (should be enabled in production)
- **Session Management**: Automatic session handling

### Security Configuration

- Public endpoints: `/`, `/login`
- Protected endpoints: All other routes require authentication
- Login success redirect: `/hello`
- Logout redirect: `/`

## 📡 API Endpoints

| Method | Endpoint | Description | Authentication |
|--------|----------|-------------|----------------|
| GET | `/` | Home page | Public |
| GET | `/login` | Login page | Public |
| GET | `/hello` | User dashboard with account details | Required |
| GET | `/helo` | Welcome page | Required |

## 🔧 Development Notes

### Password Security
⚠️ **Important**: The application currently uses `NoOpPasswordEncoder` for development purposes. **This should be changed to `BCryptPasswordEncoder` in production** for secure password storage.

To enable BCrypt encoding, uncomment the line in `WebConfigSecurity.java`:
```java
return new BCryptPasswordEncoder();
```

### Database Connection
Ensure MySQL is running on port 3300 (or update the port in `application.properties`).

## 🚧 Future Enhancements

- [ ] Implement BCrypt password encoding for production
- [ ] Add REST API endpoints for account management
- [ ] Implement JWT token-based authentication
- [ ] Add comprehensive unit and integration tests
- [ ] Implement account switching functionality
- [ ] Add user registration functionality
- [ ] Implement password reset feature
- [ ] Add email verification
- [ ] Implement audit logging
- [ ] Add API documentation with Swagger/OpenAPI

## 📝 License

This project is open source and available for portfolio demonstration purposes.

## 👤 Author

Developed as a portfolio project demonstrating Spring Boot, Spring Security, and multi-tenant SaaS architecture.

## 🤝 Contributing

This is a portfolio project. Contributions and suggestions are welcome!

---

**Note**: This application is configured for development purposes. Ensure proper security configurations (password encoding, CSRF protection, etc.) are implemented before deploying to production.

