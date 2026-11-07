package com.examen.ferreteria.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloDTO {
    private Integer idArticulo;
    private String nombre;
    private String marca;
    private BigDecimal precio;
    private Integer stock;
}
