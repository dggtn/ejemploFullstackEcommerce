package ar.edu.uade.ecommerce.entidad;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descripcion;


    @ManyToMany(mappedBy = "roles")
    private List<Cliente> usuarios;
}
