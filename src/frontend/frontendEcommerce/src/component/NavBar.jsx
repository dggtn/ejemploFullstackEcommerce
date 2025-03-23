import { NavLink } from 'react-router-dom';

export default function NavBar() {
    const activeStyle = "underline underline-offset-4";
    return (
        <nav className='flex justify-between items-center  z-10 top-0 w-full py-5 px-8 text-sm font-light relative isolate overflow-hidden bg-green-900 sm:py-24 lg:py-20'>
            <ul className='flex items-center gap-3'>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink to="/">
                        <h1  className="text-white text-2xl">Dietética Consciente</h1>
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'> 
                    <NavLink
                        to='/categoria/frutas_secas'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                        <h1  className="text-white text-xl">Frutos Secos</h1> 
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/categoria/lacteos'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                        <h1  className="text-white text-xl">Lacteos</h1>
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/categoria/bebidas'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                         <h1  className="text-white text-xl">Bebidas</h1>
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/categoria/especias'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                        <h1  className="text-white text-xl"> Especies</h1>
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/categoria/frutas'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                         <h1  className="text-white text-xl">Frutas</h1>
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/formulario'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                         <h1  className="text-white text-xl">Contáctanos</h1>
                    </NavLink>
                </li>
            </ul>
            <div className="absolute top-0 left-1/2 -z-10 -translate-x-1/2 blur-3xl xl:-top-6" aria-hidden="true">
    <div className="aspect-1155/678 w-[72.1875rem] bg-linear-to-tr from-[#80ffc0] to-[#89fc8f] opacity-30" style={{ clipPath: "polygon(74.1% 44.1%, 100% 61.6%, 97.5% 26.9%, 85.5% 0.1%, 80.7% 2%, 72.5% 32.5%, 60.2% 62.4%, 52.4% 68.1%, 47.5% 58.3%, 45.2% 34.5%, 27.5% 76.7%, 0.1% 64.9%, 17.9% 100%, 27.6% 76.8%, 76.1% 97.7%, 74.1% 44.1%)" }}></div>
  </div>

        </nav>
    );
}