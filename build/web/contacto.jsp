
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <title>Games Plaza</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
    <link rel="icon" href="img/logo.png" type="image/icon">
    <link rel="stylesheet" href="css/all.min.css">
    <link rel="stylesheet" href="css/estilo.css">
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
        </div>
    </header>

    <div class="cuerpo">
        <section class="contacto" name="contacto" id="contacto">
            <div class="titulo">
                <h2 class="mediano blanco light">Nos interesa saber tu opinión</h2>
            </div>
            <div class="contenedor-contacto">
                <div class="formulario">
                    <form method="post" id="contact_form">
                        <input name="nombre" class="inombre" placeholder="Nombre" type="text" required id="name">
                        <input name="email" class="iemail" type="email" placeholder="Correo" required id="email">
                        <input name="telefono" class="itelefono" type="tel" placeholder="Teléfono" required id="tel">
                        <input name="asunto" class="inombre" placeholder="Asunto" type="text" required>
                        <textarea name="mensaje" id="message" placeholder="Tu mensaje" required=""></textarea>

                        <input class="enviar light" type="submit" value="Enviar" name="submit">
                    </form>
                </div>
                <div class="informacion">
                    <div class="informacionItem">
                        <div class="icon">
                            <i class="fas fa-map-marker-alt fa-3x"></i>
                        </div>
                        <p>
                            Hidalgo #698 Local 2 y 3 <br>
                            Col. Centro, Cd. Obregón, Sonora.
                        </p>
                    </div>
                    <div class="informacionItem">
                        <div class="icon">
                            <i class="fas fa-mobile-alt fa-3x"></i>
                        </div>
                        <p>
                            (644) 179 6934
                        </p>
                    </div>
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3539.145443506731!2d-109.9365160847166!3d27.49585184136092!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x86c815ec2fefbe8d%3A0x13184f15cf86f324!2sGames%20Plaza!5e0!3m2!1sen!2smx!4v1570684308560!5m2!1sen!2smx" width="400" height="300" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
                </div>
            </div>
        </section>
        <footer>
            <div class="redessociales">
                <div class="contenedor">
                    <a href="https://www.facebook.com/gamesplazaobregon/" class="facebook">
                        <i class="fab fa-facebook-square"></i>
                    </a>
                    <!-- <a href="#" class="youtube"><i class="fab fa-reddit"></i></i></a> -->
                    <!-- <a href="#" class="twitter"><i class="fab fa-twitter"></i></a> -->
                    <p>&copy Games Plaza 2019. Todos los derechos reservados.</p>
                </div>
            </div>
        </footer>
    </div>

    <script src="https://kit.fontawesome.com/90570fcca5.js" crossorigin="anonymous"></script>
</body>
</html>

