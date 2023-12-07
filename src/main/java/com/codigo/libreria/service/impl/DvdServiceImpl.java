package com.codigo.libreria.service.impl;

import com.codigo.libreria.dao.DvdDao;
import com.codigo.libreria.entity.Dvd;
import com.codigo.libreria.service.DvdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DvdServiceImpl implements DvdService {

    @Autowired
    private DvdDao dvdDao;

    @Override
    public List<Dvd> allDvd() {
        return dvdDao.findAll();
    }
}
