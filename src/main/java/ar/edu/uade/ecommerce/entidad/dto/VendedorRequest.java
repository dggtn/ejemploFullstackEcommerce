package ar.edu.uade.ecommerce.entidad.dto;

import ar.com.uade.tiendaOnline.tpo.entidad.Pedido;
import ar.com.uade.tiendaOnline.tpo.entidad.Rol;

import java.util.List;

public class VendedorRequest {
    private Long id;
    private String email;
    private String nombre;
    private String nombreEmprendimiento;
    private String apellido;
    private List<Pedido> pedidos;
    private List<Rol> roles;
}
