<%@page import="DAO.Operaciones"%>
<%@page import="model.Producto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession sesion = request.getSession();
    boolean hayUsuario = sesion.getAttribute("nombre") != null;
%>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>Games Plaza</title>
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap" rel="stylesheet">
        <link rel="icon" href="img/logo.png" type="image/icon">
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
    </head>
    <body>
        <header class="header">
            <div class="site-header">
                <div class="logo">
                    <div class="site-logo">
                        <a href="index.jsp"> <img src="img/logo.png" alt="GamesPlaza"> </a>
                    </div>
                </div>
                <div class="site-nav">
                    <nav>
                        <a href="index.jsp">Inicio</a>
                        <a href="#">Productos</a>
                        <a href="#">Galería</a>
                        <a href="contacto.jsp">Contacto</a>
                    </nav>
                </div>
                <div class="icons">
                    <div class="icons-container">
                        <a href="#">
                            <i class="fas fa-shopping-cart"></i>
                        </a>
                        <a href="login.jsp">
                            <i class="fas fa-user"></i>
                        </a>
                    </div>
                </div>
                <%
                    if (hayUsuario) {
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

                %>
            </div>
        </header>
        <div class="container-fluid bg-light"> 
            <div class="container">
                <div class="py-5" style="width: 300px; margin-left: auto;">
                    <form>
                        <div class="input-group">
                            <select class="custom-select" name="cat" id="inputGroupSelect04">
                                <option disabled selected value="todos">Elegir categoría</option>
                                <option value="todos">Mostrar todos</option>
                                <option value="ac">Accesorios</option>
                                <option value="vj">Video juegos</option>
                                <option value="fg">Figuras</option>
                                <option value="cn">Consolas</option>
                                <option value="pl">Peluches</option>
                                <option value="mc">Mochilas</option>
                            </select>
                            <div class="input-group-append">
                                <input class="btn btn-outline-secondary" type="submit" value="Filtrar">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="row">
                    <!-- Product-->
                    <%                  
                        Operaciones op = new Operaciones();
                        List<Producto> productos = null;
                        String categoria = request.getParameter("cat");
                        if(categoria==null || categoria.equalsIgnoreCase("todos")){
                            productos = op.listaProductos();
                        } else {
                            productos = op.listaProductos(categoria);
                        }
                        for (Producto producto : productos) {
                            out.write(
                                    "<div class=\"col-lg-4 col-sm-6 mb-5\"> <div class=\"product-card mx-auto mb-3\">"
                                    + "<a class=\"product-thumb\" href=\"#\"><img src=\"" + producto.getImgURL() + "\"></a>"
                                    + "<div class=\"product-card-body\"><a class=\"product-meta\" href=\"#\">" + producto.getNombreCategoria() + "</a>"
                                    + "<h5 class=\"product-title\"><a href=\"#\">" + producto.getNombre() + "</a></h5>"
                                    + "<p> " + producto.getDescripcion()
                                    + "<span class=\"product-price\"> $ " + String.format("%.2f", producto.getPrecio()) + " </span>"
                                    + "</div>"
                                    + "<div class=\"product-buttons-wrap\"> <div class=\"product-buttons\"> "
                                    + "<div class=\"product-button border border-success\"> <a href=\"" + (hayUsuario ? "carrito.jsp" : "login.jsp") + "\">Añadir al carrito </a></div> "
                                    + "</div></div></div></div>");

                        }
                    %>
                </div>
            </div>
        </div>
        <footer class="footer">
            <div class="social-media-icon">
                <a href="https://www.facebook.com/gamesplazaobregon/" target="_blank"><i class="fab fa-facebook-square"></i></a>
                <p>&copy Games Plaza 2019. Todos los derechos reservados.</p>
            </div>
        </footer>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.10.0/feather.js"></script>
        <script src="https://kit.fontawesome.com/90570fcca5.js" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
