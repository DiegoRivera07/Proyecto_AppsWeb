package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

    HttpSession sesion = request.getSession();

      out.write("\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("        <title>Games Plaza</title>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"icon\" href=\"img/logo.png\" type=\"image/icon\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://necolas.github.io/normalize.css/8.0.1/normalize.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class=\"site-header\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <div class=\"site-logo\">\r\n");
      out.write("                        <a href=\"index.jsp\"> <img src=\"img/logo.png\" alt=\"GamesPlaza\"> </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"site-nav\">\r\n");
      out.write("                    <nav>\r\n");
      out.write("                        <a href=\"index.jsp\">Inicio</a>\r\n");
      out.write("                        <a href=\"#\">Productos</a>\r\n");
      out.write("                        <a href=\"#\">Galería</a>\r\n");
      out.write("                        <a href=\"contacto.jsp\">Contacto</a>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icons\">\r\n");
      out.write("                    <div class=\"icons-container\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fas fa-shopping-cart\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"login.jsp\">\r\n");
      out.write("                            <i class=\"fas fa-user\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    if (sesion.getAttribute("nombre") != null) {
                        out.write(
                                "<div class=\"usuarios\">"+
                                    "<div class=\"usuarios-container\">"+
                                        "<p class=\"nombre-usuario\">Hola, "+ sesion.getAttribute("nombre").toString() +"</p>"+
                                        "<button class=\"btn btn-outline-secondary btn-lg\" onclick=\"location.href='cerrarSesion.jsp'\"> Cerrar sesión </button>"+
                                    "</div>"+
                                "</div>");
                    } else {
                        out.write(
                                "<div class=\"usuarios\">"+
                                    "<div class=\"usuarios-container\">"+
                                        "<button class=\"btn btn-outline-secondary btn-lg\" onclick=\"location.href='login.jsp'\"> Iniciar sesión </button>"+
                                        "<button class=\"btn-cerrar text-secondary\" onclick=\"location.href='signup.jsp'\"> Registrarse </button>"+
                                    "</div>"+
                                "</div>");
                        
                    }

                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"hero\">\r\n");
      out.write("            <div class=\"contenedor-hero\">\r\n");
      out.write("                <h1>Games Plaza</h1>\r\n");
      out.write("                <p><i class=\"fas fa-map-marker-alt\"></i>Cd. Obregón, Sonora</p>\r\n");
      out.write("                <a href=\"contacto.jsp\" class=\"boton\">Contactar</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"contenedor-identidad\">\r\n");
      out.write("            <h3>¿Quiénes somos?</h3>\r\n");
      out.write("            <p>\r\n");
      out.write("                Somos una empresa dedicada a la venta de videojuegos para múltiples consolas, desde los más clásicos hasta los más recientes y populares, pero no solo nos limitamos a eso, sino que también nos dedicamos a la venta de consolas, disponemos de una gran variedad de accesorios y figuras de colección, además de que brindamos servicio de reparación a consolas que han sido dañadas. \r\n");
      out.write("            </p>    \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"productos\">\r\n");
      out.write("\r\n");
      out.write("            <h3>Productos</h3>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"lista-productos contenedor\">\r\n");
      out.write("                <div class=\"articulo funkos\">\r\n");
      out.write("                    <a href=\"#\">Funkos</a>\r\n");
      out.write("                    <img src=\"img/funkos.jpg\" alt=\"Funkos\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"articulo accesorios\">\r\n");
      out.write("                    <a href=\"#\">Accesorios</a>\r\n");
      out.write("                    <img src=\"img/accesorios.jpg\" alt=\"Accesorios\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"articulo peluche\">\r\n");
      out.write("                    <a href=\"#\">Peluches</a>\r\n");
      out.write("                    <img src=\"img/peluches.jpg\" alt=\"Peluches\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"articulo consolas\">\r\n");
      out.write("                    <a href=\"#\">Consolas</a>\r\n");
      out.write("                    <img src=\"img/consolas.jpg\" alt=\"Consolas\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"articulo videojuego\">\r\n");
      out.write("                    <a href=\"#\">Videojuegos</a>\r\n");
      out.write("                    <img src=\"img/videojuegos.jpg\" alt=\"Videojuegos\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"articulo mochilas\">\r\n");
      out.write("                    <a href=\"#\">Mochilas</a>\r\n");
      out.write("                    <img src=\"img/mochilas.jpg\" alt=\"Mochilas\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"footer\">\r\n");
      out.write("            <div class=\"social-media-icon\">\r\n");
      out.write("                <a href=\"https://www.facebook.com/gamesplazaobregon/\" target=\"_blank\"><i class=\"fab fa-facebook-square\"></i></a>\r\n");
      out.write("                <p>&copy Games Plaza 2019. Todos los derechos reservados.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/90570fcca5.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
