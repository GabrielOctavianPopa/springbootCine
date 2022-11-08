package cine.POJO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sesiones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sesion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdSession")
    private Integer id;
    @Column(name = "Hora")
    private String hora;
    @Column(name = "Fecha")
    private String fecha;
    @Column(name = "IdSala")
    private String sala;
    @Column(name = "IdPelicula")
    private String pelicula;
}
