package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model.Plato;

import java.util.List;

@Repository
public interface PlatoRepository extends JpaRepository<Plato, Integer> {
    @Query(value = "SELECT * FROM Plato WHERE idplato = :idplato", nativeQuery=true)
    List<Plato> obtenerPlatosPorId(@Param("idplato") int idplato);

}
