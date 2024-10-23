package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idorden ;
    @ManyToOne
    @JoinColumn(name = "clienteid")
    private Cliente clienteid;
    @ManyToOne
    @JoinColumn(name = "mesaId ")
    private Mesa mesaId ;
    private Date fechaorden;
    private Double total ;
}
