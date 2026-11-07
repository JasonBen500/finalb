package com.examen.ferreteria.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteFacturaDTO {
    private String nombre;
    private String apellido;
    private String nit;
    private String fechaFactura;
    private BigDecimal total;
}
