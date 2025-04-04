package ar.edu.uade.ecommerce.entidad.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DetalleDeCompraRequest {
    private double montoTotal;
    private long id;
    private Date fecha;
}
