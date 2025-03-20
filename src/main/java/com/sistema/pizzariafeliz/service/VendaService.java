package com.sistema.pizzariafeliz.service;

import com.sistema.pizzariafeliz.model.CarrinhoItem;
import com.sistema.pizzariafeliz.model.Venda;
import com.sistema.pizzariafeliz.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    public Venda registrarVenda(List<CarrinhoItem> itens) {
        double total = itens.stream()
                .mapToDouble(item -> item.getPizza().getPreco() * item.getQuantidade())
                .sum();

        Venda venda = new Venda();
        venda.setItens(itens);
        venda.setTotal(total);
        venda.setData(LocalDateTime.now());
        return vendaRepository.save(venda);
    }
}

