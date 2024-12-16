package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Pet;
import com.devsuperior.dscommerce.entities.TipoPet;

public class PetDTO {

    private Long id;

    private TipoPet tipo;

    private String nome;

    private String raca;

    private Integer idade;

    private String cor;

    private Float peso;

    private Boolean adotado;

    private AbrigoDTO abrigo;

    public PetDTO(Long id, TipoPet tipo, String nome, String raca, Integer idade, String cor, Float peso, Boolean adotado, AbrigoDTO abrigo) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
        this.adotado = adotado;
        this.abrigo = abrigo;
    }

    public PetDTO(Pet entity) {
        id = entity.getId();
        tipo = entity.getTipo();
        nome = entity.getNome();
        raca = entity.getRaca();
        idade = entity.getIdade();
        cor = entity.getCor();
        peso = entity.getPeso();
        adotado = entity.getAdotado();
        abrigo = new AbrigoDTO(entity.getAbrigo());
    }

    public Long getId() {
        return id;
    }

    public TipoPet getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public Float getPeso() {
        return peso;
    }

    public Boolean getAdotado() {
        return adotado;
    }

    public AbrigoDTO getAbrigo() {
        return abrigo;
    }

}
