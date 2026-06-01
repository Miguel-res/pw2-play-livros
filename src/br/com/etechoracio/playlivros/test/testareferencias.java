package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.Livro;

public class testareferencias {

    static void main() {
        Livro livroA = new Livro();
        livroA.setTitulo("Meu br.com.etechoracio.playlivros.model.Livro A");
        System.out.println(livroA.setTitulo());

        Livro livroB = livroA;
        livroB.setTitulo("Meu br.com.etechoracio.playlivros.model.Livro B");
        System.out.println(livroB.setTitulo());
        System.out.println(livroA.setTitulo());
    }

}
