package com.checklist.app.backend.controller;

import com.checklist.app.backend.DTO.ChecklistDTO;
import com.checklist.app.backend.service.FormularioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/checklist")
public class FormularioController {

    private final FormularioService formularioService;

    public FormularioController(FormularioService formularioService) {
        this.formularioService = formularioService;
    }

    @PostMapping()
    public ResponseEntity<String> receberChecklist(@RequestBody ChecklistDTO dto) {
        formularioService.processar(dto);
        return ResponseEntity.ok("Checklist recebido com sucesso!");
    }


}