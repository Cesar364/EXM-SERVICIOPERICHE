package pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.service;


import pe.edu.cibertec.DSWII_EF_CACHE_PericheRuiz.model.Plato;

import java.util.List;

public interface IPlatoService {

    List<Plato> obtenerPlatoPorId(Integer idplato);

    Plato agregarPlato(Plato idplato);

    Plato actualizarPlato(Plato idplato);

    void quitarPlato(Integer idplato);

    void eliminarCache();
}
