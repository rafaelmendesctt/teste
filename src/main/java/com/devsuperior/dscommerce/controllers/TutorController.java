package com.devsuperior.dscommerce.controllers;

import com.devsuperior.dscommerce.dto.TutorDTO;
import com.devsuperior.dscommerce.services.TutorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorService service;

    @PostMapping
    public ResponseEntity<TutorDTO> cadastrar(@RequestBody @Valid TutorDTO dto) {
        dto = service.cadastrar(dto);
        return ResponseEntity.ok(dto);
    }

    @PutMapping
    public ResponseEntity<TutorDTO> atualizar(@RequestBody @Valid TutorDTO dto) {
        dto = service.atualizar(dto);
        return ResponseEntity.ok(dto);
    }

}
