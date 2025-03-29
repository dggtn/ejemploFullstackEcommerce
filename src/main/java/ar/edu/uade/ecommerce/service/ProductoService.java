package ar.edu.uade.ecommerce.service;

import ar.edu.uade.ecommerce.entity.Category;
import ar.edu.uade.ecommerce.entity.Producto;
import ar.edu.uade.ecommerce.repository.IproductosRepository;
import ar.edu.uade.ecommerce.service.Interfaces.IproductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IproductoService {
    private IproductosRepository IproductosRepository;
    public ProductoService(@Autowired IproductosRepository repositorioProductosEnMemoria) {
        this.IproductosRepository = repositorioProductosEnMemoria;
    }

    public List<Producto> obtenerProductos(){
        return IproductosRepository.obtenerTodos();
    }

    public void agregarProducto(Producto producto) {
        IproductosRepository.guardar(producto);
    }

    @Override
    public List<Producto> obtenerProductosXCategoria(Category categoria ) {
            return IproductosRepository.obtenerProductosPorCategoria(categoria.getId());
        }


}
