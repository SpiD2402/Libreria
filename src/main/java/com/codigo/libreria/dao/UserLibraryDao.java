package com.codigo.libreria.dao;

import com.codigo.libreria.entity.UserLibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLibraryDao extends JpaRepository<UserLibrary,Long>
{


}
