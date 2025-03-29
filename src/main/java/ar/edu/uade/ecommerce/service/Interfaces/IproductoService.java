package ar.edu.uade.ecommerce.service.Interfaces;


import ar.edu.uade.ecommerce.entity.Category;
import ar.edu.uade.ecommerce.entity.Producto;

import java.util.List;

public interface IproductoService {
    public List<Producto> obtenerProductos();

    public void agregarProducto(Producto producto) ;


    public List<Producto> obtenerProductosXCategoria(Category categoria);

}

