package com.codigo.libreria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dvd")
public class Dvd extends LibraryItem{

    protected String director;
    protected  int duration;


}
