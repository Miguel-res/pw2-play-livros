package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalTime;

public class CarrinhoCompras {
    static void main() {
        Livro primeiroLivro = new Livro();
        primeiroLivro.setTitulo("O Poder");
        primeiroLivro.setAutor("George W.");
        primeiroLivro.setNarrador("Jacomo G.");
        primeiroLivro.setEditora("Walter");
        primeiroLivro.setDuracao(LocalTime.of(10, 45));
        primeiroLivro.setVersao(VersaoEnum.INTEGRAL);
        primeiroLivro.setPreco(29.99);
        primeiroLivro.setResumo("Explica como assumir o poder através de uma revolução de loucos.");

        primeiroLivro.exibir();

        Livro segundoLivro = new Livro();
        segundoLivro.setTitulo("Mindset");
        segundoLivro.setAutor("Carol S. Dweck");
        segundoLivro.setNarrador("Ana Paula Cadamuro");
        segundoLivro.setEditora("Objetiva");
        segundoLivro.setDuracao(LocalTime.of(8, 30));
        segundoLivro.setVersao(VersaoEnum.RESUMIDA);
        segundoLivro.setPreco(24.90);
        segundoLivro.setResumo("Mostra como a mentalidade de crescimento pode impactar o sucesso.");

        segundoLivro.exibir();

        // Terceiro livro
        Livro terceiroLivro = new Livro();
        terceiroLivro.setTitulo("Pai Rico, Pai Pobre");
        terceiroLivro.setAutor("Robert Kiyosaki");
        terceiroLivro.setNarrador("Marcelo Sanches");
        terceiroLivro.setEditora("Alta Books");
        terceiroLivro.setDuracao(LocalTime.of(6, 15));
        terceiroLivro.setVersao(VersaoEnum.INTEGRAL);
        terceiroLivro.setPreco(19.90);
        terceiroLivro.setResumo("Ensina conceitos fundamentais sobre educação financeira.");

        terceiroLivro.exibir();
    }

}
