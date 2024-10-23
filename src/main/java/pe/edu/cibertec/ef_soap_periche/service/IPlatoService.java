package pe.edu.cibertec.ef_soap_periche.service;


import pe.edu.cibertec.ws.objects.platos.GetPlatoResponse;
import pe.edu.cibertec.ws.objects.platos.GetPlatosResponse;
import pe.edu.cibertec.ws.objects.platos.PostPlatoRequest;
import pe.edu.cibertec.ws.objects.platos.PostPlatoResponse;

public interface IPlatoService {
    GetPlatosResponse listarPlato();
    GetPlatoResponse obtenerPlatoXId(Integer id);
    PostPlatoResponse registrarPlato(PostPlatoRequest request);
    //
}
