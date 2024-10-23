package pe.edu.cibertec.ef_soap_periche.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;
    private String  nombre;
    private String  email;
    private Integer telefono;
    private String  direccion;
    private Date    fecharegistro;

}
