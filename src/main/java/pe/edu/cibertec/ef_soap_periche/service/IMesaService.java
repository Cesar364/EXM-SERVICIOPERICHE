package pe.edu.cibertec.ef_soap_periche.service;


import pe.edu.cibertec.ws.objects.mesa.GetMesaResponse;
import pe.edu.cibertec.ws.objects.mesa.GetMesasResponse;
import pe.edu.cibertec.ws.objects.mesa.PostMesaRequest;
import pe.edu.cibertec.ws.objects.mesa.PostMesaResponse;

public interface IMesaService {
    GetMesasResponse listarMesa();
    GetMesaResponse  obtenerMesaXId(Integer id);
    PostMesaResponse registrarMesa(PostMesaRequest request);
    //
}
