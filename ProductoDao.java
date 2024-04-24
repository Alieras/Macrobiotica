package com.macrobiotica.dao;

import com.macrobiotica.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoDao
        extends JpaRepository<Producto, Long> {

    //se define un metodo conuna consulta JPA para obtener una lista de productos entre rango de precios
    public List<Producto>
            findByPrecioBetweenOrderByDescripcion(
                    double precioInf,
                    double precioSup);

    //se define un metodo conuna consulta JPQL
    //para obtener una lista de productos entre rango de precios
    @Query(value = "SELECT p "
            + "FROM Producto p "
            + "WHERE p.precio "
            + "BETWEEN :precioInf and :precioSup "
            + "ORDER BY p.descripcion ASC")
    public List<Producto>
            consultaJPQL(double precioInf, double precioSup);

    //se define un metodo conuna consulta SQL
    //para obtener una lista de productos entre rango de precios
    @Query(nativeQuery = true,
            value = "SELECT * "
            + "FROM producto p "
            + "WHERE p.precio "
            + "BETWEEN :precioInf and :precioSup "
            + "ORDER BY p.descripcion ASC")
    public List<Producto>
            consultaSQL(double precioInf, double precioSup);

}
