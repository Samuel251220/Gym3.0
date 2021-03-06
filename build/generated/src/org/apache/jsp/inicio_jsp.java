package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/template/HeadInicioLinks.jspf");
    _jspx_dependants.add("/WEB-INF/template/HeadVarMain.jspf");
    _jspx_dependants.add("/WEB-INF/template/FooterMain.jspf");
    _jspx_dependants.add("/WEB-INF/template/FooterInicioLinks.jspf");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/inicio.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<header class>\n");
      out.write("\n");
      out.write("\t  <!-- Aca se agrega un nav para poder crear el menu de navegacion de la pagina -->\n");
      out.write("\n");
      out.write("\t    <nav class=\"navbar navbar-inverse navbar-static-top\" role=\"navigation\"> <!-- el inverse es para que cambien los colores y el static top es para que el menu se mantenga en la parte de arriba de la pagina -->\n");
      out.write("\n");
      out.write("\t\t    <div class=\"container\">\n");
      out.write("\t\t\t    <div class=\"navbar-header\">\n");
      out.write("\t\t\t    \t<i class=\"pesa fas fa-dumbbell\"></i>\n");
      out.write("\t\t\t\t    <!-- Esto es para hacer el boton que se muestra cuando el dispositivo es mediano-->\n");
      out.write("\t\t\t\t    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navegacion\" aria-expended=\"false\" aria-controls=\"navbar\">\n");
      out.write("\t\t\t\t\t    <span class=\"sr-only\">Ocultar</span>\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t    </button>\n");
      out.write("\n");
      out.write("\t\t\t\t    <a href=\"#\" class=\"navbar-brand\">Stronger GYM</a> <!-- Este es el titulo que va en el menu-->\n");
      out.write("\t\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t\t    <!-- Aqui se iniciara el menu-->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse navbar-right\" id=\"navegacion\"> <!-- El id que se agrega aqui debe de llevar el mismo nombre que se ingreso en el data-target que va en el boton que se muestra en dispositivos medianos-->\n");
      out.write("\n");
      out.write("\t\t\t\t    <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t      \n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menu?op=1\">Inicio</a></li><!-- class=\"active\"-->\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menu?op=2\">Nosotros</a></li>\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menu?op=3\">Productos</a></li>\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menu?op=4\">Registrarse</a></li>\n");
      out.write("                                        <li class=\"bar\"><a href=\"menu?op=5\">Iniciar Sesion</a></li>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t        <!--<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expended=\"false\">\n");
      out.write("\t\t\t\t\t        Nuestros Servicios \n");
      out.write("\t\t\t\t\t        <span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t        </a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t        <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"#\">Todos los servicios</a></li>\n");
      out.write("\t\t\t\t\t\t        <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"#\">Outsourcing 1</a></li>\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"#\">Outsourcing 2</a></li>\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"#\">Outsourcing 3</a></li>\n");
      out.write("\t\t\t\t\t        </ul>\n");
      out.write("\t\t\t\t      \t</li>-->\n");
      out.write("\n");
      out.write("\t\t\t\t    \t\n");
      out.write("\t\t\t\t    </ul> \n");
      out.write("\n");
      out.write("\t\t\t\t    <!--<form action=\"\" class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("\t\t\t\t\t    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t    <input type=\"text\" class=\"form-control\" placeholder=\"Buscar\">\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("\t\t\t\t\t    <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("\t\t\t\t\t    </button>\n");
      out.write("\t\t\t\t    </form>-->\n");
      out.write("\t\t    \t</div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t    </nav>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"topSlider\"> \n");
      out.write("            <span>\n");
      out.write("                <h1 class=\"bb\">GIMNASIO</h1>   \n");
      out.write("                <h2 class=\"bb\">STRONGER</h2>\n");
      out.write("            </span>\n");
      out.write("            <div class=\"slide\"></div>\n");
      out.write("            <div class=\"slide\"></div>\n");
      out.write("            <div class=\"slide\"></div>\n");
      out.write("            <div class=\"slide\"></div>\n");
      out.write("        </div>\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("    \t\t<div class=\"row\">\n");
      out.write("    \t\t\t<div class=\"col-md-4\">\n");
      out.write("    \t\t\t\t<h2>Ultimas entradas</h2>\n");
      out.write("    \t\t\t\t<ul class=\"parrafo\">\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t</ul>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"col-md-4\">\n");
      out.write("    \t\t\t\t<h2>Contacto</h2>\n");
      out.write("    \t\t\t\t<p><strong>Strong Corporation</strong></p>\n");
      out.write("    \t\t\t\t<p class=\"parrafo\"><i class=\"fas fa-map-marker-alt\"></i> Direccion</p>\n");
      out.write("    \t\t\t\t<p class=\"parrafo\"><i class=\"fas fa-phone\"></i> Telefono</p>\n");
      out.write("    \t\t\t\t<p class=\"parrafo\"><i class=\"fab fa-whatsapp\"></i> Whatsapp</p>\n");
      out.write("    \t\t\t\t<p class=\"parrafo\"><i class=\"fas fa-envelope\"></i> Email</p>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"col-md-4\">\n");
      out.write("    \t\t\t\t<h2 class=\"title\">Recibir mas informacion</h2>\n");
      out.write("    \t\t\t\t<form action=\"./\">\n");
      out.write("    \t\t\t\t\t<div class=\"input-group\">\n");
      out.write("    \t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("\t\t    \t\t\t\t<span class=\"input-group-btn\">\n");
      out.write("\t\t    \t\t\t\t\t<button class=\"btn btn-default\" type=\"button\">\n");
      out.write("\t\t    \t\t\t\t\t\t<i class=\"glyphicon glyphicon-ok\"></i>\n");
      out.write("\t\t    \t\t\t\t\t</button>\n");
      out.write("\t\t    \t\t\t\t</span>\n");
      out.write("    \t\t\t\t\t</div><br>\n");
      out.write("    \t\t\t\t\t<p class=\"parrafo\">Recibe Informacion de nuestras actualizaciones directamente en tu correo electrónico</p>\n");
      out.write("    \t\t\t\t</form>\n");
      out.write("    \t\t\t\t\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"copy container\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"copy-title\">COPYRIGHT © 2018 TODOS LOS DERECHOS RESERVADOS</p>\n");
      out.write("\t\t\t<ul class=\"copy-ul\">\n");
      out.write("\t\t\t\t<li class=\"copy-ul-li\"><a href=\"#\">Comunidada</a></li>\n");
      out.write("\t\t\t\t<li class=\"copy-ul-li\"><a href=\"#\">Términos de uso</a></li>\n");
      out.write("\t\t\t\t<li class=\"copy-ul-li\"><a href=\"#\">Privacidad y condiciones</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/fontawesome-all.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>");
      out.write(" \n");
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
