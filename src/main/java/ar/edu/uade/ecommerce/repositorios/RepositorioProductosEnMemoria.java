package ar.edu.uade.ecommerce.repositorios;


import ar.edu.uade.ecommerce.modelo.Producto;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@Repository
public class RepositorioProductosEnMemoria {
    private List<Producto> productos;

    public RepositorioProductosEnMemoria() {
        this.productos = new LinkedList<>();
        Producto almendras = new Producto();
        Producto nuez = new Producto();
        Producto pistachio = new Producto();
        almendras.setNombre("almendra");
        nuez.setNombre("nuez");
        pistachio.setNombre("pistachio");

        almendras.setCategoria("frutas_secas");
        nuez.setCategoria("frutas_secas");
        pistachio.setCategoria("frutas_secas");

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
    }

    public List<Producto> obtenerTodos() {
        return productos;
    }

    public void guardar(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> obtenerProductosPorCategoria(String categoria) {
        return productos.stream().filter((producto)->producto.getCategoria().equals(categoria)).toList();
    }
}
