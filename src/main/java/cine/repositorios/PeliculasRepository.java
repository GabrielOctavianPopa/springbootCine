package cine.repositorios;

import org.springframework.data.repository.CrudRepository;
import cine.pojos.Pelicula;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends CrudRepository<Pelicula, Integer> {

}
