
package com.example.aura02.mapper;

import com.example.aura02.dto.ContaDTO;
import com.example.aura02.dto.ContaRequest;
import com.example.aura02.model.Conta;

public class ContaMapper {

    // Converte Entity em DTO de resposta
    public static ContaDTO paraDTO(Conta conta) {
        return new ContaDTO(
                conta.getId(),
                conta.getTitular(),
                conta.getValor()
        );
    }

    // Converte DTO de entrada em Entity
    public static Conta paraEntity(ContaRequest request) {
        return new Conta(
                request.titular(),
                request.valor()
        );
    }
}
