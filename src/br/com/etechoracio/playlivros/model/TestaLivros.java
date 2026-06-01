package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.enums.VersaoEnum;

import java.time.LocalTime;

public class TestaLivros {
    static void main(){
        LivroImpresso quartoLivro = new LivroImpresso();
        quartoLivro.setTitulo("Pai Rico, Pai Pobre");
        quartoLivro.setAutor("Robert Kiyosaki");
        quartoLivro.setNarrador("Marcelo Sanches");
        quartoLivro.setEditora("Alta Books");
        quartoLivro.setDuracao(LocalTime.of(6,15));
        quartoLivro.setVersao(VersaoEnum.INTEGRAL);
        quartoLivro.setPreco(19.90);
        quartoLivro.setPaginas(192);
        quartoLivro.setResumo("Ensina conceitos fundamentais sobre educação financeira");
    }
}
