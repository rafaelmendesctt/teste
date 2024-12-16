package com.devsuperior.dscommerce.controllers;

import com.devsuperior.dscommerce.dto.PetDTO;
import com.devsuperior.dscommerce.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService service;

    @GetMapping
    public ResponseEntity<Page<PetDTO>> listarTodosDisponiveis(Pageable pageable) {
        Page<PetDTO> dto = service.listarTodosDisponiveis(pageable);
        return ResponseEntity.ok(dto);
    }

}
