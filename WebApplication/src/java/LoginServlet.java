//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.*;
//import java.io.*;
//import java.sql.*;
//
//@WebServlet(urlPatterns = {"/LoginServlet"})
//public class LoginServlet extends HttpServlet {
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet LoginServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>LoginServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
// 
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        try{
//            
//            String url = "jdbc:mysql://localhost:3307/empdb";
//            String query = "select * from login where username='" + username + "' and password= '" + password + "' ";
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(url, "root", "1234");
//            Statement smt = conn.createStatement();
//            ResultSet rs = smt.executeQuery(query);
//
//            while (rs.next()) {
//                if (username.equals(rs.getString("username")) 
//                        && password.equals(rs.getString("password"))) {
//                    System.out.println("Login Successful") ;
//                }
//            }
//            conn.close();
//        }
//        catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//        
//        try(PrintWriter out = response.getWriter()) {
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>LoginServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h2>Username : " + username + "<br>" + "<br>" + "Password : " + password + "</h2>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//        catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    }
//}
//  


  
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get form parameters from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Process the form data (e.g., validate username and password)
        
        // Send response
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Login Result</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Username: " + username + "</h2>");
        out.println("<h2>Password: " + password + "</h2>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}

