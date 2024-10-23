package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model.Cliente;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.repository.ClienteRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.service.IClienteService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {
    private final ClienteRepository clienteRepository;

    @Cacheable(value = "CliId", key = "idcliente")
    @Override
    public List<Cliente> obtenerClientePorId(int idcliente) {
        return clienteRepository.obtenerClientePorId(idcliente);
    }

    @CacheEvict(value = "CliId", allEntries = true)
    @Override
    public Cliente agregarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @CachePut(value = "CliId", key = "#cliente.idcliente")
    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        Cliente clienteExistente = clienteRepository.findById(cliente.getIdcliente()).orElse(null);
        if (clienteExistente != null) {
            clienteExistente.setNombre(cliente.getNombre());
            clienteExistente.setEmail(cliente.getEmail());
            clienteExistente.setTelefono(cliente.getTelefono());
            clienteExistente.setDireccion(cliente.getDireccion());
            clienteExistente.setFecharegistro(cliente.getFecharegistro());
            return clienteRepository.save(clienteExistente);
        }
        return null;
    }

    @CacheEvict(value = "CliId", allEntries = true)
    @Override
    public void quitarCliente(Integer idcliente) {
        clienteRepository.deleteById(idcliente);
    }

    @CacheEvict(value = "CliId", allEntries = true)
    @Override
    public void eliminarCache() {

    }
}
