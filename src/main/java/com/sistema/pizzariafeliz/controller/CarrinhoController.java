package com.sistema.pizzariafeliz.controller;

import com.sistema.pizzariafeliz.model.CarrinhoItem;
import com.sistema.pizzariafeliz.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {
    @Autowired
    private CarrinhoService carrinhoService;

    @PostMapping
    public CarrinhoItem adicionarItem(@RequestBody CarrinhoItem item) {
        return carrinhoService.adicionarItem(item.getPizza(), item.getQuantidade());
    }
}

