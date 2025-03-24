package ar.edu.uade.ecommerce.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Receta {
    private String nombre;
    private String descripcion;
    private long id;
    private String imagen;
}