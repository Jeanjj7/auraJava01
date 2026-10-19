
package com.example.aura02.service;

import com.example.aura02.dto.ContaRequest;
import com.example.aura02.exception.ContaNaoEncontradaException;
import com.example.aura02.mapper.ContaMapper;
import com.example.aura02.model.Conta;
import com.example.aura02.repository.ContaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    private final ContaRepository repository;

    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }

    public Conta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ContaNaoEncontradaException(
                                "Conta " + id + " não encontrada"
                        )
                );
    }
    // NOVO: grava a conta que veio no POST
    public Conta criar(ContaRequest r) {
        Conta nova = ContaMapper.paraEntity(r);
        return repository.save(nova);
    }
}