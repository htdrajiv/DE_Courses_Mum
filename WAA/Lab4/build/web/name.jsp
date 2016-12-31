<%-- 
    Document   : name
    Created on : Nov 25, 2016, 8:50:32 PM
    Author     : Rajiv
--%>

<%@page import="java.util.List"%>
<%@page import="model.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method=GET action=Display.AllNames>
            <br/>
            <!--displayAllNames(out, person);-->
            List of Names <br>
            <%
                List<Person> persons = (List<Person>)session.getAttribute("persons");
                if(persons!=null){                    
                    for(Person p:persons){
                           out.println("key = "+p.getKey()+", First Name = "+p.getFirstName()+", Last Name = "+p.getLastName());
                           out.println("<br>");
                    }
                }
            %>
            <input type='submit' name='showAllNames' value='Show All Names'>
            <br><br>
        </form>
        
        <form method=GET action=Add.Names>
            Key = <input type=text name=key>
            First Name = <input type=text name=firstName>
            Last Name = <input type=text name=lastName>
            <input type=submit name=addNew value=Add>
        </form>
        
        <form method=GET action=Remove.Names>
            Key = <input type=text name=key>
            <input type=submit name=remove value=Remove>
        </form>
    </body>
</html>
