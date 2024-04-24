package com.macrobiotica.service;
import com.macrobiotica.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //*Se define la frma de un metodo para obtener la lista de registros de la tabla categoria
    public List<Categoria> getCategorias(boolean activos);

    //se define la firma del metodo para obtener un objeto categoria 
    //que es el registro que tiene el idCategoria pasado por parametro
    public Categoria getCategoria(Categoria categoria);

    //se define la firma del metodo para crear o modificar un registro 
    //de la tabla categoria, si el objeto pasado tiene un valor 
    //en idCategoria,se busca el registro y se actualiza
    //si idCategoria no tiene valor, entonces se crea el registro
    public void save(Categoria categoria);

    //se define la firma del metodo para eliminar un registro 
    //de la tabla categoria, tomando como clave el valor  de id Categoria
    public void delete(Categoria categoria);

}
