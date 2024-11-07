import React, { useEffect, useState } from 'react'
import MainLayout from '../Layout/MainLayout'
import { getAllProductos } from '../services/ProdutosService';
import Box from '@mui/material/Box';
import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import Typography from '@mui/material/Typography';


const Home = () => {
  const [productos, setproductos] = useState([])
  useEffect(() => {
    productosGet()
  }, [])
  const productosGet = async () => {
    const GetDB = await getAllProductos();
    setproductos(GetDB)
  }

  return (
    <MainLayout>
      <Typography sx={{textAlign:'center', marginTop:10}} variant='h2'>
          Articulos Destacados
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
    </MainLayout>
  )
}

export default Home 