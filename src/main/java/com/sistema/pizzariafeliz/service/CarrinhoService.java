package com.sistema.pizzariafeliz.service;

import com.sistema.pizzariafeliz.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoService {
    @Autowired
    private CarrinhoItemRepository carrinhoItemRepository;

    public CarrinhoItem adicionarItem(Pizza pizza, Integer quantidade) {
        CarrinhoItem item = new CarrinhoItem();
        item.setPizza(pizza);
        item.setQuantidade(quantidade);
        return carrinhoItemRepository.save(item);
    }
}

