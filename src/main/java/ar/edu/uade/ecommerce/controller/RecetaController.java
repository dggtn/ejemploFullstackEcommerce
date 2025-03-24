package ar.edu.uade.ecommerce.controller;

import ar.edu.uade.ecommerce.modelo.Producto;
import ar.edu.uade.ecommerce.modelo.Receta;
import ar.edu.uade.ecommerce.servicios.ServicioDeProductos;
import ar.edu.uade.ecommerce.servicios.ServicioDeRecetas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/recetas")
@CrossOrigin
public class RecetaController {
    private final ServicioDeRecetas servicioDeRecetas;

    public RecetaController(@Autowired ServicioDeRecetas servicioDeRecetas) {
        this.servicioDeRecetas =  servicioDeRecetas;
    }

    @GetMapping
    public List<Receta> listarRecetas() {
        return servicioDeRecetas.obtenerRecetas();

    }

    @PostMapping
    public void agregarRecetas(@RequestBody Receta receta){
        servicioDeRecetas.agregarReceta(receta);

    }

}
