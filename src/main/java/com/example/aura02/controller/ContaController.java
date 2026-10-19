
package com.example.aura02.controller;

import com.example.aura02.dto.ContaDTO;
import com.example.aura02.dto.ContaRequest;
import com.example.aura02.mapper.ContaMapper;
import com.example.aura02.model.Conta;
import com.example.aura02.service.ContaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contas")
public class ContaController {

    private final ContaService service;

    public ContaController(ContaService service) {
        this.service = service;
    }

    @GetMapping("/{id}") // ALTERADO: devolve DTO
    public ContaDTO buscarPorId(@PathVariable Long id) {
        Conta conta = service.buscarPorId(id);
        return ContaMapper.paraDTO(conta);
    }

    @PostMapping // NOVO
    @ResponseStatus(HttpStatus.CREATED)
    public ContaDTO criar(@Valid @RequestBody ContaRequest r) {
        Conta conta = service.criar(r);
        return ContaMapper.paraDTO(conta);
    }
}