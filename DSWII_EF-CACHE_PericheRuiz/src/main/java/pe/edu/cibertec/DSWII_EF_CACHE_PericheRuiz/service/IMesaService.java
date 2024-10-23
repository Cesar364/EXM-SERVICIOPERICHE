package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.service;


import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model.Mesa;

import java.util.List;

public interface IMesaService {
    List<Mesa> obtenerMesaPorId(Integer idmesa);

    Mesa agregarMesa(Mesa mesa);

    Mesa actualizarMesa(Mesa mesa);

    void quitarMesa(Integer idmesa);

    void eliminarCache();
}
