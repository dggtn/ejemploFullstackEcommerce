import NewsLetter from "./NewsLetter"
export default function Home() {
    return (
        <>
        <section className="relative bg-lightgreen-900 text-bg-green py-20 bg-cover bg-center bg-[url('/public/background.jpg')]">
            <div className="container mx-auto text-center px-4 md:px-8">
                <h1 className="mt-32 text-4xl md:text-5xl font-extrabold mb-6 text-dark">
                    Bienvenidos a nuestra dietética
                </h1>
                <div className="mt-20">
                    <p className="text-lg mb-6 text-dark">
                        ¡Encuentra los mejores productos y los mejores precios!
                    </p>
                    <p className="text-lg mb-6 text-dark">
                        ¡Regístrate como vendedor o como comprador!
                    </p>
                    <p className="text-lg mb-8 text-dark">
                        Una vez registrado podrás ver todos nuestros productos
                    </p>
                </div>

                <div className="mt-20 flex justify-center gap-4">
                    <button className="px-6 py-3 bg-green-900 text-white text-xl rounded-lg hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-green-500">
                        Registrarme como vendedor
                    </button>
                    <button className="px-6 py-3 bg-green-900 text-white text-xl rounded-lg hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-green-500">
                        Registrarme como comprador
                    </button>
                </div>
                <button className="mt-10 px-6 py-3 mb-96 bg-green-900 text-white text-xl rounded-lg hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-green-500">
                    Hacé login acá si ya tenés tu cuenta!
                </button>
            </div>
            </section>
            <NewsLetter />
           
            </>

    )
}