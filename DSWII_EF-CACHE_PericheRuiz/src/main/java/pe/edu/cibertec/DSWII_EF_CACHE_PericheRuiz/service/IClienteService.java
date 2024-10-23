package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.service;

import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> obtenerClientePorId(int idcliente);

    Cliente agregarCliente(Cliente cliente);

    Cliente actualizarCliente(Cliente cliente);

    void quitarCliente(Integer idcliente);

    void eliminarCache();
}
