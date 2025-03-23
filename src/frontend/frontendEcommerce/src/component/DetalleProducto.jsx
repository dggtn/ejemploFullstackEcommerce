import { useParams } from 'react-router-dom';

export default function Detalleproducto() {
    const params = useParams()
        const [productos, setProductos] = useState([])
        useEffect(() => {
            let promesa = obtenerProducto(params);
            promesa.then((productos) => setProducto(productos))
        }, [params]);
    
    return (
        <div className="bg-white">
        <div className="mx-auto grid max-w-2xl grid-cols-1 items-center gap-x-8 gap-y-16 px-4 py-24 sm:px-6 sm:py-32 lg:max-w-7xl lg:grid-cols-2 lg:px-8">
          <div>
            <h2 className="text-3xl font-bold tracking-tight text-gray-900 sm:text-4xl">Detalles de {producto.nombre}:</h2>
            <p className="mt-4 text-gray-500">{producto.nombre}es organico.</p>
      
            <dl className="mt-16 grid grid-cols-1 gap-x-6 gap-y-10 sm:grid-cols-2 sm:gap-y-16 lg:gap-x-8">
              <div className="border-t border-gray-200 pt-4">
                <dt className="font-medium text-gray-900">Origen</dt>
                <dd className="mt-2 text-sm text-gray-500">Producido por:</dd>
              </div>
            </dl>
          </div>
          </div>
          </div>
        
    )
}