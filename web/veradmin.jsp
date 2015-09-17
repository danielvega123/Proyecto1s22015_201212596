<%-- 
    Document   : veradmin
    Created on : 12-sep-2015, 9:29:16
    Author     : danielvega
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="keywords" content="" />
<meta name="Gestured" content="" />
<link href="default.css" rel="stylesheet" type="text/css" media="screen" />
        <title>Listado de administradores</title>
    </head>
    <body>
          <div id="wrapper">
	<div id="header">
		<div id="menu">
			<ul id="main">
				<li class="current_page_item"><a href="crearadmin.jsp">Crear</a></li>
				<li><a href="#">Eliminar</a></li>
				<li><a href="#">Modificar</a></li>
                                <li><a href="veradmin.jsp">Ver administradores</a></li>
                                 <li><a href="Asignarbuses.jsp">Asignar buses</a></li>
                                <li><a href="CrearESTclave.jsp">Crear Estacion Clave</a></li>
				
			</ul>
		</div>
		<div id="logo">
			<h1><a href="#"><span>Municipalidad de Guatemala</span></a></h1>
			<p>Administrador</p>
		</div>
	</div>
            </div>
        
        <form action="veradmin.jsp" method="POST" align = "CENTER">
                    <%-- start web service invocation --%><hr/>
    <%
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	port.graficarcompleta();
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

     <img src ="imag.jpg">
   
        </form>
   <form action="veradmin.jsp" method="POST" align = "CENTER">
           <%-- start web service invocation --%><hr/>
    <%
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	port.graficarEST();
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>


     <img src ="estClave.jpg">
   
        </form>
            
    </body>
</html>
