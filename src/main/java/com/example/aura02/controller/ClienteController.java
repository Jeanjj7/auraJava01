package com.example.aura02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/{id}")
    public String buscar(@PathVariable Long id) {
        return "Cliente solicitado: " + id;
    }
}