package com.codigo.libreria.controller;

import com.codigo.libreria.entity.UserLibrary;
import com.codigo.libreria.service.UserLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UserLibraryController {

    @Autowired
    private UserLibraryService userLibraryService;

    @GetMapping("/listar")
    public List<UserLibrary> allUser()
    {
        return userLibraryService.allUser();
    }


}
