package com.sistema.pizzariafeliz.controller;

import com.sistema.pizzariafeliz.model.Pizza;
import com.sistema.pizzariafeliz.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @GetMapping
    public List<Pizza> listarPizzas() {
        return pizzaService.listarPizzas();
    }

    @PostMapping
    public Pizza salvarPizza(@RequestBody Pizza pizza) {
        return pizzaService.salvarPizza(pizza);
    }

    @DeleteMapping(value = "/{id}")
    public void deletarPizza(@PathVariable Long id) {
        pizzaService.deletarPizza(id);
    }
}

