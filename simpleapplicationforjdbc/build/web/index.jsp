<%-- 
    Document   : index.jsp
    Created on : 22 Oct, 2018, 6:17:43 PM
    Author     : Barath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*;"%>
<%@page import="javax.servlet.http.*,javax.servlet.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <sql:setDataSource var="con" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/ooad" user="ba" password="ba"/>
        <sql:query dataSource="${con}" var="rs">
            Select * from LOGIN
            </sql:query>
            <table border="1">
                <tr>
                    <th>user1</th>
                    <th>pass1</th>
                 </tr>
                 <c:forEach var="row" items="${rs.rows}">
                 <tr>
                     <td><c:out value="${row.user1}"/></td>
                         <td><c:out value="${row.pass1}"/></td>
                 </tr>
                 </c:forEach>
                </table>
    </body>
</html>
