package cine;

import org.springframework.data.repository.CrudRepository;
import cine.Pelicula;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends  CrudRepository<Pelicula, Integer> {

}
