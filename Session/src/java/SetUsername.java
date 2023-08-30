package Session;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = {"/SetUsername"})
public class SetUsername extends HttpServlet {

     protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
             throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SetUsername</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SetUsername at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String username = request.getParameter("username");

        HttpSession session = request.getSession();

        session.setAttribute("username", username);

        response.sendRedirect("GetUsername");
    }
}
