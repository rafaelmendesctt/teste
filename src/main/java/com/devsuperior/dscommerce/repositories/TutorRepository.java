package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.entities.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

    boolean existsByTelefone(String telefone);

    boolean existsByEmail(String email);

}
