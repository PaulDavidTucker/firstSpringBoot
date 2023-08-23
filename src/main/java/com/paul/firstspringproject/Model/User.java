package com.paul.firstspringproject.Model;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(nullable = false, unique = true)
    private String Username;

    @Column(nullable = false)
    private String Password;

    @Column
    private String Email;

    @Column(columnDefinition = "int default 0")
    private int Karma;
}
