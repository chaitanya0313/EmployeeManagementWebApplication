# Employee Management System

A simple web application built using Java, Servlet, JSP, JDBC, MySQL and Bootstrap following MVC architecture.

## Features

- Add Employee
- View Employees
- Update Employee Salary
- Delete Employee

## Technologies Used

- Java
- Servlet
- JSP
- JDBC
- MySQL
- Bootstrap 5
- Apache Tomcat 10

## Database

```sql
CREATE TABLE employee(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE
);

Project Structure

controller/

AddEmployeeServlet
DisplayEmployeeServlet
UpdateEmployeeServlet
DeleteEmployeeServlet

dao/

EmployeeDAO

model/

Employee

util/

DBConnection

MVC Flow

Browser → Servlet → DAO → Database

Database → DAO → Servlet → JSP → Browser
