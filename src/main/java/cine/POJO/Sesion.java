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
@Table(name = "sesiones")
public class Sesion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdSession")
    private Integer id;
    @Column(name = "Hora")
    private String hora;
    @Column(name = "Fecha")
    private String fecha;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdPelicula")
    private Pelicula pelicula;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdSala")
    private SalaCine salaCine;
}
