package cine.Repositories;

import org.springframework.data.repository.CrudRepository;
import cine.POJO.Pelicula;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends CrudRepository<Pelicula, Integer> {

}
