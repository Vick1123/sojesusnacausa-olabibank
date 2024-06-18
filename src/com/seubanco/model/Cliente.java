package com.seubanco.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String email;
    private Double rendaSalarial;
    private String senha;

    // Construtor vazio para JPA
    public Cliente() {
    }

    // Construtor com parâmetros necessários
    public Cliente(String nome, String cpf, String email, Double rendaSalarial, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.rendaSalarial = rendaSalarial;
        this.senha = senha;
    }

    // Getters e setters
}
