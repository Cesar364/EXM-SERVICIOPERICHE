package pe.edu.cibertec.ef_soap_periche.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "mesa")
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmesa;
    private Integer numero;
    private String  capacidad;
    private String  ubicacion;
    private boolean estado;

}
