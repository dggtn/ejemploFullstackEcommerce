package ar.edu.uade.ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@Entity
public class Producto {
    @Column
    private String nombre;
    @Column
    Category categoria;
    @Column
    private int cantidad;
    @Column
    private BigDecimal precio;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String imagen;
}
