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


        //lacteos

        Producto lecheVegetalAlmendras = new Producto();
        Producto yogurtGriego = new Producto();
        lecheVegetalAlmendras.setNombre("Leche vegetal de Almendras");
        yogurtGriego.setNombre("yogurt Griego");
        lecheVegetalAlmendras.setCategoria("lacteos");
        yogurtGriego.setCategoria("lacteos");
        lecheVegetalAlmendras.setCantidad(100);
        yogurtGriego.setCantidad(100);
        lecheVegetalAlmendras.setPrecio(new BigDecimal("150.00"));
        yogurtGriego.setPrecio(new BigDecimal("300.00"));
        yogurtGriego.setId(4);
        lecheVegetalAlmendras.setId(5);
        lecheVegetalAlmendras.setImagen("/public/almondMilk.jpg");
        yogurtGriego.setImagen("/public/yogurtGriego.jpg");

        productos.add(lecheVegetalAlmendras);
        productos.add(yogurtGriego);



        //Bebidas

        Producto JugoNatural = new Producto();
        Producto GaseosaNatural = new Producto();
        JugoNatural.setNombre("Jugo de fruta natural");
        GaseosaNatural.setNombre("Gaseosa Natural");
        JugoNatural.setCategoria("bebidas");
        GaseosaNatural.setCategoria("bebidas");
        JugoNatural.setCantidad(100);
        GaseosaNatural.setCantidad(100);
        JugoNatural.setPrecio(new BigDecimal("150.00"));
        GaseosaNatural.setPrecio(new BigDecimal("300.00"));
        JugoNatural.setId(6);
        GaseosaNatural.setId(7);
        JugoNatural.setImagen("/public/jugo.jpg");
        GaseosaNatural.setImagen("/public/gaseosa.jpg");

        productos.add(JugoNatural);
        productos.add(GaseosaNatural);
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
