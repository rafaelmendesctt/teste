package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.TutorDTO;
import com.devsuperior.dscommerce.entities.Tutor;
import com.devsuperior.dscommerce.repositories.TutorRepository;
import com.devsuperior.dscommerce.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TutorService {

    @Autowired
    private TutorRepository repository;

    @Transactional
    public TutorDTO cadastrar(TutorDTO dto) {
        verificarTelefoneOuEmailJaCadastrado(dto);

        Tutor entity = new Tutor();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);

        return new TutorDTO(entity);
    }

    @Transactional
    public TutorDTO atualizar(TutorDTO dto) {
        try {
            Tutor entity = repository.getReferenceById(dto.getId());
            copyDtoToEntity(dto, entity);
            entity = repository.save(entity);
            return new TutorDTO(entity);
        }
        catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id não encontrado");
        }
    }

    private void verificarTelefoneOuEmailJaCadastrado(TutorDTO dto) {
        boolean telefoneJaCadastrado = repository.existsByTelefone(dto.getTelefone());
        boolean emailJaCadastrado = repository.existsByEmail(dto.getEmail());

        if (telefoneJaCadastrado || emailJaCadastrado) {
            throw new ResourceNotFoundException("Dados já cadastrados para outro tutor!");
        }
    }

    private void copyDtoToEntity(TutorDTO dto, Tutor entity) {
        entity.setNome(dto.getNome());
        entity.setTelefone(dto.getTelefone());
        entity.setEmail(dto.getEmail());
    }

}
