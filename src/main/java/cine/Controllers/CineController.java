package cine.Controllers;

import cine.POJO.Sesion;
import cine.Services.CineService;
import cine.POJO.Pelicula;
import cine.POJO.SalaCine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cine")
//create a controller to handle the request
public class CineController {
    @Autowired
    private CineService cineService;

    @PostMapping(path = "/add-movie") // Map ONLY POST Requests
    public @ResponseBody String addNewPelicula(@RequestBody Pelicula pelicula) {
        cineService.addPelicula(pelicula);
        return "Saved";
    }

    @GetMapping(path = "/all-movies")
    public @ResponseBody Iterable<Pelicula> getAllPeliculas() {
        return cineService.getAllPeliculas();
    }

    @PostMapping(path = "/add-cinema-room") // Map ONLY POST Requests
    public @ResponseBody String addNewSala(@RequestBody SalaCine sala) {
        cineService.addSala(sala);
        return "Saved";
    }

    @GetMapping(path = "/all-cinema-rooms")
    public @ResponseBody Iterable<SalaCine> getAllSalas() {
        return cineService.getAllSalas();
    }

    @PostMapping(path = "add-session")
    public @ResponseBody String addNewSesion(@RequestBody Sesion sesion) {
        cineService.addSesion(sesion);
        return "Saved";
    }

    @GetMapping(path = "/all-sessions")
    public @ResponseBody Iterable<Sesion> getAllSesiones() {
        return cineService.getAllSesiones();
    }
}

