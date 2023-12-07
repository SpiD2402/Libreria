package com.codigo.libreria.dao;

import com.codigo.libreria.entity.Dvd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DvdDao extends JpaRepository<Dvd,Long> {
}
