package com.sistema.pizzariafeliz.controller;

import com.sistema.pizzariafeliz.model.Venda;
import com.sistema.pizzariafeliz.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<Venda> listarVendas() {
        return vendaService.listarVendas();
    }

    @PostMapping
    public Venda registrarVenda(@RequestBody Venda venda) {
        return vendaService.registrarVenda(venda);
    }
}

