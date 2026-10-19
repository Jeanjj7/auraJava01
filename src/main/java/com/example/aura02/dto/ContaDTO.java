
package com.example.aura02.dto;

import java.math.BigDecimal;

public record ContaDTO(
        Long id,
        String titular,
        BigDecimal valor
) {
}
