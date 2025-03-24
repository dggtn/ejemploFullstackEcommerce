package ar.edu.uade.ecommerce.servicios;


import ar.edu.uade.ecommerce.modelo.Receta;

import ar.edu.uade.ecommerce.repositorios.RepositorioRecetasEnMemoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioDeRecetas {
    private  RepositorioRecetasEnMemoria repositorioRecetasEnMemoria;
    public ServicioDeRecetas(@Autowired RepositorioRecetasEnMemoria repositorioRecetasEnMemoria) {
        this.repositorioRecetasEnMemoria = repositorioRecetasEnMemoria;
    }


    public List<Receta> obtenerRecetas(){
        return repositorioRecetasEnMemoria.obtenerTodos();
    }

    public void agregarReceta(Receta receta) {
        repositorioRecetasEnMemoria.guardar(receta);
    }
}
