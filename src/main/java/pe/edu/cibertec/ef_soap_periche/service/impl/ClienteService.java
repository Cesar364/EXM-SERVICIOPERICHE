package pe.edu.cibertec.ef_soap_periche.service.impl;

import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ef_soap_periche.exception.NotFoundException;
import pe.edu.cibertec.ef_soap_periche.model.Cliente;
import pe.edu.cibertec.ef_soap_periche.repository.ClienteRepository;
import pe.edu.cibertec.ef_soap_periche.service.IClienteService;
import pe.edu.cibertec.ef_soap_periche.util.convert.ClienteConvert;
import pe.edu.cibertec.ws.objects.clientes.GetClienteResponse;
import pe.edu.cibertec.ws.objects.clientes.GetClientesResponse;
import pe.edu.cibertec.ws.objects.clientes.PostClienteRequest;
import pe.edu.cibertec.ws.objects.clientes.PostClienteResponse;

@RequiredArgsConstructor
@Service

public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteConvert clienteConvert;

    @Override
    public GetClientesResponse listarClientes() {
        GetClientesResponse getClientesResponse= new GetClientesResponse();
        getClientesResponse.getClientes().addAll(clienteConvert.mapToClientewsList(clienteRepository.findAll()));
        return getClientesResponse;
    }

    @Override
    public GetClienteResponse obtenerClientexId(Integer id) {
        GetClienteResponse clienteResponse = new GetClienteResponse();
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if (cliente == null){
            throw  new NotFoundException("El cliente con el siguiente ID"+id+"no existe.");
        }
        clienteResponse.setCliente(clienteConvert.mapToClientews(cliente));
        return clienteResponse;
    }

    @Override
    public PostClienteResponse registrarCliente(PostClienteRequest request) {
        PostClienteResponse postClienteResponse = new PostClienteResponse();
        Cliente nuevoCliente = clienteRepository.save(clienteConvert.mapToCliente(request.getCliente()));
        postClienteResponse.setCliente(clienteConvert.mapToClientews(nuevoCliente));
        return postClienteResponse;
    }
}
