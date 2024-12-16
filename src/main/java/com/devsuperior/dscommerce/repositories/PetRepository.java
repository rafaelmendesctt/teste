package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PetRepository extends JpaRepository<Pet, Long> {

    Page<Pet> findAllByAdotadoTrue(Pageable pageable);
}
