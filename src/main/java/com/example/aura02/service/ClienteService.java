package com.example.aura02.service;

import com.example.aura02.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final List<Cliente> clientes = List.of(
            new Cliente(1L, "João Silva", "joao@email.com"),
            new Cliente(2L, "Maria Santos", "maria@email.com")
    );

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente buscarPorId(Long id) {
        return clientes.stream()
                .filter(cliente -> cliente.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado: " + id));
    }
}