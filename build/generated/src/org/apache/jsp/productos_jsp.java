package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    HttpSession sesion = request.getSession();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <title>Games Plaza</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"icon\" href=\"img/logo.png\" type=\"image/icon\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://necolas.github.io/normalize.css/8.0.1/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class=\"site-header\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <div class=\"site-logo\">\n");
      out.write("                        <a href=\"index.jsp\"> <img src=\"img/logo.png\" alt=\"GamesPlaza\"> </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"site-nav\">\n");
      out.write("                    <nav>\n");
      out.write("                        <a href=\"index.jsp\">Inicio</a>\n");
      out.write("                        <a href=\"#\">Productos</a>\n");
      out.write("                        <a href=\"#\">Galería</a>\n");
      out.write("                        <a href=\"contacto.jsp\">Contacto</a>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"icons\">\n");
      out.write("                    <div class=\"icons-container\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <i class=\"fas fa-shopping-cart\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"login.jsp\">\n");
      out.write("                            <i class=\"fas fa-user\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    if (sesion.getAttribute("nombre") != null) {
                        out.write(
                                "<div class=\"usuarios\">"
                                + "<div class=\"usuarios-container\">"
                                + "<p class=\"nombre-usuario\">Hola, " + sesion.getAttribute("nombre").toString() + "</p>"
                                + "<button class=\"btn btn-outline-secondary btn-lg\" onclick=\"location.href='cerrarSesion.jsp'\"> Cerrar sesión </button>"
                                + "</div>"
                                + "</div>");
                    } else {
                        out.write(
                                "<div class=\"usuarios\">"
                                + "<div class=\"usuarios-container\">"
                                + "<button class=\"btn btn-outline-secondary btn-lg\" onclick=\"location.href='login.jsp'\"> Iniciar sesión </button>"
                                + "<button class=\"btn-cerrar text-secondary\" onclick=\"location.href='signup.jsp'\"> Registrarse </button>"
                                + "</div>"
                                + "</div>");

                    }

                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"container-input-group\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <select class=\"custom-select\" id=\"inputGroupSelect04\">\n");
      out.write("                        <option selected>Choose...</option>\n");
      out.write("                        <option value=\"1\">One</option>\n");
      out.write("                        <option value=\"2\">Two</option>\n");
      out.write("                        <option value=\"3\">Three</option>\n");
      out.write("                    </select>\n");
      out.write("                    <div class=\"input-group-append\">\n");
      out.write("                        <button class=\"btn btn-outline-secondary\" type=\"button\">Button</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- Product-->\n");
      out.write("                <div class=\"col-lg-4 col-sm-6 mb-30\">\n");
      out.write("                    <div class=\"product-card mx-auto mb-3\">\n");
      out.write("                        <a class=\"product-thumb\" href=\"#\"><img src=\"img/vj/fifa20.png\" alt=\"FIFA20\"></a>\n");
      out.write("                        <div class=\"product-card-body\"><a class=\"product-meta\" href=\"#\">Video juego</a>\n");
      out.write("                            <h5 class=\"product-title\"><a href=\"#\">FIFA 20</a></h5><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed, distinctio?</p><span class=\"product-price\">$890</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-buttons-wrap\">\n");
      out.write("                            <div class=\"product-buttons\">\n");
      out.write("                                <div class=\"product-button\"><a href=\"#\" >Añadir al carrito</i></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Product-->\n");
      out.write("                <div class=\"col-lg-4 col-sm-6 mb-30\">\n");
      out.write("                    <div class=\"product-card mx-auto mb-5\">\n");
      out.write("                        <a class=\"product-thumb\" href=\"#\"><img src=\"img/vj/codmw.png\" alt=\"Call of duty modern warfare\"></a>\n");
      out.write("                        <div class=\"product-card-body\"><a class=\"product-meta\" href=\"#\">Video juego</a>\n");
      out.write("                            <h5 class=\"product-title\"><a href=\"#\">Call of duty modern warfare</a></h5><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed, distinctio?</p><span class=\"product-price\">$1190</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-buttons-wrap\">\n");
      out.write("                            <div class=\"product-buttons\">\n");
      out.write("                                <div class=\"product-button\"><a href=\"#\" >Añadir al carrito</i></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Product-->\n");
      out.write("                <div class=\"col-lg-4 col-sm-6 mb-30\">\n");
      out.write("                    <div class=\"product-card mx-auto mb-5\">\n");
      out.write("                        <a class=\"product-thumb\" href=\"#\"><img src=\"img/vj/wwe.png\" alt=\"WWE2k20\"></a>\n");
      out.write("                        <div class=\"product-card-body\"><a class=\"product-meta\" href=\"#\">Video juego</a>\n");
      out.write("                            <h5 class=\"product-title\"><a href=\"#\">WWE 2k20</a></h5><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed, distinctio?</p><span class=\"product-price\">$1190</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-buttons-wrap\">\n");
      out.write("                            <div class=\"product-buttons\">\n");
      out.write("                                <div class=\"product-button\"><a href=\"#\" >Añadir al carrito</i></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Product-->\n");
      out.write("                <div class=\"col-lg-4 col-sm-6 mb-30\">\n");
      out.write("                    <div class=\"product-card mx-auto mb-5\">\n");
      out.write("                        <a class=\"product-thumb\" href=\"#\"><img src=\"img/vj/gow.png\" alt=\"God of war\"></a>\n");
      out.write("                        <div class=\"product-card-body\"><a class=\"product-meta\" href=\"#\">Video juego</a>\n");
      out.write("                            <h5 class=\"product-title\"><a href=\"#\">God of war</a></h5><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed, distinctio?</p><span class=\"product-price\">$490</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-buttons-wrap\">\n");
      out.write("                            <div class=\"product-buttons\">\n");
      out.write("                                <div class=\"product-button\"><a href=\"#\" >Añadir al carrito</i></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Product-->\n");
      out.write("                <div class=\"col-lg-4 col-sm-6 mb-30\">\n");
      out.write("                    <div class=\"product-card mx-auto mb-5\">\n");
      out.write("                        <a class=\"product-thumb\" href=\"#\"><img src=\"img/vj/luigimansion.png\" alt=\"Luigi mansion 3\"></a>\n");
      out.write("                        <div class=\"product-card-body\"><a class=\"product-meta\" href=\"#\">Video juego</a>\n");
      out.write("                            <h5 class=\"product-title\"><a href=\"#\">Luigi mansion 3</a></h5>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed, distinctio?</p>\n");
      out.write("                            <span class=\"product-price\">$1290</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-buttons-wrap\">\n");
      out.write("                            <div class=\"product-buttons\">\n");
      out.write("                                <div class=\"product-button\"><a href=\"#\" >Añadir al carrito</i></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Product-->\n");
      out.write("                <div class=\"col-lg-4 col-sm-6 mb-30\">\n");
      out.write("                    <div class=\"product-card mx-auto mb-5\">\n");
      out.write("                        <a class=\"product-thumb\" href=\"#\"><img src=\"img/vj/spiderman.png\" alt=\"Spiderman\"></a>\n");
      out.write("                        <div class=\"product-card-body\"><a class=\"product-meta\" href=\"#\">Video juego</a>\n");
      out.write("                            <h5 class=\"product-title\"><a href=\"#\">Spiderman</a></h5>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed, distinctio?</p>\n");
      out.write("                            <span class=\"product-price\">$490</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-buttons-wrap\">\n");
      out.write("                            <div class=\"product-buttons\">\n");
      out.write("                                <div class=\"product-button\"><a href=\"#\" >Añadir al carrito</i></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Product-->\n");
      out.write("                <div class=\"col-lg-4 col-sm-6 mb-30\">\n");
      out.write("                    <div class=\"product-card mx-auto mb-5\">\n");
      out.write("                        <a class=\"product-thumb\" href=\"#\"><img src=\"img/vj/apex.png\" alt=\"APEX legends\"></a>\n");
      out.write("                        <div class=\"product-card-body\"><a class=\"product-meta\" href=\"#\">Video juego</a>\n");
      out.write("                            <h5 class=\"product-title\"><a href=\"#\">APEX legends</a></h5>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed, distinctio?</p>\n");
      out.write("                            <span class=\"product-price\">$490</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-buttons-wrap\">\n");
      out.write("                            <div class=\"product-buttons\">\n");
      out.write("                                <div class=\"product-button\"><a href=\"#\" >Añadir al carrito</i></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Product-->\n");
      out.write("                <div class=\"col-lg-4 col-sm-6 mb-30\">\n");
      out.write("                    <div class=\"product-card mx-auto mb-5\">\n");
      out.write("                        <a class=\"product-thumb\" href=\"#\"><img src=\"img/vj/dragonball.png\" alt=\"Dragon ball kakarot\"></a>\n");
      out.write("                        <div class=\"product-card-body\"><a class=\"product-meta\" href=\"#\">Video juego</a>\n");
      out.write("                            <h5 class=\"product-title\"><a href=\"#\">Dragon ball kakarot</a></h5><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed, distinctio?</p><span class=\"product-price\">\n");
      out.write("                                $1190</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-buttons-wrap\">\n");
      out.write("                            <div class=\"product-buttons\">\n");
      out.write("                                <div class=\"product-button\"><a href=\"#\" >Añadir al carrito</i></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Product-->\n");
      out.write("                <div class=\"col-lg-4 col-sm-6 mb-30 d-none d-lg-block\">\n");
      out.write("                    <div class=\"product-card mx-auto mb-5\">\n");
      out.write("                        <a class=\"product-thumb\" href=\"#\"><img src=\"img/vj/videojuegos.jpg\" alt=\"Borderlands 3\"></a>\n");
      out.write("                        <div class=\"product-card-body\"><a class=\"product-meta\" href=\"#\">Video juego</a>\n");
      out.write("                            <h5 class=\"product-title\"><a href=\"#\">Borderlands 3</a></h5><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed, distinctio?</p><span class=\"product-price\">$1190</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-buttons-wrap\">\n");
      out.write("                            <div class=\"product-buttons\">\n");
      out.write("                                <div class=\"product-button\"><a href=\"#\" >Añadir al carrito</i></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <div class=\"social-media-icon\">\n");
      out.write("                <a href=\"https://www.facebook.com/gamesplazaobregon/\" target=\"_blank\"><i class=\"fab fa-facebook-square\"></i></a>\n");
      out.write("                <p>&copy Games Plaza 2019. Todos los derechos reservados.</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.10.0/feather.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/90570fcca5.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
