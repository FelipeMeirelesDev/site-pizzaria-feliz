package com.sistema.pizzariafeliz.service;

import com.sistema.pizzariafeliz.model.Pizza;
import com.sistema.pizzariafeliz.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> listarPizzas() {
        return pizzaRepository.findAll();
    }

    public Pizza salvarPizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public void deletarPizza(@PathVariable Long id) {
        pizzaRepository.deleteById(id);
    }
}

