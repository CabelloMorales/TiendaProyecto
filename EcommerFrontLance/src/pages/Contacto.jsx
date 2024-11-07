import React, { useState } from 'react'
import MainLayout from '../Layout/MainLayout'

const Contacto = () => {
    const [numero, setNumero] = useState(5)
    const suma = () =>{
        setNumero(numero + 1)
    }
    const resta = () =>{
        setNumero(numero - 1)
    }
  return (
    <MainLayout>
    <div>
        <h1>Contador</h1>
        <div>
        <button onClick={suma}>+</button>
        <p>{numero}</p>
        <button onClick={resta}>-</button>
        </div>
    </div>
    </MainLayout>
  )
}

export default Contacto