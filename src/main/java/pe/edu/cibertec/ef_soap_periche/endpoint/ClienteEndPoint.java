package pe.edu.cibertec.ef_soap_periche.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ef_soap_periche.service.IClienteService;
import pe.edu.cibertec.ws.objects.clientes.*;

@Endpoint
public class ClienteEndPoint {


    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private IClienteService clienteService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClientesRequest")
    @ResponsePayload
    public GetClientesResponse getClientes(@RequestPayload
                                           GetClientesRequest request){
        return clienteService.listarClientes();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDomicilioRequest")
    @ResponsePayload
    public GetClienteResponse getClienteXid(
            @RequestPayload GetClienteRequest request){
        return clienteService.obtenerClientexId(request.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postClienteRequest")
    @ResponsePayload
    public PostClienteResponse saveDomicilio(@RequestPayload
                                               PostClienteRequest request){
        return clienteService.registrarCliente(request);
    }

}
