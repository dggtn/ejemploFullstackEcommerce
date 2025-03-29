import Catalogo from './component/Catalogo'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import NavBar from './component/NavBar'
import './tailwind.css'
import Detalleproducto from './component/DetalleProducto'
import Home from './component/Home'
import Footer  from './component/Footer'
import Formulario from './component/Formulario'
import NewsLetter from './component/NewsLetter'
import SobreNosotros from './component/SobreNosotros'
import Licencia from './component/Licencia'


function App() {
  return (
    <>
    <BrowserRouter>
      <NavBar />
      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route exact path="/categoria/:id" element={<Catalogo />} />
        <Route exact path="/detalle/:id" element={<Detalleproducto />} />
        <Route exact path="/formulario" element={<Formulario />} />
        <Route exact path="/sobreNosotros" element={<SobreNosotros />} />
        <Route exact path="/licencia" element={<Licencia />} />
      </Routes>
      <NewsLetter />
      <Footer/>
    </BrowserRouter>
    
    </>
  )
}

export default App
