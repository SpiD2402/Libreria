package com.codigo.libreria.controller;

import com.codigo.libreria.entity.Book;
import com.codigo.libreria.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/listar")
    public List<Book> allBook()
    {
        return bookService.allBook();
    }

}
