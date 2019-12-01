
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
    HttpSession sesion = request.getSession();
%>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>Games Plaza</title>
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap" rel="stylesheet">
        <link rel="icon" href="img/logo.png" type="image/icon">
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css">
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
                        <a href="productos.jsp">Productos</a>
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

                %>
            </div>
        </header>

        <div class="hero">
            <div class="contenedor-hero">
                <h1>Games Plaza</h1>
                <p><i class="fas fa-map-marker-alt"></i>Cd. Obregón, Sonora</p>
                <a href="contacto.jsp" class="boton">Contactar</a>
            </div>
        </div>

        <div class="contenedor-identidad">
            <h3>¿Quiénes somos?</h3>
            <p>
                Somos una empresa dedicada a la venta de videojuegos para múltiples consolas, desde los más clásicos hasta los más recientes y populares, pero no solo nos limitamos a eso, sino que también nos dedicamos a la venta de consolas, disponemos de una gran variedad de accesorios y figuras de colección, además de que brindamos servicio de reparación a consolas que han sido dañadas. 
            </p>    
        </div>

        <div class="productos">

            <h3>Productos</h3>

            <div class="lista-productos contenedor">
                <div class="articulo funkos">
                    <a href="#">Funkos</a>
                    <img src="img/funkos.jpg" alt="Funkos">
                </div>
                <div class="articulo accesorios">
                    <a href="#">Accesorios</a>
                    <img src="img/accesorios.jpg" alt="Accesorios">
                </div>
                <div class="articulo peluche">
                    <a href="#">Peluches</a>
                    <img src="img/peluches.jpg" alt="Peluches">
                </div>
                <div class="articulo consolas">
                    <a href="#">Consolas</a>
                    <img src="img/consolas.jpg" alt="Consolas">
                </div>
                <div class="articulo videojuego">
                    <a href="#">Videojuegos</a>
                    <img src="img/videojuegos.jpg" alt="Videojuegos">
                </div>
                <div class="articulo mochilas">
                    <a href="#">Mochilas</a>
                    <img src="img/mochilas.jpg" alt="Mochilas">
                </div>
            </div>
        </div>

        <footer class="footer">
            <div class="social-media-icon">
                <a href="https://www.facebook.com/gamesplazaobregon/" target="_blank"><i class="fab fa-facebook-square"></i></a>
                <p>&copy Games Plaza 2019. Todos los derechos reservados.</p>
            </div>
        </footer>

        <script src="https://kit.fontawesome.com/90570fcca5.js" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
