package com.macrobiotica.service;

import com.macrobiotica.domain.Producto;
import java.util.List;

public interface ProductoService {
     //*Se define la frma de un metodo para obtener la lista de registros de la tabla producto
    public List<Producto> getProductos(boolean activos);

    //se define la firma del metodo para obtener un objeto producto 
    //que es el registro que tiene el idProducto pasado por parametro
    public Producto getProducto(Producto producto);

    //se define la firma del metodo para crear o modificar un registro 
    //de la tabla producto, si el objeto pasado tiene un valor 
    //en idProducto,se busca el registro y se actualiza
    //si idProducto no tiene valor, entonces se crea el registro
    public void save(Producto producto);

    //se define la firma del metodo para eliminar un registro 
    //de la tabla producto, tomando como clave el valor  de id Producto
    public void delete(Producto producto);
    
    //se define un metodo conuna consulta JPA para obtener una lista de productos entre rango de precios
    public List<Producto>consultaJPA(double precioInf,double precioSup);

    //se define un metodo conuna consulta JPQL
    //para obtener una lista de productos entre rango de precios
    
    public List<Producto>consultaJPQL(double precioInf, double precioSup);

    //se define un metodo conuna consulta SQL
    //para obtener una lista de productos entre rango de precios
    
    public List<Producto>consultaSQL(double precioInf, double precioSup);


}
