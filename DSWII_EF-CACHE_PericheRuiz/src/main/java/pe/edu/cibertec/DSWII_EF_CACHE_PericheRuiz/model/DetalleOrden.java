package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idordendetail ;
    private String ordenId ;
    @ManyToOne
    @JoinColumn(name = "platoid")
    private Plato platoId ;
    private String cantidad ;
    private String subtotal ;
}
