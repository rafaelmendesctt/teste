package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Abrigo;

import java.util.List;

public class AbrigoDTO {

    private Long id;

    private String nome;

    private String telefone;

    private String email;

    public AbrigoDTO(Long id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public AbrigoDTO(Abrigo abrigo) {
        id = abrigo.getId();
        nome = abrigo.getNome();
        telefone = abrigo.getTelefone();
        email = abrigo.getEmail();
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
