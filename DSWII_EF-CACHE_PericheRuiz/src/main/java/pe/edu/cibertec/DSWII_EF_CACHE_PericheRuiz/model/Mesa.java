package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@Entity
@Table(name = "Orden")
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmesa ;
    private Integer numero ;
    private Integer capacidad ;
    private String ubicacion ;
    private Boolean estado ;
}
