package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.StatusAdocao;

import java.time.LocalDateTime;

public class AdocaoDTO {

    private Long id;

    private LocalDateTime data;

    private TutorDTO tutor;

    private PetDTO pet;

    private String motivo;

    private StatusAdocao status;

    private String justificativaStatus;

    public AdocaoDTO(Long id, LocalDateTime data, TutorDTO tutor, PetDTO pet, String motivo, StatusAdocao status, String justificativaStatus) {
        this.id = id;
        this.data = data;
        this.tutor = tutor;
        this.pet = pet;
        this.motivo = motivo;
        this.status = status;
        this.justificativaStatus = justificativaStatus;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public TutorDTO getTutor() {
        return tutor;
    }

    public PetDTO getPet() {
        return pet;
    }

    public String getMotivo() {
        return motivo;
    }

    public StatusAdocao getStatus() {
        return status;
    }

    public String getJustificativaStatus() {
        return justificativaStatus;
    }
}
