package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LanguageServlet", urlPatterns = {"/lang"})
public class LanguageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // lang=en hoặc lang=vi
        String lang = req.getParameter("lang");
        if (lang == null || lang.isBlank()) lang = "en";

        // Lưu mã ngôn ngữ vào session để JSP dùng fmt:setLocale
        req.getSession().setAttribute("languageCode", lang);

        // quay lại trang trước hoặc về home
        String back = req.getHeader("Referer");
        resp.sendRedirect(back != null ? back : (req.getContextPath() + "/views/i18n.jsp"));
    }
}

