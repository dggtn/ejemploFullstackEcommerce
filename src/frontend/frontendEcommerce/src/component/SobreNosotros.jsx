import { useEffect } from "react"
export default function Nosotros(){
    useEffect(() => {
        window.scrollTo(0, 0)
      }, [])
    return(
        <section className="relative bg-lightgreen-900 text-bg-green py-20 bg-cover bg-center bg-[url('/public/pic1.jpg')]">
        <div className="container mx-auto text-center px-4 md:px-8">
            <h1 className="mt-10 mr-100 text-4xl md:text-5xl font-extrabold mb-6 text-dark">
                Somos más que una dietética!
            </h1>
            <div className="mt-5 mr-100">
            <p className="text-lg mb-6 text-dark">
            Nos dedicamos a ser el lazo entre productores y consumidores conscientes!
                </p>
           
                <p className="text-lg mb-6 text-dark">
                Conectamos productores orgánicos de todo el páis con personas como tú!
                </p>
                <p className="text-lg mb-6 text-dark">
                    Personas que buscan productos saludables y de calidad!
                </p>
                <p className="text-lg mb-8 text-dark">
                    Nuestros proveedores tienen certificaciones que nos garantizan que sus productos son orgánicos y de comercio justo!
                </p>
            </div>

            <div className="mt-20 flex justify-center gap-4 mr-100">
                <button className="px-6 py-3 bg-green-900 text-white text-xl rounded-lg hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-green-500">
                    Me interesa comprar sus productos,quiero saber más sobre los mismos
                </button>
                <button className="px-6 py-3 bg-green-900 text-white text-xl rounded-lg hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-green-500">
                    Me interesa vender mis productos en su tienda online
                </button>
            </div>
            
        </div>
        </section>

    )


}