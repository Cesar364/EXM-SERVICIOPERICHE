package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model.Mesa;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.repository.MesaRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.service.IMesaService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MesaService implements IMesaService {
    private final MesaRepository mesaRepository;

    @Cacheable(value = "MesaXid", key = "idmesa")
    @Override
    public List<Mesa> obtenerMesaPorId(Integer idmesa) {
        return mesaRepository.obtenerMesaPorId(idmesa);
    }

    @CacheEvict(value = "MesaXid", allEntries = true)
    @Override
    public Mesa agregarMesa(Mesa mesa) {

        return mesaRepository.save(mesa);
    }

    @CachePut(value = "MesaXid", key = "#mesa.idmesa")
    @Override
    public Mesa actualizarMesa(Mesa mesa) {
        Mesa mesaExistente = mesaRepository.findById(mesa.getIdmesa()).orElse(null);
        if (mesaExistente != null) {
            mesaExistente.setNumero(mesa.getNumero());
            mesaExistente.setCapacidad(mesa.getCapacidad());
            mesaExistente.setUbicacion(mesa.getUbicacion());
            mesaExistente.setEstado(mesa.getEstado());
            return mesaRepository.save(mesaExistente);
        }
        return null;
    }

    @CacheEvict(value = "MesaXid", allEntries = true)
    @Override
    public void quitarMesa(Integer idmesa) {
        mesaRepository.deleteById(idmesa);
    }

    @CacheEvict(value = "MesaXid", allEntries = true)
    @Override
    public void eliminarCache() {

    }
}
