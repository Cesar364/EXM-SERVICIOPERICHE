package pe.edu.cibertec.ef_soap_periche.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ef_soap_periche.model.Mesa;
import pe.edu.cibertec.ws.objects.mesa.Mesaws;

import java.util.ArrayList;
import java.util.List;

@Component
public class MesaConvert {

    public Mesa mapToMesa(Mesaws mesaws){
        Mesa mesa = new Mesa();
        mesa.setIdmesa(mesaws.getIdmesa());
        mesa.setNumero(mesaws.getNumero());
        mesa.setUbicacion(mesaws.getUbicacion());
        return mesa;

}
    public Mesaws mapToMesaws(Mesa mesa){
        Mesaws mesaws = new Mesaws();
        mesaws.setIdmesa(mesa.getIdmesa());
        mesaws.setNumero(mesa.getNumero());
        mesaws.setUbicacion(mesa.getUbicacion());
        return mesaws;
    }

    public List<Mesa> mapToMesaList(List<Mesaws> mesawsList){
        List<Mesa> mesaList = new ArrayList<>();
        for (Mesaws mesaws : mesawsList){
            mesaList.add(mapToMesa(mesaws));
        }
        return mesaList;
    }

    public List<Mesaws> mapToMesawsList(List<Mesa> mesaList){
        List<Mesaws> mesawsList = new ArrayList<>();
        for (Mesa mesa : mesaList){
            mesawsList.add(mapToMesaws(mesa));
        }
        return mesawsList;
    }


}
