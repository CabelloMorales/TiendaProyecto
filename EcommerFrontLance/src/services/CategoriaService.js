import axios from "axios";
import {url} from './Config'

const getAllCategorias = async() =>{
    try{
        const res = await axios.get(url + 'categorias');
        return res.data;
    }catch(error){
        console.log(error)
    }
}

export {getAllCategorias}