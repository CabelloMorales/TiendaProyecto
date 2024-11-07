import React from 'react'
import Header from './components/Header'
import Footer from './components/Footer'
import { Box } from '@mui/material'


const MainLayout = ({ children }) => {
    return (
        <Box sx={{ height: '100%' }}>            <Header />
            <div style={{ height: '100%', width: '100%', border: 'solid black 1px' }}>
                <Box sx={{ width: 1000, margin: '0 auto' }}>{children}</Box>            </div>
            <Footer />
        </Box>
    )
}

export default MainLayout