package ar.edu.uade.ecommerce.repositorio;

import ar.com.uade.tiendaOnline.tpo.entidad.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface VendedorRepositorio extends JpaRepository<Pedido,Long> {
    @Query(value = "select p from Pedido p where p.vendedor.id = ?1")
    List<Pedido> pedidosPorVendedor(Long id) ;

}
