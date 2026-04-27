package br.com.etechoracio.playlivros.test;
import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Usuario;

import java.time.LocalDateTime;

public class TesteAvaliação {
    static void main() {
        Usuario horacio = new Usuario();
        horacio.nome = "Horacio Augusto da Silveira";
        Avaliacao primeiraAvaliacao = new Avaliacao();
        primeiraAvaliacao.titulo = "Livro Exelente";
        primeiraAvaliacao.usuario = horacio;
        primeiraAvaliacao.estrelas = 5;
        primeiraAvaliacao.aprovado = true;
        primeiraAvaliacao.data = LocalDateTime.of(2026,4,21,13,12);
        primeiraAvaliacao.comentario = "Livro excelente, muito bem escrito. Chegou no prazo e bem embalado";
        primeiraAvaliacao.exibir();
    }
}
