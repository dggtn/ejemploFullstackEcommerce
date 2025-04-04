package ar.edu.uade.ecommerce.entidad;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Categoria {
    public Categoria(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descripcion;

}
