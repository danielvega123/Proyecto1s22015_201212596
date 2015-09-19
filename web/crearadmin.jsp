<%-- 
    Document   : crearbus
    Created on : 12-sep-2015, 8:48:23
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
        <title>Crear Administrador</title>
    </head>
    <body>
        <div id="menu">
			<ul id="main">
				<li class="current_page_item"><a href="crearadmin.jsp">Crear</a></li>
				<li><a href="#">Eliminar</a></li>
				<li><a href="#">Modificar</a></li>
                                <li><a href="veradmin.jsp">Ver administradores</a></li>
				<li><a href="Asignarbuses.jsp">Asignar buses</a></li>
                                <li><a href="crearESTclave.jsp">Crear Estacion Clave</a></li>
				<li><a href="CrearESTgeneral.jsp">Crear Estacion General</a></li>
                                <li><a href="eliminarestacionclave.jsp">Eliminar Estacion General</a></li>
				<li><a href="eliminarestaciongeneral.jsp">Eliminar Estacion General</a></li>
				
                        </ul>
		</div>
        <div id="logo">
			<h1><a href="#"><span>Municipalidad de Guatemala</span></a></h1>
			<p>Crear administrador</p>
		</div>
        <form action="crearadmin.jsp" method="POST" align = "CENTER">
            <h2>Datos Administrador</h2>
                <label>Correo</label>
                <p></p>
                <input type="text" name="txtnombre" id="txtnombre" size="15" value="" />
                <p></p>
                <label>Contraseña</label>
                <p></p>
                <input type="text" size="10" maxlength="15" name="txtpass" value="" id="txtpassword" />
                <p></p>
                <input type="submit" value="Aceptar" />
        </form>
         <%-- start web service invocation --%><hr/>
    <%
    
        if(request.getParameter("txtnombre")!=null){
            try {
          estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	 // TODO initialize WS operation arguments here
	java.lang.String c = String.valueOf(request.getParameter("txtnombre"));
	java.lang.String c2 = String.valueOf(request.getParameter("txtpass"));
	// TODO process result here
	java.lang.String result = port.insertaradmin(c, c2);
	out.println("usuario creado con exito, creado con el correo "+result);  
        }
            catch (Exception ex) {
	out.println("creado duplicado imposible ingresarlo");
    }
    }
	
    
    %>
    <%-- end web service invocation --%><hr/>
   
        
    </body>
    
</html>
