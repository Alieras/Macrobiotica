package com.macrobiotica.dao;

import com.macrobiotica.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolDao
        extends JpaRepository<Rol, Long> {

}
