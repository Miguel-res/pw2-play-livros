package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.enums.ClassificacaoIndicativaEnum;

public class LivroImpresso extends Livro {


    private int paginas;

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    protected void exibirDetalhes() {
        System.out.println("Páginas: " + paginas);
    }

    public double getTaxaEnvio() { return preco * 0.07; }

    public double getPreco() { return preco + getTaxaEnvio(); }

    public void setNarrador(String marceloSanches) {
    }
}
