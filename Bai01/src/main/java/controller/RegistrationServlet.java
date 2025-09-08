package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Student;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet", value = "/registration-form")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String dob = request.getParameter("day") + "/" +
                request.getParameter("month") + "/" +
                request.getParameter("year");

        String[] hobbiesArr = request.getParameterValues("hobbies");
        String hobbies = (hobbiesArr != null) ? String.join(", ", hobbiesArr) : "";

        Student student = new Student(
                request.getParameter("firstName"),
                request.getParameter("lastName"),
                dob,
                request.getParameter("email"),
                request.getParameter("mobile"),
                request.getParameter("gender"),
                request.getParameter("address"),
                request.getParameter("city"),
                request.getParameter("pin"),
                request.getParameter("state"),
                request.getParameter("country"),
                hobbies,
                request.getParameter("qualification"),
                request.getParameter("course")
        );

        request.setAttribute("student", student);

        RequestDispatcher dispatcher = request.getRequestDispatcher("result-form.jsp");
        dispatcher.forward(request, response);
    }
}
