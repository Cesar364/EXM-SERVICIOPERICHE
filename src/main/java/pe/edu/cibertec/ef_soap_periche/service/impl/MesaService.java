package pe.edu.cibertec.ef_soap_periche.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ef_soap_periche.model.Mesa;
import pe.edu.cibertec.ef_soap_periche.repository.MesaRepository;
import pe.edu.cibertec.ef_soap_periche.service.IMesaService;
import pe.edu.cibertec.ef_soap_periche.util.convert.MesaConvert;
import pe.edu.cibertec.ws.objects.mesa.GetMesaResponse;
import pe.edu.cibertec.ws.objects.mesa.GetMesasResponse;
import pe.edu.cibertec.ws.objects.mesa.PostMesaRequest;
import pe.edu.cibertec.ws.objects.mesa.PostMesaResponse;

@RequiredArgsConstructor
@Service

public class MesaService implements IMesaService {

    private final MesaRepository mesaRepository;
    private final MesaConvert mesaConvert;


    @Override
    public GetMesasResponse listarMesa() {
        GetMesasResponse getMesasResponse = new GetMesasResponse();
        getMesasResponse.getMesa().addAll(
                mesaConvert.mapToMesawsList(mesaRepository.findAll())
        );
        return getMesasResponse;
    }


    @Override
    public GetMesaResponse obtenerMesaXId(Integer id) {
        GetMesaResponse mesaResponse = new GetMesaResponse();
        Mesa mesa = mesaRepository.findById(id).orElse(null);
        mesaResponse.setMesa(
                mesaConvert.mapToMesaws(mesa));
        return mesaResponse;
    }

    @Override
    public PostMesaResponse registrarMesa(PostMesaRequest request) {
        PostMesaResponse postMesaResponse = new PostMesaResponse();
        Mesa nuevaMesa = mesaRepository.save(
                mesaConvert.mapToMesa(request.getMesa())
        );
        postMesaResponse.setMesa(
                mesaConvert.mapToMesaws(nuevaMesa));
        return postMesaResponse;

    }

}
