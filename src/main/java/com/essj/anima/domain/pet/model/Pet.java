package com.essj.anima.domain.pet.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;



    public Pet(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
