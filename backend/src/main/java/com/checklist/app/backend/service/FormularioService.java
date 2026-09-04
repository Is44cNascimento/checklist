package com.checklist.app.backend.service;

import com.checklist.app.backend.DTO.ChecklistDTO;
import org.springframework.stereotype.Service;

@Service
public class FormularioService {

    public void processar(ChecklistDTO dto) {
        // Aqui você pode salvar no banco depois
        System.out.println("Checklist recebido. Faróis baixos: " + dto.getFaroisBaixos());
    }
}