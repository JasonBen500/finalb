package com.examen.ferreteria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen.ferreteria.dto.ArticuloCategoriaDTO;
import com.examen.ferreteria.dto.ArticuloDTO;
import com.examen.ferreteria.service.ArticuloService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/articulos")
public class ArticuloController {

    private final ArticuloService articuloService;

    public ArticuloController(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    @GetMapping("/mostrarActivosFiltro")
    public List<ArticuloDTO> mostrarActivosFiltro(@RequestParam String nombre) {
        return articuloService.mostrarActivosFiltro(nombre);
    }

    @GetMapping("/reporteArticuloCategoria")
    public List<ArticuloCategoriaDTO> reporteArticuloCategoria() {
        return articuloService.reporteArticuloCategoria();
    }
}
