package com.example.aura02.repository;

import com.example.aura02.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {

    Conta findByTitular(String titular);
}