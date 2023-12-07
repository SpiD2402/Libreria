package com.codigo.libreria.dao;

import com.codigo.libreria.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book,Long> {
}
