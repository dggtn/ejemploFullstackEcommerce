package ar.edu.uade.ecommerce.excepciones;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "El producto que se intenta agregar esta duplicada")
public class CategoriaDuplicateExcepcion extends Exception {
}
