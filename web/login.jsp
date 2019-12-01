<%@page import="DAO.Operaciones"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession sesion = request.getSession();
    if (sesion.getAttribute("nombre") != null) {
        out.print("<script>location.replace('index.jsp'); </script>");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <div class="usuarios">
                <div class="usuarios-container">
                    <p class="nombre-usuario">Bienvenido</p>
                    <button class="btn-cerrar">Cerrar sesión</button>
                </div>
            </div>  
            </div>
        </header>

        <div class="formulario-login">
            <form class="form-signin">
                <h1 class="h3 mb-3 font-weight-normal title">Iniciar Sesión</h1>
                <label for="inputEmail" class="sr-only">Correo</label>
                <input type="email" id="inputEmail" name="txtEmail" class="form-control campo" placeholder="Correo Electrónico" required autofocus="">
                <label for="inputPassword" class="sr-only">Contraseña</label>
                <input type="password" id="inputPassword" name="txtContra" class="form-control mb-4 campo" placeholder="Contraseña" required>
                <%
                    if (request.getParameter("btnIngresar") != null) {
                        Operaciones op = new Operaciones();
                        String email = request.getParameter("txtEmail").toLowerCase().trim();
                        String contra = request.getParameter("txtContra");
                        Usuario usuario = op.logear(email, contra);
                        if (usuario != null) {
                            sesion.setAttribute("nombre", usuario.getNombre());
                            sesion.setAttribute("apellido", usuario.getApellido());
                            sesion.setAttribute("correo", usuario.getCorreo());
                            sesion.setAttribute("nivel", String.valueOf(usuario.getNivel()));
                            switch (usuario.getNivel()) {
                                case 1:
                                    response.sendRedirect("administrador.jsp");
                                    break;
                                case 2:
                                    response.sendRedirect("index.jsp");
                                    break;
                                default:
                                    out.write("<div id=\"errorMessage\"><p class=\"pb-3\" style=\"color: red;\">Usuario o contraseña no válida</p></div>");
                                    break;
                            }
                        } else {
                            out.write("<div id=\"errorMessage\"><p class=\"pb-3\" style=\"color: red;\">Usuario o contraseña no válida</p></div>");
                        }
                    }

                %>
                <input class="btn btn-lg btn-primary btn-block" type="submit" name="btnIngresar" value="Iniciar Sesión">

                <a href="signup.jsp">¿No tienes una cuenta?</a>
            </form>

        </div>



        <footer class="footer-login">
            <div class="social-media-icon">
                <a href="https://www.facebook.com/gamesplazaobregon/" target="_blank"><i class="fab fa-facebook-square"></i></a>
                <p>&copy Games Plaza 2019. Todos los derechos reservados.</p>
            </div>

        </footer>

        <script src="https://kit.fontawesome.com/90570fcca5.js" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script>
            $(document).ready(function () {

                $('.campo').on('click', function () {
                    $('#errorMessage').html("");
                });

            });
        </script>
    </body>
</html>