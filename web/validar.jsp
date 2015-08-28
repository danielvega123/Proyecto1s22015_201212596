<%-- 
    Document   : validar
    Created on : 25-ago-2015, 10:13:53
    Author     : danielvega
--%>

<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<!DOCTYPE html>
<html>
    <head>
        <%
        String nombre;
        String pass;
        %>
        
    </head>
    <%
        nombre = request.getParameter("nombre");
        pass = request.getParameter("password");
        
        if(nombre.equals("admin") && pass.equals("admin123")){
            response.sendRedirect("PaginaAdmin.jsp");
                
        }
        else{
             response.sendRedirect("index.html");
        }
            
            
        %>
</html>
