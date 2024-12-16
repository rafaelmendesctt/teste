package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.PetDTO;
import com.devsuperior.dscommerce.entities.Pet;
import com.devsuperior.dscommerce.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class PetService {

    @Autowired
    private PetRepository repository;

    @GetMapping
    public Page<PetDTO> listarTodosDisponiveis(Pageable pageable) {
        Page<Pet> pet = repository.findAllByAdotadoTrue(pageable);
        return pet.map(PetDTO::new);
    }

}
