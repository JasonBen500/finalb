package com.examen.ferreteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.examen.ferreteria.dto.ArticuloCategoriaDTO;
import com.examen.ferreteria.dto.ArticuloDTO;
import com.examen.ferreteria.entity.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {

    @Query("SELECT new com.examen.ferreteria.dto.ArticuloDTO(a.idArticulo, a.nombre, a.marca, a.precio, a.stock) "
            + "FROM Articulo a "
            + "WHERE a.estado = true AND LOWER(a.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<ArticuloDTO> mostrarActivosFiltro(@Param("nombre") String nombre);

    @Query("SELECT new com.examen.ferreteria.dto.ArticuloCategoriaDTO(a.nombre, a.marca, c.nombre, a.precio, a.stock) "
            + "FROM Articulo a JOIN a.idCategoria c "
            + "WHERE a.estado = true AND c.estado = true "
            + "ORDER BY c.nombre, a.nombre")
    List<ArticuloCategoriaDTO> reporteArticuloCategoria();
}
