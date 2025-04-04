package ar.edu.uade.ecommerce.servicios.detalleDeCompra;

import ar.com.uade.tiendaOnline.tpo.entidad.DetalleDeCompra;

import java.util.List;

public interface IDetalleDeCompraServicio {
   List<DetalleDeCompra> mostraDetalleCompra(Long id);
}
