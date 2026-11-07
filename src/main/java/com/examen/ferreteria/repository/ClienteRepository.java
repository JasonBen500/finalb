package com.examen.ferreteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examen.ferreteria.dto.ClienteFacturaDTO;
import com.examen.ferreteria.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("SELECT new com.examen.ferreteria.dto.ClienteFacturaDTO(c.nombre, c.apellido, c.nit, "
            + "CAST(FUNCTION('DATE_FORMAT', f.fechaFactura, '%d/%m/%Y %H:%i') AS String), f.total) "
            + "FROM Factura f JOIN f.idCliente c "
            + "WHERE f.estado = true AND c.estado = true "
            + "ORDER BY f.fechaFactura")
    List<ClienteFacturaDTO> reporteClienteFactura();
}
