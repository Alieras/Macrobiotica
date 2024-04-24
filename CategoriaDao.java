package com.macrobiotica.dao;

import com.macrobiotica.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao
        extends JpaRepository<Categoria, Long> {

}
