package servicio;

import dominio.Pelicula;

public interface IServicioPeliculasApp {
    public  void listarPeliculas();

    public void agregarPelicula(Pelicula pelicula);

    public  void  buscarPelicula(Pelicula pelicula);
}
