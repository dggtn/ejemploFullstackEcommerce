package ar.edu.uade.ecommerce.controllers;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin
public class ProductoController {
    @Autowired
    private IProductoServicio productoServicio;


    @GetMapping
    public List<Producto> listarProductos(@RequestParam(required = false) String categoria) {
        if (categoria != null) {
            return productoServicio.obtenerProductosXCategoria(categoria);

        } else {
            return productoServicio.obtenerTodosLosProductos();

        }
    }

    @PostMapping
    public void crearProducto(@RequestBody Producto producto) {
        productoServicio.crearProducto(producto);

    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable Long id) {

        return productoServicio.obtenerProductoPorId(id);
}



    @DeleteMapping("delete/productos/{id}")
    public void eliminarProducto(@RequestBody Producto producto) {

        productoServicio.eliminarProducto(producto);
        }


}