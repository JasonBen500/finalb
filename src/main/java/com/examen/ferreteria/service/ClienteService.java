package com.examen.ferreteria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.ferreteria.dto.ClienteFacturaDTO;
import com.examen.ferreteria.repository.ClienteRepository;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteFacturaDTO> reporteClienteFactura() {
        return clienteRepository.reporteClienteFactura();
    }
}
