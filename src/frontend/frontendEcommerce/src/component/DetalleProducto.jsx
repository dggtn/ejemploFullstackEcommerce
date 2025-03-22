import { useParams } from 'react-router-dom';

export default function Detalleproducto() {
    const params = useParams()
    return (
        <div class="bg-white">
        <div class="mx-auto grid max-w-2xl grid-cols-1 items-center gap-x-8 gap-y-16 px-4 py-24 sm:px-6 sm:py-32 lg:max-w-7xl lg:grid-cols-2 lg:px-8">
          <div>
            <h2 class="text-3xl font-bold tracking-tight text-gray-900 sm:text-4xl">Detalles de {producto.nombre}:</h2>
            <p class="mt-4 text-gray-500">{producto.nombre}es organico.</p>
      
            <dl class="mt-16 grid grid-cols-1 gap-x-6 gap-y-10 sm:grid-cols-2 sm:gap-y-16 lg:gap-x-8">
              <div class="border-t border-gray-200 pt-4">
                <dt class="font-medium text-gray-900">Origen</dt>
                <dd class="mt-2 text-sm text-gray-500">Producido por:</dd>
              </div>
            </dl>
          </div>
          </div>
          </div>
        
    )
}