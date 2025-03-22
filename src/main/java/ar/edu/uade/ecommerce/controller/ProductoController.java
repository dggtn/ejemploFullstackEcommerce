package ar.edu.uade.ecommerce.controller;

import ar.edu.uade.ecommerce.modelo.Producto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/productos")
@CrossOrigin
public class ProductoController {
    @GetMapping
    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();
        Producto almendras = new Producto();
        Producto nuez = new Producto();
        Producto pistachio = new Producto();
        almendras.setNombre("almendra");
        nuez.setNombre("nuez");
        pistachio.setNombre("pistachio");

        almendras.setCategoria("frutas Secas");
        nuez.setCategoria("frutas Secas");
        pistachio.setCategoria("frutas Secas");

        almendras.setCantidad(100);
        nuez.setCantidad(100);
        pistachio.setCantidad(100);


        almendras.setPrecio(new BigDecimal("150.00"));
        nuez.setPrecio(new BigDecimal("300.00"));
        pistachio.setPrecio(new BigDecimal("200.00"));

        almendras.setId(1);
        nuez.setId(2);
        pistachio.setId(3);

        almendras.setImagen("/public/almendras.jpg");
        nuez.setImagen("/public/nueces.jpg");
        pistachio.setImagen("/public/pistacho.jpg");

        productos.add(almendras);
        productos.add(nuez);
        productos.add(pistachio);

        return productos;
    }
}
