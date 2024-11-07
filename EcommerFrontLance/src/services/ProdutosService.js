import axios from "axios";
import {url} from './Config'

const getAllProductos = async() =>{
    try{
        const res = await axios.get(url + 'productos');
        return res.data;
    }catch(error){
        console.log(error)
    }
}

const getAllProductosCategorias = async(texto) =>{
    try{
        const res = await axios.get(url + 'productos/categoria/'+texto);
        return res.data;
    }catch(error){
        console.log(error)
    }
}

export {getAllProductos, getAllProductosCategorias}