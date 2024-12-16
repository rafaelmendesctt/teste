package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Tutor;

import java.util.List;

public class TutorDTO {

    private Long id;

    private String nome;

    private String telefone;

    private String email;

    public TutorDTO(Long id, String nome, String telefone, String email, List<AdocaoDTO> adocoes) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public TutorDTO(Tutor entity) {
        id = entity.getId();
        nome = entity.getNome();
        telefone = entity.getTelefone();
        email = entity.getEmail();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}
