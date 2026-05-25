package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.enums.ClassificacaoIndicativaEnum;
class Livroimpresso extends Livro{
    private int paginas;
}

public class LivroImpresso {
    public String titulo;
    public String autor;
    public String editora;
    public double preco;
    public String resumo;
    private ClassificacaoIndicativaEnum classificacaoIndicativa(){
        return classificacaoIndicativa;
    }
    public void  setClassificacaoIndicativa(ClassificacaoIndicativaEnum classificacaoIndicativa) {
        classificacaoIndicativa = classificacaoIndicativa;
    }
}
