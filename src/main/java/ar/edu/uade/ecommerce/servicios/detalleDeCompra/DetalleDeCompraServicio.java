package ar.edu.uade.ecommerce.servicios.detalleDeCompra;

import ar.com.uade.tiendaOnline.tpo.entidad.DetalleDeCompra;
import ar.com.uade.tiendaOnline.tpo.repositorio.DetalleCompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DetalleDeCompraServicio implements IDetalleDeCompraServicio{

    @Autowired
    private DetalleCompraRepositorio detalleRepositorio;


    @Override
    public List<DetalleDeCompra> mostraDetalleCompra(Long id) {
        return detalleRepositorio.findByIdCliente(id);
    }
}
