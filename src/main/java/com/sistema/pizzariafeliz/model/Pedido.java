package com.sistema.pizzariafeliz.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome_cliente;
    private String telefone;
    private String rua;
    private String bairro;
    private String numero;
    private Double valor;

    // O Hibernate nomeou a tabela intermediária como "tb_venda_itens"
    // combinando o nome da entidade "tb_venda" com o atributo "itens".
    //@OneToMany(cascade = CascadeType.ALL)
    //private List<CarrinhoItem> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }



 /*   public List<CarrinhoItem> getItens() {
        return itens;
    }

    public void setItens(List<CarrinhoItem> itens) {
        this.itens = itens;
    }
*/

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", nome_cliente='" + nome_cliente + '\'' +
                ", telefone='" + telefone + '\'' +
                ", rua='" + rua + '\'' +
                ", Bairro='" + bairro + '\'' +
                ", numero='" + numero + '\'' +
                ", valor=" + valor +
                '}';
    }
}
