package ar.edu.uade.ecommerce.controllers;


import ar.com.uade.tiendaOnline.tpo.servicios.pedido.IPedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedidos")
@CrossOrigin
public class PedidoController {
    @Autowired
    private IPedidoServicio pedidoServicio;


}