export default function Footer() {
  return (
    < footer className="relative isolate overflow-hidden bg-green-900 py-16 sm:py-24 lg:py-32">
      <div className="mx-auto max-w-7xl px-6 lg:px-8">
        <div className="mx-auto grid max-w-2xl grid-cols-1 gap-x-8 gap-y-16 lg:max-w-none lg:grid-cols-2">
          <div className="max-w-xl lg:max-w-lg">
            <h2 className="text-4xl font-semibold tracking-tight text-white">
              &copy; Dietética Consciente</h2>
          </div>
          <ul className="flex flex-wrap items-center gap-y-2 gap-x-8">
            <li>
              <div
                as="a"
                href="#"
                
                className="text-white transition-colors hover:text-green-500 focus:text-green-500"
              >
                Sobre nosotros
              </div>
            </li>
            <li>
              <div
                as="a"
                href="#"
                
                className="text-white transition-colors hover:text-green-500 focus:text-green-500"
              >
                Licencia
              </div>
            </li>
            <li>
              <div
                as="a"
                href="#"
                
                className="text-white transition-colors hover:text-green-500 focus:text-green-500"
              >
                Contribuye
              </div>
            </li>
            <li>
              <div
                as="a"
                href="#"
              
                className="text-white transition-colors hover:text-green-500 focus:text-green-500"
              >
                Contactanos
              </div>
            </li>
          </ul>
          <div className="absolute top-0 left-1/2 -z-10 -translate-x-1/2 blur-3xl xl:-top-6" aria-hidden="true">
            <div className="aspect-1155/678 w-[72.1875rem] bg-linear-to-tr from-[#80ffc0] to-[#89fc8f] opacity-30" style={{ clipPath: "polygon(74.1% 44.1%, 100% 61.6%, 97.5% 26.9%, 85.5% 0.1%, 80.7% 2%, 72.5% 32.5%, 60.2% 62.4%, 52.4% 68.1%, 47.5% 58.3%, 45.2% 34.5%, 27.5% 76.7%, 0.1% 64.9%, 17.9% 100%, 27.6% 76.8%, 76.1% 97.7%, 74.1% 44.1%)" }}></div>
          </div>
        </div>
      </div>
    </footer>
  );
}