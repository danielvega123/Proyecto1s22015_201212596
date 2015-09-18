package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CrearESTgeneral_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"Gestured\" content=\"\" />\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <title>Menu administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div id=\"menu\">\n");
      out.write("\t\t\t<ul id=\"main\">\n");
      out.write("\t\t\t\t<li class=\"current_page_item\"><a href=\"crearadmin.jsp\">Crear</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Eliminar</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Modificar</a></li>\n");
      out.write("                                <li><a href=\"veradmin.jsp\">Ver administradores</a></li>\n");
      out.write("                                <li><a href=\"Asignarbuses.jsp\">Asignar buses</a></li>\n");
      out.write("                                <li><a href=\"CrearESTclave.jsp\">Crear Estacion Clave</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"CrearESTgeneral.jsp\">Crear Estacion General</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"logo\">\n");
      out.write("\t\t\t<h1><a href=\"#\"><span>Municipalidad de Guatemala</span></a></h1>\n");
      out.write("\t\t\t<p>Administrador</p>\n");
      out.write("\t\t</div>\n");
      out.write("            <form action=\"CrearESTclave.jsp\" method=\"POST\">\n");
      out.write("              <h2>Crear Estacion General</h2>\n");
      out.write("                <label>Id</label>\n");
      out.write("                <p></p>\n");
      out.write("                <input type=\"text\" name=\"id\" id=\"txtnombre\" size=\"15\" value=\"\" />\n");
      out.write("                <p></p>\n");
      out.write("                <label>Nombre</label>\n");
      out.write("                <p></p>\n");
      out.write("                <input type=\"text\" size=\"10\" maxlength=\"15\" name=\"nombre\" value=\"\" id=\"txtpassword\" />\n");
      out.write("                <p></p>\n");
      out.write("                <label>Contraseña</label>\n");
      out.write("                <p></p>\n");
      out.write("                <input type=\"password\" size=\"10\" maxlength=\"15\" name=\"password\" value=\"\" id=\"txtpassword\" />\n");
      out.write("                <p></p>\n");
      out.write("                <input type=\"submit\" value=\"Aceptar\" />\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("\t</div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("               ");
      out.write("<hr/>\n");
      out.write("    ");

        if(request.getParameter("id")!= null){
    
    try {
	estructuras.Estructuras_Service service = new estructuras.Estructuras_Service();
	estructuras.Estructuras port = service.getEstructurasPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(String.valueOf(request.getParameter("id")));
	java.lang.String c = String.valueOf(request.getParameter("nombre"));
	java.lang.String c2 = String.valueOf(request.getParameter("password"));
	// TODO process result here
	java.lang.String result = port.insertarEstGen(id, c, c2);
	out.println("Se creo la estacion clave con id = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("           \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
