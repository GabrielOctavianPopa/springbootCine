package cine.Services;

import cine.POJO.Pelicula;
import cine.POJO.Sesion;
import cine.Repositories.PeliculasRepository;
import cine.POJO.SalaCine;
import cine.Repositories.SalaCineRepository;
import cine.Repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CineService {
    @Autowired
    public PeliculasRepository peliculasRepository;
    @Autowired
    public SalaCineRepository salaCineRepository;

    @Autowired
    public SessionRepository sessionRepository;

    public void addPelicula(Pelicula pelicula) {
        peliculasRepository.save(pelicula);
    }

    public ArrayList<Pelicula> getAllPeliculas() {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculasRepository.findAll().forEach(peliculas::add);
        return peliculas;
    }

    public void addSala(SalaCine sala) {
        salaCineRepository.save(sala);
    }

    public ArrayList<SalaCine> getAllSalas() {
        ArrayList<SalaCine> salas = new ArrayList<>();
        salaCineRepository.findAll().forEach(salas::add);
        return salas;
    }


    public void addSesion(Sesion sesion) {
        sessionRepository.save(sesion);
    }

    public ArrayList<Sesion> getAllSesiones() {
        ArrayList<Sesion> sesiones = new ArrayList<>();
        sessionRepository.findAll().forEach(sesiones::add);
        return sesiones;
    }

}
