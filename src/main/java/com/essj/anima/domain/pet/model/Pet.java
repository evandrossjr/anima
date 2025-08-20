package com.essj.anima.domain.pet.model;


import com.essj.anima.domain.user.model.User;
import jakarta.persistence.*;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    @Enumerated(EnumType.STRING)
    private PetSpecies petSpecies;

    private String breed;
    private String color;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



    public Pet() {
    }

    public Pet(Long id, String name, Integer age, PetSpecies petSpecies, String breed, String color, User user) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.petSpecies = petSpecies;
        this.breed = breed;
        this.color = color;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public PetSpecies getPetSpecies() {
        return petSpecies;
    }

    public void setPetSpecies(PetSpecies petSpecies) {
        this.petSpecies = petSpecies;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
