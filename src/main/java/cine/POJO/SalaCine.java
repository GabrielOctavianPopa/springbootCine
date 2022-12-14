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
@Table(name = "salas")
public class SalaCine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdSala")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Ubicacion")
    private String ubicacion;
    @Column(name = "Capacidad")
    private String capacidad;
}
