package com.sistema.pizzariafeliz.service;

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

    public Venda registrarVenda(Venda venda) {
        return vendaRepository.save(venda);
    }

    public List<Venda> listarVendas() {
        return vendaRepository.findAll();
    }
}

