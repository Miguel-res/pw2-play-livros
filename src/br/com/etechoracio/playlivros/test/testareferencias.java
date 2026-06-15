package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.AudioBook;
import br.com.etechoracio.playlivros.model.Livro;

public class testareferencias {


    static void main() {
        AudioBook livroA = new AudioBook();
        livroA.setTitulo("Meu livro A");
        System.out.println(livroA);

        Livro livroB = livroA;
        livroB.setTitulo("Meu livro B");
        System.out.println(livroB);

        System.out.println(livroA);
    }
}
