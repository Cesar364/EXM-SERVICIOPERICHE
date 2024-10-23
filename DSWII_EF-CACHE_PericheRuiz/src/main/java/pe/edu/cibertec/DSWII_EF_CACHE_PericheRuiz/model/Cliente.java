package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "cliente ")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente ;
    private String nombre ;
    private String email ;
    private String telefono ;
    private String direccion ;
    private Date fecharegistro ;
}
