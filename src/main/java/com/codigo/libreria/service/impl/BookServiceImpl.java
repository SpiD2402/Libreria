package com.codigo.libreria.service.impl;

import com.codigo.libreria.dao.BookDao;
import com.codigo.libreria.entity.Book;
import com.codigo.libreria.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Override
    public List<Book> allBook() {
        return bookDao.findAll();
    }
}
