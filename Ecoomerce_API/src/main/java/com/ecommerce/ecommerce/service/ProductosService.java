package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.model.Productos;
import com.ecommerce.ecommerce.repository.ProductosRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductosService {
    
    private ProductosRepository productosRepository;

    public ProductosService(ProductosRepository productosRepository){
        this.productosRepository = productosRepository;
    }

    public  List<Productos> getAllProductos(){
        return productosRepository.findAllProductos();
    }

    public  List<Productos> getByText(String  texto){
        return productosRepository.findAllProductosByName(texto);
    }

    public  List<Productos> getByCategoria(String texto){
        return productosRepository.findAllProductosByCategoria(texto);
    }
}
