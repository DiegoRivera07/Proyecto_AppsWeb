<%-- 
    Document   : cerrarSesion
    Created on : 27-nov-2019, 17:20:06
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
HttpSession sesion = request.getSession();
if(sesion.getAttribute("nombre") != null){
    sesion.setAttribute("nombre", null);
    sesion.setAttribute("apellido", null);
    sesion.setAttribute("correo", null);
    sesion.setAttribute("nivel", null);
}
out.print("<script>location.replace('index.jsp'); </script>"); 

%>