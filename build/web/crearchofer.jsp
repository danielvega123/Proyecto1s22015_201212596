<%-- 
    Document   : CrearESTclave
    Created on : 17-sep-2015, 10:35:02
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
       <body>
        <div id="wrapper">
	<div id="header">
		<div id="menu">
			<ul id="main">
				<li class="current_page_item"><a href="crearadmin.jsp">Crear Administrador</a></li>
				<li><a href="#">Eliminar</a></li>
				<li><a href="#">Modificar</a></li>
                                <li><a href="veradmin.jsp">Ver administradores</a></li>
                                <li><a href="Asignarbuses.jsp">Asignar buses</a></li>
                                <li><a href="CrearESTclave.jsp">Crear Estacion Clave</a></li>
				<li><a href="CrearESTgeneral.jsp">Crear Estacion General</a></li>
			<li><a href="eliminarestacionclave.jsp">Eliminar Estacion Clave</a></li>
				<li><a href="eliminarestaciongeneral.jsp">Eliminar Estacion General</a></li>
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
            <form action="crearchofer.jsp" method="POST">
              <h2>Crear Chofer</h2>
                <label>Id</label>
                <p></p>
                <input type="text" name="id" id="txtnombre" size="15" value="" />
                <p></p>
                <label>Contraseña</label>
                <p></p>
                <input type="password" size="10" maxlength="15" name="password" value="" id="txtpassword" />
                <p></p>
                <input type="submit" value="Aceptar" />
            
            </form>
	</div>
            </div>
           
               <%-- start web service invocation --%><hr/>
    <%
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(request.getParameter("id"));
	java.lang.String c2 = String.valueOf(request.getParameter("password"));
	// TODO process result here
	java.lang.String result = port.insertarchofer(id, c2);
	out.println("Se creo el chofer con id = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
   

           
    </body>
</html>
