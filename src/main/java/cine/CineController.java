package cine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cine")
//create a controller to handle the request
public class CineController {
    @Autowired
    private CineService cineService;

    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody String addNewPelicula(@RequestBody Pelicula pelicula) {
        cineService.addPelicula(pelicula);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Pelicula> getAllPeliculas() {
        return cineService.getAllPeliculas();
    }

}

