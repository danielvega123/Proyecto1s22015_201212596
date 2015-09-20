<%-- 
    Document   : eliminarestacionclave
    Created on : 18-sep-2015, 21:02:24
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
				<li><a href="eliminarestacionclave.jsp">Eliminar Estacion Clave</a></li>
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
            <form action="eliminarestaciongeneral.jsp" method="POST">
                <input type="submit" value="eliminar" name="eliminar" />
                    <%-- start web service invocation --%><hr/>
    <%
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	// TODO process result here
	java.util.List<java.lang.Object> result = port.imprimirListaestgen();
        int j = result.size();
        int i;
        %>
        <SELECT NAME="selCombo"> 
  
        
       <% for (i=0; i<j; i++){
           String corre = result.get(i).toString();
       %> <option><%=corre%> </option><%
           
        }
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
    </SELECT> 

            </form>
	</div>
            </div>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(request.getParameter("selCombo"));
	port.eliminarEstacionGeneral(id);
        out.println("se elimino correctamente el id  " + id);
        
    } catch (Exception ex) {
	out.println("no se pudo eliminar");
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>