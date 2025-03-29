package ar.edu.uade.ecommerce.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Producto {
    private String nombre;
    private String categoria;
    private int cantidad;
    private BigDecimal precio;
    private long id;
    private String imagen;
}
