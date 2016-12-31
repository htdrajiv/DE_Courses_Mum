<%-- 
    Document   : HelloWorld
    Created on : Nov 18, 2016, 5:51:27 PM
    Author     : Rajiv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>        
        <% for(int i=1;i<=10;i++){  %>
        <% out.print(i); %>  
        <br/>              
        <% } %>               
    </body>
</html>
