<%-- 
    Document   : ventas
    Created on : 18 nov. 2021, 14:27:53
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <!--directivas del server-->
        <%! int num = 89; double num2 = 34.4;
        double suma(){
            return num+num2;
        }
        %>
        <%
            String nombre = "Claudia";
            String usuario = request.getParameter("usuario");
            out.println("<p>"+suma()+"</p>");
        %>
        
        <h1>Hello <%= nombre%></h1>
        <p><%java.util.Date fecha = new java.util.Date();%><%=fecha%></p>

    </body>
</html>
<!<!-- Este achivo se abre desde http://localhost:8080/primerWeb/ventas.jsp -->

<!--Desde los archivos JSP pueden manejarse las interacciones cliente-servidor viendo y modificando ambos 
aspectos del proyecto, el front (desde html) y el backend(desde netbeans)-->