package com.sistema.pizzariamania.repository;

import com.sistema.pizzariamania.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
