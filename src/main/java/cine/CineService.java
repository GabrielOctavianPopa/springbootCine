package cine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CineService {
    @Autowired
    public PeliculasRepository peliculasRepository;

    public void addPelicula(Pelicula pelicula) {
        peliculasRepository.save(pelicula);
    }

    public ArrayList<Pelicula> getAllPeliculas() {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculasRepository.findAll().forEach(peliculas::add);
        return peliculas;
    }
}
