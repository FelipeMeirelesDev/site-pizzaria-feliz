package com.sistema.pizzariafeliz.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_venda")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double total;

    // O Hibernate nomeou a tabela intermediária como "tb_venda_itens"
    // combinando o nome da entidade "tb_venda" com o atributo "itens".
    @OneToMany(cascade = CascadeType.ALL)
    private List<CarrinhoItem> itens;

    private LocalDateTime data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<CarrinhoItem> getItens() {
        return itens;
    }

    public void setItens(List<CarrinhoItem> itens) {
        this.itens = itens;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", total=" + total +
                ", itens=" + itens +
                ", data=" + data +
                '}';
    }
}
