<%-- 
    Document   : guessNumber
    Created on : Nov 18, 2016, 7:02:04 PM
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
        ${outputMessage}
        <form action="GuessNumber">            
        Enter your guess number.<br> <input type="text" name="answer"> <br> <br>
        <input type=submit value='Check Your Answer'>
        </form>       
    </body>
</html>
