package ar.edu.uade.ecommerce.controller;

import ar.edu.uade.ecommerce.entity.Producto;
import ar.edu.uade.ecommerce.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/productos")
@CrossOrigin
public class ProductoController {
    private final ProductosService servicioDeProductos;

    public ProductoController(@Autowired ProductosService servicioDeProductos) {
        this.servicioDeProductos =  servicioDeProductos;
    }

    @GetMapping
    public List<Producto> listarProductos(@RequestParam (required = false) String categoria) {
        if (categoria != null && !categoria.isEmpty()){
            return servicioDeProductos.obtenerProductosXCategoria(categoria);

        }else{
            return servicioDeProductos.obtenerProductos();

        }
    }

    @PostMapping
    public void agregarProducto(@RequestBody Producto producto){
        servicioDeProductos.agregarProducto(producto);

    }

}
