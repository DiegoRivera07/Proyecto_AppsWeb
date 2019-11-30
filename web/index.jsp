<%-- 
    Document   : index
    Created on : 29/11/2019, 08:45:04 PM
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container-fluid hero d-flex flex-column justify-content-center align-items-center text-center" style="background-image: url(img/bg.jpg);">
    <div class="row">
        <div class="col-md-12">
            <h1 class="text-light">GAMES PLAZA</h1>
            <p class="text-light"><i class="fas fa-map-marker-alt text-success" style="font-size: 40px;"></i>CD. OBREGÓN, SONORA.</p>
            <button type="button" class="btn btn-warning text-light" style="padding: 10px 50px; font-weight: 700;">CONTACTAR</button>
        </div>
    </div>
</div>


<div class="container-fluid bg-success py-4">
    <div class="container">
        <h3 class="text-center text-white mb-3">¿Quiénes somos?</h3>
        <p class="text-white text-justify">
            Somos una empresa dedicada a la venta de videojuegos para múltiples consolas, desde los más clásicos hasta los más recientes y populares, pero no solo nos limitamos a eso, sino que también nos dedicamos a la venta de consolas, disponemos de una gran variedad de accesorios y figuras de colección, además de que brindamos servicio de reparación a consolas que han sido dañadas. 
        </p>	
    </div>

</div>

<div class="container py-4">

    <h3 class="text-dark bg-success py-2 rounded border border-dark">Productos</h3>

    <div class="bd-example">
        <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel" style="max-width: 600px; margin:0 auto;">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="3"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="4"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="5"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <a href="#">
                        <img src="img/funkos.jpg" class="d-block w-100" alt="...">
                    </a>
                    <div class="carousel-caption d-none d-md-block">
                        <h3>Funkos</h5>
                    </div>
                </div>
                <div class="carousel-item">
                    <a href="#">
                        <img src="img/accesorios.jpg" class="d-block w-100" alt="...">
                    </a>
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Accesorios</h5>
                    </div>
                </div>
                <div class="carousel-item">
                    <a href="#">
                        <img src="img/peluches.jpg" class="d-block w-100" alt="...">
                    </a>
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Peluches</h5>
                    </div>
                </div>
                <div class="carousel-item">
                    <a href="#">
                        <img src="img/consolas.jpg" class="d-block w-100" alt="...">
                    </a>
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Consolas</h5>
                    </div>
                </div>
                <div class="carousel-item">
                    <a href="#">
                        <img src="img/videojuegos.jpg" class="d-block w-100" alt="...">
                    </a>
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Videojuegos</h5>
                    </div>
                </div>
                <div class="carousel-item">
                    <a href="#">
                        <img src="img/mochilas.jpg" class="d-block w-100" alt="...">
                    </a>
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Mochilas</h5>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Anterior</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Siguiente</span>
            </a>
        </div>
    </div>
</div>



