package com.ecommerce.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.ecommerce.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {
    @Query(value = "Select * from productos", nativeQuery = true)
    List<Productos> findAllProductos();

    @Query(value = "SELECT * FROM productos WHERE nombre LIKE CONCAT('%', ?1, '%')", nativeQuery = true)
    List<Productos> findAllProductosByName(String nombre);

    @Query(value = "SELECT a.* FROM productos as a inner join categorias as b on a.categoria_id = b.id where b.nombre =  ?1", nativeQuery = true)
    List<Productos> findAllProductosByCategoria(String texto);

}
