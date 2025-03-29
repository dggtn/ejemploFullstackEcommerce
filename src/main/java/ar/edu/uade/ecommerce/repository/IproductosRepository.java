package ar.edu.uade.ecommerce.repository;


import ar.edu.uade.ecommerce.entity.Category;
import ar.edu.uade.ecommerce.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IproductosRepository extends JpaRepository<Category, Long> {

    public List<Producto> obtenerTodos();

    public void guardar(Producto producto);

    public List<Producto> obtenerProductosPorCategoria(long categoria) ;
}
