package pe.edu.cibertec.ef_soap_periche.service;

import pe.edu.cibertec.ws.objects.clientes.GetClienteResponse;
import pe.edu.cibertec.ws.objects.clientes.GetClientesResponse;
import pe.edu.cibertec.ws.objects.clientes.PostClienteRequest;
import pe.edu.cibertec.ws.objects.clientes.PostClienteResponse;

public interface IClienteService {

    GetClientesResponse listarClientes();
    GetClienteResponse obtenerClientexId(Integer id);
    PostClienteResponse registrarCliente(PostClienteRequest request);
    //
}
