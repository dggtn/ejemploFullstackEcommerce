package ar.edu.uade.ecommerce.repositorio;

import ar.com.uade.tiendaOnline.tpo.entidad.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepositorio extends JpaRepository<Pedido,Long> {
}
