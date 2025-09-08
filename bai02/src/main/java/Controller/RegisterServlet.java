package Controller;                       // ⟵ PHẢI khớp thư mục Controller

import Model.User;                        // ⟵ class User ở package Model
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="RegisterServlet", urlPatterns={"/register"})
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String firstName = trim(req.getParameter("firstName"));
        String lastName  = trim(req.getParameter("lastName"));
        String email     = trim(req.getParameter("email"));
        String reEmail   = trim(req.getParameter("reEmail"));
        String password  = trim(req.getParameter("password"));
        String month     = trim(req.getParameter("month"));
        String day       = trim(req.getParameter("day"));
        String year      = trim(req.getParameter("year"));
        String gender    = trim(req.getParameter("gender"));

        if (isBlank(firstName) || isBlank(lastName) || isBlank(email) || isBlank(reEmail)
                || isBlank(password) || isBlank(month) || isBlank(day) || isBlank(year) || isBlank(gender)) {
            req.setAttribute("error","Vui lòng nhập đầy đủ thông tin.");
            req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
            return;
        }
        if ("Month".equalsIgnoreCase(month) || "Day".equalsIgnoreCase(day) || "Year".equalsIgnoreCase(year)) {
            req.setAttribute("error","Vui lòng chọn ngày sinh hợp lệ.");
            req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
            return;
        }
        if (!email.equalsIgnoreCase(reEmail)) {
            req.setAttribute("error","Email nhập lại không khớp.");
            req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
            return;
        }

        String birthday = day + "/" + month + "/" + year;
        User user = new User(firstName, lastName, email, password, gender, birthday);

        req.setAttribute("user", user);
        req.getRequestDispatcher("/views/success.jsp").forward(req, resp);
    }

    private static String trim(String s){ return s==null? null : s.trim(); }
    private static boolean isBlank(String s){ return s==null || s.isEmpty(); }
}