package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model.Cliente;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    @Query(value = "SELECT * FROM cliente WHERE idcliente = :idcliente", nativeQuery=true)
    List<Cliente> obtenerClientePorId(@Param("idcliente") int idcliente );

}
