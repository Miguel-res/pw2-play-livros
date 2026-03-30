package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.Livro;

public class testareferencias {

    static void main() {
        Livro livroA = new Livro();
        livroA.titulo = "Meu br.com.etechoracio.playlivros.model.Livro A";
        System.out.println(livroA.titulo);

        Livro livroB = livroA;
        livroB.titulo = "Meu br.com.etechoracio.playlivros.model.Livro B";
        System.out.println(livroB.titulo);
        System.out.println(livroA.titulo);
    }

}
