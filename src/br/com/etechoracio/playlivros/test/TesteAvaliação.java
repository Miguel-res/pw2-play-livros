package br.com.etechoracio.playlivros.test;
import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Usuario;

import java.time.LocalDateTime;

public class TesteAvaliação {
    static void main() {
        Usuario horacio = new Usuario("Horacio Augusto da Silveira");
        Avaliacao primeiraAvaliacao = new Avaliacao();
        primeiraAvaliacao.setTitulo("Livro Exelente");
        primeiraAvaliacao.setUsuario(horacio);
        primeiraAvaliacao.setEstrelas(5);
        primeiraAvaliacao.aprovar();
        primeiraAvaliacao.setData(LocalDateTime.of(2026,4,21,13,12));
        primeiraAvaliacao.setComentario("Livro excelente, muito bem escrito. Chegou no prazo e bem embalado");
        primeiraAvaliacao.exibir();
    }
}
