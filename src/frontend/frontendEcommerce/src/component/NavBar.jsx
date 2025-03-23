import { NavLink } from 'react-router-dom';

export default function NavBar() {
    const activeStyle = "underline underline-offset-4";
    return (
        <nav className='flex justify-between items-center  z-10 top-0 w-full py-5 px-8 text-sm font-light relative isolate overflow-hidden bg-green-900 sm:py-24 lg:py-20'>
            <ul className='flex items-center gap-3'>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink to="/">
                        <h1 className="text-white text-2xl">Dietética Consciente</h1>
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/categoria/frutas_secas'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                        <h1 className="text-white text-xl">Frutos Secos</h1>
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/categoria/lacteos'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                        <h1 className="text-white text-xl">Lacteos</h1>
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/categoria/bebidas'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                        <h1 className="text-white text-xl">Bebidas</h1>
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/categoria/especias'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                        <h1 className="text-white text-xl"> Especies</h1>
                    </NavLink>
                </li>
                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/categoria/frutas'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                        <h1 className="text-white text-xl">Harinas</h1>
                    </NavLink>
                </li>

                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <NavLink
                        to='/categoria/recetas'
                        className={({ isActive }) => isActive ? activeStyle : undefined}
                    >
                        <h1 className="text-white text-xl">Recetas</h1>
                    </NavLink>
                </li>


                <li className='"text-white transition-colors hover:text-green-500 focus:text-green-500"'>
                    <span className="sr-only text-white">Buscar</span>
                    <svg className="size-6" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" aria-hidden="true" data-slot="icon">
                        <path stroke-linecap="round" stroke-linejoin="round" d="m21 21-5.197-5.197m0 0A7.5 7.5 0 1 0 5.196 5.196a7.5 7.5 0 0 0 10.607 10.607Z" />
                    </svg>
                </li>
                <li>
                    <svg className="size-6 shrink-0 text-gray-400 group-hover:text-gray-500" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" aria-hidden="true" data-slot="icon">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M15.75 10.5V6a3.75 3.75 0 1 0-7.5 0v4.5m11.356-1.993 1.263 12c.07.665-.45 1.243-1.119 1.243H4.25a1.125 1.125 0 0 1-1.12-1.243l1.264-12A1.125 1.125 0 0 1 5.513 7.5h12.974c.576 0 1.059.435 1.119 1.007ZM8.625 10.5a.375.375 0 1 1-.75 0 .375.375 0 0 1 .75 0Zm7.5 0a.375.375 0 1 1-.75 0 .375.375 0 0 1 .75 0Z" />
                    </svg>
                    <span className="ml-2 text-sm font-medium text-gray-700 group-hover:text-gray-800">0</span>
                    <span className="sr-only">items in cart, view bag</span>
                </li>

            </ul>
            <div className="absolute top-0 left-1/2 -z-10 -translate-x-1/2 blur-3xl xl:-top-6" aria-hidden="true">
                <div className="aspect-1155/678 w-[72.1875rem] bg-linear-to-tr from-[#80ffc0] to-[#89fc8f] opacity-30" style={{ clipPath: "polygon(74.1% 44.1%, 100% 61.6%, 97.5% 26.9%, 85.5% 0.1%, 80.7% 2%, 72.5% 32.5%, 60.2% 62.4%, 52.4% 68.1%, 47.5% 58.3%, 45.2% 34.5%, 27.5% 76.7%, 0.1% 64.9%, 17.9% 100%, 27.6% 76.8%, 76.1% 97.7%, 74.1% 44.1%)" }}></div>
            </div>

        </nav>
    );
}