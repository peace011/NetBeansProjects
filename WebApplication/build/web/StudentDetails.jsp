<%-- 
    Document   : StudentDetails
    Created on : Jul 20, 2023, 4:53:44 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <h1>Student Details</h1>

    <%-- Create a new Student object and set some sample data --%>
    <% Student student = new Student(); %>
    <% student.setName("Jennie Kim"); %>
    <% student.setAge(25); %>
    <% student.setAddress("New York"); %>

    <%-- Display the student information --%>
    <p>Name: <%= student.getName() %></p>
    <p>Age: <%= student.getAge() %></p>
    <p>Address: <%= student.getAddress() %></p>
    </body>
</html>
