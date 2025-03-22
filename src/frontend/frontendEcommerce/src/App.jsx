import Catalogo from './component/Catalogo'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import NavBar from './component/NavBar'
import './tailwind.css'
import Detalleproducto from './component/DetalleProducto'
import Home from './component/Home'
function App() {
  return (
    <BrowserRouter>
      <NavBar />
      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route exact path="/categoria/:id" element={<Catalogo />} />
        <Route exact path="/detalle/:id" element={<Detalleproducto />} />
      </Routes>
    </BrowserRouter>
  )
}

export default App
