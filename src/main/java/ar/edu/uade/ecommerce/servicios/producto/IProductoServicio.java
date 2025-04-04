package ar.edu.uade.ecommerce.servicios.producto;

import ar.com.uade.tiendaOnline.tpo.entidad.Producto;

import java.util.List;

public interface IProductoServicio {
    List<Producto> obtenerTodosLosProductos();

     void crearProducto(Producto producto) ;


    List<Producto> obtenerProductosXCategoria(String categoria);

    void eliminarProducto(Producto producto);

    Producto obtenerProductoPorId(Long id);
}
