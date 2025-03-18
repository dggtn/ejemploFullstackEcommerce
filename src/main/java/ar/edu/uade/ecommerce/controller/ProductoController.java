package ar.edu.uade.ecommerce.controller;

import ar.edu.uade.ecommerce.modelo.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/productos")
public class ProductoController {
    @GetMapping
    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();
        Producto almendras = new Producto();
        Producto nuez = new Producto();


        almendras.setNombre("almendra");
        nuez.setNombre("nuez");

        productos.add(almendras);
        productos.add(nuez);

        return productos;
    }
}
