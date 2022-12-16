package cine.POJO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "peliculas")
public class Pelicula implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdPelicula")
    private Integer IdPelicula;
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
