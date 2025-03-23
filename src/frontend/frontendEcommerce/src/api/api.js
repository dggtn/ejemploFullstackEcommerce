export async function obtenerProductos(params) {
    let url = "http://localhost:8080/productos";
    if (params.id) {
        url = url + "?categoria=" + params.id;
    }
    let respuesta = await fetch(url)
    return await respuesta.json();
}
export async function obtenerRecetas() {
    let url = "http://localhost:8080/recetas";
    url = url ;
    let respuesta = await fetch(url)
    return await respuesta.json();
}