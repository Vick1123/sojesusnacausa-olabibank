package com.seubanco.model;

@Entity
public class ContaCorrente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idCliente;
    private Double saldo;
    private int quantidadeSaques;

    // Construtor vazio para JPA
    public ContaCorrente() {
    }

    // Construtor com parâmetros necessários
    public ContaCorrente(Long idCliente, Double saldo) {
        this.idCliente = idCliente;
        this.saldo = saldo;
        this.quantidadeSaques = 0; // Inicializa a quantidade de saques
    }

    // Getters e setters
}

