package com.sistema.pizzariafeliz.repository;

import com.sistema.pizzariafeliz.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
