package ar.edu.uade.ecommerce.service;

import ar.edu.uade.ecommerce.modelo.Producto;
import ar.edu.uade.ecommerce.repository.RepositorioProductosEnMemoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDeProductos implements ServcioInterfaz{
    private RepositorioProductosEnMemoria repositorioProductosEnMemoria;
    public ServicioDeProductos(@Autowired RepositorioProductosEnMemoria repositorioProductosEnMemoria) {
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
