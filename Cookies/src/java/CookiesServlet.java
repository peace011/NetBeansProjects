package Cookies;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.net.*;
import java.util.List;

@WebServlet(urlPatterns = {"/CookieServlet"})
public class CookiesServlet extends HttpServlet {
    List<HttpCookie> lit;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CookieServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CookieServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            CookieManager manager = new CookieManager();
            CookieStore cookiestore = manager.getCookieStore();
            HttpCookie cookieA = new HttpCookie("C1", "Puja");
            HttpCookie cookieB = new HttpCookie("C2", "Gurung");
            URI uri1 = new URI("www.instagram.com");
            URI uri2 = new URI("www.youtube.com");
    
            cookiestore.add(uri1, cookieA);
            cookiestore.add(uri2, cookieB);
            lit = cookiestore.getCookies();
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h3>Cookie Value:</h3>");
        response.getWriter().println("<p>" + lit + "</p>");
        response.getWriter().println("</body></html>");
    }
}
