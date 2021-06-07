<%-- 
    Document   : success.jsp
    Created on : 22 Oct, 2018, 7:25:03 PM
    Author     : Barath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String u=(String)session.getAttribute("ses_obj");
            if(u.equals(""))
            {
                out.println("page cannot be found");
            }
            else
            out.println("Welcome "+u+"");
            %>
    </body>
</html>
