package controller;

import dao.EmployeeDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/display")
public class DisplayEmployeeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        EmployeeDAO dao =
                new EmployeeDAO();

        request.setAttribute(
                "list",
                dao.getAllEmployees());

        request.getRequestDispatcher(
                "display.jsp")
                .forward(request, response);
    }
}