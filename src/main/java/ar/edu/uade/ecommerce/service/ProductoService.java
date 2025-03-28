package ar.edu.uade.ecommerce.service;

import ar.edu.uade.ecommerce.entity.Producto;
import ar.edu.uade.ecommerce.repository.RepositorioProductosEnMemoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IproductoService {
    private RepositorioProductosEnMemoria repositorioProductosEnMemoria;
    public ProductoService(@Autowired RepositorioProductosEnMemoria repositorioProductosEnMemoria) {
        this.repositorioProductosEnMemoria = repositorioProductosEnMemoria;
    }

    public List<Producto> obtenerProductos(){
        return repositorioProductosEnMemoria.obtenerTodos();
    }

    public void agregarProducto(Producto producto) {
        repositorioProductosEnMemoria.guardar(producto);
    }

    public List<Producto> obtenerProductosXCategoria(String categoria) {
        return repositorioProductosEnMemoria.obtenerProductosPorCategoria(categoria);

    }


}
