package ar.edu.uade.ecommerce.service;

import ar.edu.uade.ecommerce.entity.Producto;

import java.util.List;

public interface ServcioInterfaz {
    public List<Producto> obtenerProductos();

    public void agregarProducto(Producto producto) ;


    public List<Producto> obtenerProductosXCategoria(String categoria);


}


