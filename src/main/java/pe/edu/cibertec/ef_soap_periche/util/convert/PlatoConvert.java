package pe.edu.cibertec.ef_soap_periche.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ef_soap_periche.model.Plato;
import pe.edu.cibertec.ws.objects.platos.Platosws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class PlatoConvert {


    public Plato mapToPlato(Platosws platosws){
        Plato plato = new Plato();
        plato.setIdplato(platosws.getIdplato());
        plato.setNombre(platosws.getNombre());
        plato.setCategoria(platosws.getCategoria());
        plato.setDescripcion(platosws.getDescripcion());
        plato.setPrecio(platosws.getPrecio());

    return plato;
    }

    public Platosws mapToPlatosws(Plato plato){
        Platosws platosws = new Platosws();
        platosws.setIdplato(plato.getIdplato());
        platosws.setNombre(plato.getNombre());
        platosws.setCategoria(plato.getCategoria());
        platosws.setDescripcion(plato.getDescripcion());
        platosws.setPrecio(BigDecimal.valueOf(plato.getPrecio()));

        return platosws;
    }


    public List<Plato> mapToPlatoList(List<Platosws> platoswsList){
        List<Plato>  platoList= new ArrayList<>();
        for (Platosws platosws : platoswsList){
            platoList.add(mapToPlato(platosws));
        }
        return platoList;
    }

    public List<Platosws> mapToPlatoswsList(List<Plato> platoList){
        List<Platosws> platoswsList = new ArrayList<>();
        for (Plato plato : platoList){
            platoswsList.add(mapToPlatosws(plato));
        }
        return platoswsList;
    }

}
