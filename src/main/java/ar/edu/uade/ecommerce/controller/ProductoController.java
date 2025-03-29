package ar.edu.uade.ecommerce.controller;

import ar.edu.uade.ecommerce.entity.Category;
import ar.edu.uade.ecommerce.entity.Producto;
import ar.edu.uade.ecommerce.service.Interfaces.IcategoryService;
import ar.edu.uade.ecommerce.service.Interfaces.IproductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/productos")
@CrossOrigin
public class ProductoController {
    @Autowired
    private IproductoService productoService ;


    @GetMapping
    public List<Producto> listarProductos(@RequestParam (required = false) Category categoria) {
        if (categoria != null){
            return productoService.obtenerProductosXCategoria(categoria);

        }else{
            return productoService.obtenerProductos();

        }
    }

    @PostMapping
    public void agregarProducto(@RequestBody Producto producto){
        productoService.agregarProducto(producto);

    }

}
