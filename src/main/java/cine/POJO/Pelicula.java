package cine.POJO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "peliculas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pelicula implements Serializable {
    @Id
    @Column(name = "IdPelicula")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Director")
    private String director;
    @Column(name = "Año")
    private String año;
    @Column(name = "Duracion")
    private String duracion;
    @Column(name = "Genero")
    private String Genero;
}
