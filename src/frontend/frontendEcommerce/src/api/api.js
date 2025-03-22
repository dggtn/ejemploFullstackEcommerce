export async function obtenerProductos() {
    let respuesta = await fetch("http://localhost:8080/productos")
    return await respuesta.json();
}
