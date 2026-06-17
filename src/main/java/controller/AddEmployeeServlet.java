package controller;

import dao.EmployeeDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

import model.Employee;

@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
    	
    

        int id =
                Integer.parseInt(request.getParameter("id"));

        String name =
                request.getParameter("name");

        String department =
                request.getParameter("department");

        double salary =
                Double.parseDouble(
                        request.getParameter("salary"));

        Employee emp =
                new Employee(id,
                        name,
                        department,
                        salary);

        EmployeeDAO dao =
                new EmployeeDAO();

        dao.addEmployee(emp);

        response.sendRedirect("display");
    }
}