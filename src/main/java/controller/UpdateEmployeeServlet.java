package controller;

import dao.EmployeeDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int id =
                Integer.parseInt(
                        request.getParameter("id"));

        double salary =
                Double.parseDouble(
                        request.getParameter("salary"));

        EmployeeDAO dao =
                new EmployeeDAO();

        dao.updateSalary(id, salary);

        response.sendRedirect("display");
    }
}