package pe.edu.cibertec.ef_soap_periche.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.ef_soap_periche.model.Plato;
import pe.edu.cibertec.ef_soap_periche.repository.ClienteRepository;
import pe.edu.cibertec.ef_soap_periche.repository.PlatoRepository;
import pe.edu.cibertec.ef_soap_periche.service.IPlatoService;
import pe.edu.cibertec.ef_soap_periche.util.convert.ClienteConvert;
import pe.edu.cibertec.ef_soap_periche.util.convert.PlatoConvert;
import pe.edu.cibertec.ws.objects.platos.GetPlatoResponse;
import pe.edu.cibertec.ws.objects.platos.GetPlatosResponse;
import pe.edu.cibertec.ws.objects.platos.PostPlatoRequest;
import pe.edu.cibertec.ws.objects.platos.PostPlatoResponse;

@RequiredArgsConstructor
@Service
public class PlatoService implements IPlatoService {
    private final PlatoRepository platoRepository;
    private final PlatoConvert platoConvert;

    @Override
    public GetPlatosResponse listarPlato() {
        GetPlatosResponse getPlatosResponse = new GetPlatosResponse();
        getPlatosResponse.getPlatos().addAll(
                platoConvert.mapToPlatoswsList(platoRepository.findAll())
        );
        return getPlatosResponse;
    }
    @Override
    public GetPlatoResponse obtenerPlatoXId(Integer id) {
        GetPlatoResponse platoResponse = new GetPlatoResponse();
        Plato plato = platoRepository.findById(id).orElse(null);
        platoResponse.setPlato(
                platoConvert.mapToPlatosws(plato));
        return platoResponse;
    }

    @Override
    public PostPlatoResponse registrarPlato(PostPlatoRequest request) {
        PostPlatoResponse postPlatoResponse = new PostPlatoResponse();
        Plato newPlato = platoRepository.save(
                platoConvert.mapToPlato(request.getPlato())
        );
        postPlatoResponse.setPlato(
                platoConvert.mapToPlatosws(newPlato));
        return postPlatoResponse;

    }
}
