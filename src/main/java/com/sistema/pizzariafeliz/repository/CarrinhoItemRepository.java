package com.sistema.pizzariafeliz.repository;

import com.sistema.pizzariafeliz.model.CarrinhoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoItemRepository extends JpaRepository<CarrinhoItem, Long> {
}
