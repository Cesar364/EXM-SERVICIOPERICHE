package pe.edu.cibertec.ef_soap_periche.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "plato")
public class Plato {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idplato;
    private String  nombre;
    private String  descripcion;
    private Integer precio;
    private String  categoria;

}
