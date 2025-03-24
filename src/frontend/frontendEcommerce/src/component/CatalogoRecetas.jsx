import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { obtenerRecetas } from '../api/api';
import Receta from './Receta';
import Spinner from './Spinner';

export default function Catalogo() {
    const params = useParams();
    const [recetas, setRecetas] = useState([])
    useEffect(() => {
        let promesa = obtenerRecetas(params);
        promesa.then((productos) => setRecetas(recetas))
    });

    return (
        <>
            {
                recetas.length > 0 ?
                    (
                        <div className="bg-white card">
                            <div className="mx-auto max-w-2xl px-2 py-4 sm:px-3 sm:py-24 lg:max-w-7xl lg:px-4  ">
                                <div className="grid grid-cols-1 gap-x-2 gap-y-5 sm:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4 xl:gap-x-4  ">

                                    {
                                        productos.map((receta) => (
                                            <Receta nombre={producto.nombre} precio={producto.precio} imagen={producto.imagen} key={producto.id} />
                                        ))
                                    }
                                </div>
                            </div>
                        </div>
                    ) :
                    (
                        <Spinner/>
                    )

            }
        </>
    )
}