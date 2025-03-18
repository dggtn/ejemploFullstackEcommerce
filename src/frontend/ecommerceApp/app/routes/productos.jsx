import React from 'react';
export async function loader(){
    console.log("Pidiendo datos");
    let respuesta = await fetch("http://localhost:8080/productos")
    let productos = await respuesta.json();
    console.log(productos);
    return productos;
}

export default function Productos({loaderData}) {
    const productos = loaderData;
    const nombres = productos.map(producto => <li>{producto.nombre}</li>)
  return (
    nombres
  );
}