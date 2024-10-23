package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model.Plato;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.repository.PlatoRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.service.IPlatoService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PlatoService implements IPlatoService {

    private final PlatoRepository platoRepository;

    @Cacheable(value = "PlatoXid", key = "idplato")
    @Override
    public List<Plato> obtenerPlatoPorId(Integer idplato) {
        return List.of();
    }

    @CacheEvict(value = "PlatoXid", allEntries = true)
    @Override
    public Plato agregarPlato(Plato plato) {
        return platoRepository.save(plato);
    }

    @CachePut(value = "PlatoXid", key = "#plato.idplato")
    @Override
    public Plato actualizarPlato(Plato plato) {
        Plato platoExistente = platoRepository.findById(plato.getIdplato()).orElse(null);
        if (platoExistente != null) {
            platoExistente.setNombre(plato.getNombre());
            platoExistente.setDescripcion(plato.getDescripcion());
            platoExistente.setPrecio(plato.getPrecio());
            platoExistente.setCategoria(plato.getCategoria());
            return platoRepository.save(platoExistente);
        }
        return null;
    }

    @CacheEvict(value = "PlatoXid", allEntries = true)
    @Override
    public void quitarPlato(Integer idplato) {
        platoRepository.deleteById(idplato);
    }

    @CacheEvict(value = "PlatoXid", allEntries = true)
    @Override
    public void eliminarCache() {
    }
}
