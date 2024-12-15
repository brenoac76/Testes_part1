package br.com.brenocosta;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String genero; // "Masculino" ou "Feminino"

    // Construtor
    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', genero='" + genero + "'}";
    }
}