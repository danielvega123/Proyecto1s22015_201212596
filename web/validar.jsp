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
    

       

        <body>    <%-- start web service invocation --%><hr/>
    <%
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	 // TODO initialize WS operation arguments here
	java.lang.String c = "master";
	java.lang.String c2 = "123";
	// TODO process result here
	java.lang.String result = port.insertaradmin(c, c2);
	out.println("el usuario por default es = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

     
         <%-- start web service invocation --%><hr/>
        <%
        if(request.getParameter("nombre") != null && request.getParameter("password") != null){
            try {
            estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
            estructuras.Estructuras port = service.getEstructurasPort();
             // TODO initialize WS operation arguments here
            String correo = String.valueOf(request.getParameter("nombre"));
            String pass1 = String.valueOf(request.getParameter("password"));
            // TODO process result here
            boolean result = port.compararParametros(correo, pass1);
            if(result==true){
                response.sendRedirect("paginaadmin1.jsp");
            }else{
                response.sendRedirect("index.html");
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        }else{
            
        }
        
        %>
        <%-- end web service invocation --%><hr/>

          <%-- start web service invocation --%><hr/>
    <%
        if(request.getParameter("idCL")!= null && request.getParameter("passCL") != null){
            try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(String.valueOf(request.getParameter("idCL")));
	String passest = String.valueOf(request.getParameter("passCL"));
	// TODO process result here
	boolean result1 = port.loginEstacionclave(id, passest);
        if(result1==true){
                response.sendRedirect("paginaadmin1.jsp");
            }else{
                response.sendRedirect("index.html");
            }
	
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
        }
    
    %>
    <%-- end web service invocation --%><hr/>

        <%-- start web service invocation --%><hr/>
    <%
        if(request.getParameter("idEstGen")!= null && request.getParameter("passEstGen")!= null){
            try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(String.valueOf(request.getParameter("idEstGen")));
	java.lang.String pass2 = String.valueOf(request.getParameter("passEstGen"));
	// TODO process result here
	boolean result1 = port.loginEstaciongeneral(id, pass2);
	if(result1==true){
                response.sendRedirect("paginaadmin1.jsp");
            }else{
                response.sendRedirect("index.html");
            }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
        }
    
    %>
    <%-- end web service invocation --%><hr/>








        </body>

        
</html>
