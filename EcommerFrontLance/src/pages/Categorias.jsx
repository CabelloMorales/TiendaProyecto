import React, { useEffect, useState } from 'react'
import MainLayout from '../Layout/MainLayout'
import Button from '@mui/material/Button';
import { getAllCategorias } from '../services/CategoriaService';
import { Box, Card, CardContent, Typography } from '@mui/material';
import { getAllProductosCategorias } from '../services/ProdutosService';


const Categorias = () => {
  const [categorias, setCategorias] = useState([])
  const [productos, setproductos] = useState([])
  const [titulo, setTitulo] = useState("")

  useEffect(() => {
    ProducttosInicial()
  }, [])

  const ProducttosInicial = async () => {
    const GetDB = await getAllCategorias();
    setCategorias(GetDB)
    const GetDBProductos = await getAllProductosCategorias(GetDB[0].nombre);
    setproductos(GetDBProductos)
    setTitulo(GetDB[0].nombre)
  }

  const TomarNombre = async(texto) =>{
    let getProductosDB = await getAllProductosCategorias(texto);
    setproductos(getProductosDB)
    setTitulo(texto)
  }
  return (
    <MainLayout>
      <div>
        <h1>Categorías</h1>
        <Box sx={{justifySelf:'center', maxWidth:1200, gap:20}}> 
          {categorias.map(categoria => (
            <Button key={categoria.id} onClick={() => TomarNombre(categoria.nombre)} sx={{margin:1}} variant="contained">{categoria.nombre}</Button>
          ))}
        </Box>
        <Typography sx={{textAlign:'center', marginTop:10}} variant='h2'>
          Articulos {titulo}
      </Typography>
      <Box sx={{ display:'flex', flexDirection:'row', maxWidth:1200, flexWrap:'wrap', gap:10, marginTop:10}}>
        {productos.map((producto) => (

          <Card sx={{ minWidth: 250 , background:'pink'}}>
            <CardContent>
              <Typography variant="h5" component="div">
                {producto?.nombre}
              </Typography>
              <Typography variant="body2">
                ${producto?.nuevoPrecio}
              </Typography>
            </CardContent>
          </Card>
        )
        )}
      </Box>
      </div>
      
    </MainLayout>
  )
}

export default Categorias