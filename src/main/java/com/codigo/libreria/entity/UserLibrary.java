package com.codigo.libreria.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "user_library")
public class UserLibrary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected  String username;


    @OneToMany
    @JoinTable(
            name="prestamo",
            joinColumns = @JoinColumn(name = "id_book"),
            inverseJoinColumns =@JoinColumn(name ="id_dvd")
    )
    private Set<Prestamos> prestamos = new HashSet<>();
}
