# CS 34800 Fall 2025 Final Project Submission

# Degree Planner & Tracker

A web application for managing student enrollments, courses, and degree program requirements.

## Description

This application allows students and administrators to:
- Manage student enrollments in courses
- Track degree program requirements
- View course prerequisites
- Generate enrollment reports with statistics

## Technologies Used

### Backend
- **Java 17+**
- **Spring Boot** - Framework for building the REST API
- **Spring Data JPA** - Database access and ORM
- **MySQL** - Relational database
- **Maven** - Dependency management

### Frontend
- **Angular** - Frontend framework
- **TypeScript** - Programming language
- **HTML/CSS** - UI markup and styling

## Database Schema

### Main Tables
- `Student` - Student information
- `Course` - Course catalog
- `Enrollments` - Student course enrollments
- `Degree_Program` - Available degree programs
- `Student_Program` - Student-program associations
- `Department` - Academic departments
- `College` - Colleges within the university
- `Core_Curriculum` - University-wide required courses
- `Program_Requirements` - Program-specific course requirements
- `Course_Prerequisites` - Course prerequisite relationships

## Setup Instructions

### Prerequisites
- Java 17 or higher
- Node.js and npm
- MySQL Server
- Maven

### Backend Setup

1. Clone the repository:
```bash
   git clone <your-repo-url>
   cd degree_planner_tracker
```

2. Configure the database in `src/main/resources/application.properties`:
```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
```

3. Create the database schema (run the SQL scripts in your MySQL client)

4. Run the Spring Boot application:
```bash
   mvn spring-boot:run
```

The backend will start on `http://localhost:8080`

### Frontend Setup

1. Navigate to the Angular frontend directory:
```bash
   cd angular-frontend
```

2. Install dependencies:
```bash
   npm install
```

3. Start the development server:
```bash
   ng serve
```

The frontend will start on `http://localhost:4200`

## API Endpoints

### Enrollments
- `GET /api/enrollments` - Get all enrollments
- `GET /api/enrollments/student/{studentNo}` - Get enrollments for a specific student
- `POST /api/enrollments` - Create a new enrollment
- `DELETE /api/enrollments/{studentNo}/{courseNo}/{semester}/{year}` - Delete an enrollment

### Students
- `GET /api/students` - Get all students
- `GET /api/students/{studentNo}` - Get a specific student
- `POST /api/students` - Create a new student

### Courses
- `GET /api/courses` - Get all courses
- `GET /api/courses/{courseNo}` - Get a specific course

### Reports
- `POST /api/reports/enrollment` - Generate enrollment report with filters
- `GET /api/reports/programs` - Get all degree programs
- `GET /api/reports/departments` - Get all departments

## Features

### Current Features
- ✅ Student enrollment management
- ✅ Course catalog browsing
- ✅ Enrollment by course code
- ✅ Student and course dropdowns
- ✅ Enrollment filtering by student
- ✅ Delete enrollments
- ✅ CORS configuration for frontend-backend communication
- ✅ Input validation and SQL injection protection

### Planned Features
- 📋 Enrollment reports with statistics
- 📋 Prerequisite checking
- 📋 Degree progress tracking
- 📋 Core curriculum requirements
- 📋 Program requirement tracking

## Security

This application implements several security measures:
- **SQL Injection Protection**: Uses Spring Data JPA with parameterized queries
- **Input Validation**: Server-side validation of all user inputs
- **CORS Configuration**: Restricted to specific origins
- **Data Validation**: Bean validation annotations on entities

## Project Structure
```
degree_planner_tracker/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/degree_planner_tracker/
│       │       ├── entities/          # JPA entities
│       │       ├── repositories/      # Data access layer
│       │       ├── services/          # Business logic
│       │       ├── controllers/       # REST API endpoints
│       │       └── config/            # Configuration files
│       └── resources/
│           └── application.properties # App configuration
├── angular-frontend/
│   └── src/
│       └── app/
│           ├── components/            # Angular components
│           ├── services/              # HTTP services
│           └── models/                # TypeScript interfaces
└── pom.xml                           # Maven configuration
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Authors

- Your Name - Initial work

## Acknowledgments

- Spring Boot documentation
- Angular documentation
- Purdue University (if this is for a class project)