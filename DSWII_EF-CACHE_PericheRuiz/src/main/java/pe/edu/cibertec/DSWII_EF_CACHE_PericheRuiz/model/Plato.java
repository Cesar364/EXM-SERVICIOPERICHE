package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Entity
@Table(name = "Plato")
public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idplato ;
    private String nombre ;
    private String descripcion ;
    private Double precio ;
    private String categoria ;
}
