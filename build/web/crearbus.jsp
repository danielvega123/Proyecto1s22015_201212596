<%-- 
    Document   : crearbus
    Created on : 19-sep-2015, 12:35:07
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
        <title>Menu administrador</title>
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
				<li><a href="CrearESTgeneral.jsp">Crear Estacion General</a></li>
				<li><a href="eliminarestacionclave.jsp">Eliminar Estacion General</a></li>
				<li><a href="eliminarestaciongeneral.jsp">Eliminar Estacion General</a></li>
				<li><a href="eliminarchofer.jsp">Eliminar Chofer</a></li>
                                 <li><a href="crearchofer.jsp">Crear Chofer</a></li>
                                 <li><a href="crearbus.jsp">Crear Bus</a></li>
                                
				
			</ul>
		</div>
		<div id="logo">
			<h1><a href="#"><span>Municipalidad de Guatemala</span></a></h1>
			<p>Administrador</p>
		</div>
        
    <form action="crearbus.jsp" method="POST">
        <input type="text" name="Bus" value="" />
        <input type="submit" value="Insertar" name="Insertar" />
            <%-- start web service invocation --%><hr/>
    <%
    if(request.getParameter("Bus")!=null){
        
    }
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	 // TODO initialize WS operation arguments here
	int numerobus = Integer.parseInt(request.getParameter("Bus"));
	port.agregarbus(numerobus);
        out.println("bus creado con exito  con id" + numerobus);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </form>
	</div>
            </div>
           
    </body>
</html>
