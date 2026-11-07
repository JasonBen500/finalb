package com.examen.ferreteria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.ferreteria.dto.ArticuloCategoriaDTO;
import com.examen.ferreteria.dto.ArticuloDTO;
import com.examen.ferreteria.repository.ArticuloRepository;

@Service
public class ArticuloService {

    private final ArticuloRepository articuloRepository;

    public ArticuloService(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    public List<ArticuloDTO> mostrarActivosFiltro(String nombre) {
        return articuloRepository.mostrarActivosFiltro(nombre);
    }

    public List<ArticuloCategoriaDTO> reporteArticuloCategoria() {
        return articuloRepository.reporteArticuloCategoria();
    }
}
