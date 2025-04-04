package ar.edu.uade.ecommerce.controllers;


import ar.edu.uade.ecommerce.servicios.categoria.CategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.Optional;


@RestController
@RequestMapping("categorias")
public class CategoriaController {

        @Autowired
        private CategoriaServicio categoriaServicio;

        @GetMapping
        public ResponseEntity<Page<Categoria>> getCategorias(
                @RequestParam(required = false) Integer page,
                @RequestParam(required = false) Integer size) {
            if (page == null || size == null)
                return ResponseEntity.ok(categoriaServicio.getCategorias(PageRequest.of(0, Integer.MAX_VALUE)));
            return ResponseEntity.ok(categoriaServicio.getCategorias(PageRequest.of(page, size)));
        }

        @GetMapping("/{categoriaId}")
        public ResponseEntity<Categoria> getCategoriaById(@PathVariable Long categoriaId) {
            Optional<Categoria> result = categoriaServicio.getCategoriaById(categoriaId);
            if (result.isPresent())
                return ResponseEntity.ok(result.get());

            return ResponseEntity.noContent().build();
        }

        @PostMapping
        public ResponseEntity<Object> crearCategoria(@RequestBody CategoriaRequest categoriaRequest)
                throws CategoriaDuplicateExcepcion {
            Categoria result = categoriaServicio.crearCategoria(categoriaRequest.getDescripcion());
            return ResponseEntity.created(URI.create("/categorias/" + result.getId())).body(result);
        }
    }

