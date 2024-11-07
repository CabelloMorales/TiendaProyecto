import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import Home from './pages/Home';
import Categorias from './pages/Categorias';
import Contacto from './pages/Contacto';

function App() {
  return (
    <BrowserRouter >
      <Routes>
        <Route path="/" >
          <Route index element={<Home />} />
          <Route path='categorias' element={<Categorias/>} />
          <Route path='contacto' element={<Contacto/>} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
