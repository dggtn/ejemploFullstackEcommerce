import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { obtenerProductos } from '../api/api';
import Producto from './Producto';

export default function Catalogo() {
    const params = useParams();
    const [productos, setProductos] = useState([])
    useEffect(() => {
        let promesa = obtenerProductos();
        promesa.then((productos) => setProductos(productos))
    }, [params]);

    return (
        <div className="bg-white">
            <div className="mx-auto max-w-2xl px-4 py-16 sm:px-6 sm:py-24 lg:max-w-7xl lg:px-8">
                <h2 className="sr-only">Productos</h2>
                {
                    productos.map((producto) => (
                        <Producto nombre={producto.nombre} precio={producto.precio} imagen={producto.imagen} key={producto.id}/>
                    ))
                }
            </div>
        </div>
    )
}