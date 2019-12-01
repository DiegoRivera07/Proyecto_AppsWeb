package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contacto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Games Plaza</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://necolas.github.io/normalize.css/8.0.1/normalize.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"img/logo.png\" type=\"image/icon\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/all.min.css\">\r\n");
      out.write("<!--    <link rel=\"stylesheet\" href=\"css/estilo.css\">-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <div class=\"site-header\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <div class=\"site-logo\">\r\n");
      out.write("                    <a href=\"index.jsp\"> <img src=\"img/logo.png\" alt=\"GamesPlaza\"> </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"site-nav\">\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <a href=\"index.jsp\">Inicio</a>\r\n");
      out.write("                    <a href=\"#\">Productos</a>\r\n");
      out.write("                    <a href=\"#\">Galería</a>\r\n");
      out.write("                    <a href=\"contacto.jsp\">Contacto</a>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"icons\">\r\n");
      out.write("                <div class=\"icons-container\">\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <i class=\"fas fa-shopping-cart\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"login.jsp\">\r\n");
      out.write("                        <i class=\"fas fa-user\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"usuarios\"> <!-- nuevo div -->\r\n");
      out.write("                <div class=\"usuarios-container\">\r\n");
      out.write("                    <p class=\"nombre-usuario\">Bienvenido</p>\r\n");
      out.write("                    <button class=\"btn-cerrar\">Cerrar sesión</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>  \r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"cuerpo\">\r\n");
      out.write("        <section class=\"contacto\" name=\"contacto\" id=\"contacto\">\r\n");
      out.write("            <div class=\"titulo\">\r\n");
      out.write("                <h2 class=\"mediano blanco light\">Nos interesa saber tu opinión</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"contenedor-contacto\">\r\n");
      out.write("                <div class=\"formulario\">\r\n");
      out.write("                    <form method=\"post\" id=\"contact_form\">\r\n");
      out.write("                        <input name=\"nombre\" class=\"inombre\" placeholder=\"Nombre\" type=\"text\" required id=\"name\">\r\n");
      out.write("                        <input name=\"email\" class=\"iemail\" type=\"email\" placeholder=\"Correo\" required id=\"email\">\r\n");
      out.write("                        <input name=\"telefono\" class=\"itelefono\" type=\"tel\" placeholder=\"Teléfono\" required id=\"tel\">\r\n");
      out.write("                        <input name=\"asunto\" class=\"inombre\" placeholder=\"Asunto\" type=\"text\" required>\r\n");
      out.write("                        <textarea name=\"mensaje\" id=\"message\" placeholder=\"Tu mensaje\" required=\"\"></textarea>\r\n");
      out.write("\r\n");
      out.write("                        <input class=\"enviar light\" type=\"submit\" value=\"Enviar\" name=\"submit\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"informacion\">\r\n");
      out.write("                    <div class=\"informacionItem\">\r\n");
      out.write("                        <div class=\"icon\">\r\n");
      out.write("                            <i class=\"fas fa-map-marker-alt fa-3x\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Hidalgo #698 Local 2 y 3 <br>\r\n");
      out.write("                            Col. Centro, Cd. Obregón, Sonora.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"informacionItem\">\r\n");
      out.write("                        <div class=\"icon\">\r\n");
      out.write("                            <i class=\"fas fa-mobile-alt fa-3x\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            (644) 179 6934\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3539.145443506731!2d-109.9365160847166!3d27.49585184136092!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x86c815ec2fefbe8d%3A0x13184f15cf86f324!2sGames%20Plaza!5e0!3m2!1sen!2smx!4v1570684308560!5m2!1sen!2smx\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"redessociales\">\r\n");
      out.write("                <div class=\"contenedor\">\r\n");
      out.write("                    <a href=\"https://www.facebook.com/gamesplazaobregon/\" class=\"facebook\">\r\n");
      out.write("                        <i class=\"fab fa-facebook-square\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <!-- <a href=\"#\" class=\"youtube\"><i class=\"fab fa-reddit\"></i></i></a> -->\r\n");
      out.write("                    <!-- <a href=\"#\" class=\"twitter\"><i class=\"fab fa-twitter\"></i></a> -->\r\n");
      out.write("                    <p>&copy Games Plaza 2019. Todos los derechos reservados.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/90570fcca5.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
