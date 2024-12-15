package br.com.brenocosta;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void testPessoasDoSexoFeminino() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("Pedro", "Masculino"));
        pessoas.add(new Pessoa("Carla", "Feminino"));

        boolean existeMulher = pessoas.stream()
                .anyMatch(pessoa -> pessoa.getGenero().equals("Feminino"));

        assertTrue("Deveria existir pelo menos uma pessoa do sexo feminino.", existeMulher);
    }
}

