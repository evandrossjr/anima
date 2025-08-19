package com.essj.anima.domain.pet.repository;

import com.essj.anima.domain.pet.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
