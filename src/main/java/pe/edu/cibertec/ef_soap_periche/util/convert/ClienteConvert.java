package pe.edu.cibertec.ef_soap_periche.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ef_soap_periche.model.Cliente;
import pe.edu.cibertec.ws.objects.clientes.Clientews;

import java.util.ArrayList;
import java.util.List;
@Component
public class ClienteConvert {

    public Cliente mapToCliente(Clientews clientews){
        Cliente cliente = new Cliente();
        cliente.setIdcliente(clientews.getIdcliente());
        cliente.setNombre(clientews.getNombre());
        cliente.setEmail(clientews.getEmail());
        cliente.setTelefono(clientews.getTelefono());
        cliente.setDireccion(clientews.getDireccion());
        cliente.setFecharegistro(clientews.getFecharegistro());
        return cliente;
    }

    public Clientews mapToClientews(Cliente domicilio){
        Clientews clientews = new Clientews();
        clientews.setIdcliente(domicilio.getIdcliente());
        clientews.setNombre(domicilio.getNombre());
        clientews.setEmail(domicilio.getEmail());
        clientews.setTelefono(domicilio.getTelefono());
        clientews.setDireccion(domicilio.getDireccion());
        clientews.setFecharegistro(domicilio.getFecharegistro());
        return clientews;
    }

    public List<Cliente> mapToClienteList(List<Clientews> clientewsList){
        List<Cliente>  clienteList= new ArrayList<>();
        for (Clientews clientews : clientewsList){
            clienteList.add(mapToCliente(clientews));
        }
        return clienteList;
    }

    public List<Clientews> mapToClientewsList(List<Cliente> clienteList){
        List<Clientews> clientewsList = new ArrayList<>();
        for (Cliente cliente : clienteList){
            clientewsList.add(mapToClientews(cliente));
        }
        return clientewsList;
    }
}
