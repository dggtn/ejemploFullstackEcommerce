export default function Receta({nombre,descripcion,imagen}) {
    return (
        <div className="grid grid-cols-1 gap-x-6 gap-y-10 sm:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4 xl:gap-x-8">
            <a href="#" className="group">
                <img className="size-40" src={imagen}></img>
                <h3 className="mt-4 text-sm text-gray-700">{nombre}</h3>
                <p className="mt-1 text-lg font-medium text-gray-900">{descripcion}</p>
            </a>
        </div>
    )
}