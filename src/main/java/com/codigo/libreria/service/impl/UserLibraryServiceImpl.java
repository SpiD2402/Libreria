package com.codigo.libreria.service.impl;


import com.codigo.libreria.dao.UserLibraryDao;
import com.codigo.libreria.entity.UserLibrary;
import com.codigo.libreria.service.UserLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLibraryServiceImpl implements UserLibraryService {

    @Autowired
    private UserLibraryDao userLibraryDao;

    @Override
    public List<UserLibrary> allUser() {
        return userLibraryDao.findAll();
    }
}
