package com.sistema.pizzariamania.repository;

import com.sistema.pizzariamania.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
