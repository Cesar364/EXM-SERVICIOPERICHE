package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model.Mesa;


import java.util.List;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Integer> {
    @Query(value = "SELECT * FROM Mesa WHERE idmesa = :idmesa", nativeQuery=true)
    List<Mesa> obtenerMesaPorId(@Param("idmesa") Integer idmesa);

}
