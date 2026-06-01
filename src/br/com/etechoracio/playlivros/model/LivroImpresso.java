package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.enums.ClassificacaoIndicativaEnum;

public class LivroImpresso extends Livro {
    private String titulo;
    private String autor;
    private String editora;
    private double preco;
    private String resumo;
    private int paginas;

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    private ClassificacaoIndicativaEnum classificacaoIndicativa(){
        return classificacaoIndicativa;
    }
    public void  setClassificacaoIndicativa(ClassificacaoIndicativaEnum classificacaoIndicativa) {
        classificacaoIndicativa = classificacaoIndicativa;
    }
}
