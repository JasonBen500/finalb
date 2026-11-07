package com.examen.ferreteria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.ferreteria.dto.ClienteFacturaDTO;
import com.examen.ferreteria.service.ClienteService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/reporteClienteFactura")
    public List<ClienteFacturaDTO> reporteClienteFactura() {
        return clienteService.reporteClienteFactura();
    }
}
