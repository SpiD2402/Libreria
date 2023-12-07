package com.codigo.libreria.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "prestamo")
public class Prestamos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @OneToOne()
    @JoinColumn(name = "id_book")
    protected Book id_book;

    @OneToOne()
    @JoinColumn(name = "id_dvd")
    protected Dvd id_dvd;

    @ManyToOne
    @JoinColumn(name = "id_user")
    protected UserLibrary id_user;

}
