package cine.POJO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "salas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalaCine implements Serializable {
    @Id
    @Column(name = "IdSala")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Ubicacion")
    private String ubicacion;
    @Column(name = "Capacidad")
    private String capacidad;
}
