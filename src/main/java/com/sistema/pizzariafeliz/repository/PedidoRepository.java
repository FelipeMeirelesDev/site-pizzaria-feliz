package com.sistema.pizzariafeliz.repository;

import com.sistema.pizzariafeliz.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
