package com.salariocerto.controller;

import com.salariocerto.dto.CalculoRequestDTO;
import com.salariocerto.dto.CalculoResponseDTO;
import com.salariocerto.service.CalculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calcular")
public class CalculoController {

    @PostMapping(value = "/")
    public ResponseEntity<CalculoResponseDTO> calcular(@RequestBody CalculoRequestDTO dto) {
        CalculoService service = new CalculoService();

        try {
            return ResponseEntity.ok(service.calcular(dto));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
