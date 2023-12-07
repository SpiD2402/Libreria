package com.codigo.libreria.controller;

import com.codigo.libreria.entity.Dvd;
import com.codigo.libreria.service.DvdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dvd")
public class DvdController {

    @Autowired
    private DvdService dvdService;

    @GetMapping("/listar")
    public List<Dvd> allDvd()
    {
        return  dvdService.allDvd();
    }

}
