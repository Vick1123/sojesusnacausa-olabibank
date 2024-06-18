package com.seubanco.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idCliente;
    private Double saldo;
    private int quantidadeSaques;

    // Construtor vazio para JPA
    public ContaPagamento() {
    }

    // Construtor com parâmetros necessários
    public ContaPagamento(Long idCliente, Double saldo) {
        this.idCliente = idCliente;
        this.saldo = saldo;
        this.quantidadeSaques = 0; // Inicializa a quantidade de saques
    }

    // Getters e setters
}


