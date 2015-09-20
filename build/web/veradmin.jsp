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
    <form action="veradmin.jsp" method="POST" align = "CENTER">
            <%-- start web service invocation --%><hr/>
    <%
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	port.graficarESTGEN();
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>



     <img src ="estGen.jpg">
   
        </form>
            <form action="veradmin.jsp" method="POST" align = "CENTER">
                    <%-- start web service invocation --%><hr/>
 

    <%
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	// TODO process result here
	java.util.List<java.lang.Object> result = port.imprimirListadmin();
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
    
    <%-- end web service invocation --%><hr/>
            </SELECT> 
        </form>
    
    <%-- start web service invocation --%><hr/>
    <%
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	port.graficarbus();
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

          <%-- start web service invocation --%><hr/>
    <%
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	port.graficarCHOFER();
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
      <img src ="Choferes.jpg">


    </body>
</html>
