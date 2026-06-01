package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.enums.VersaoEnum;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Livro {
    private String titulo;
    private String autor;
    private String narrador;
    private String editora;
    private LocalTime duracao;
    private VersaoEnum versao;
    private double preco;
    private String resumo;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public void setVersao(VersaoEnum versao) {
        this.versao = versao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void exibir(){
        System.out.println("=====================");
        System.out.println("Titulo" + titulo);
        System.out.println("Autor" + autor);
        System.out.println("Narrador" + narrador);
        System.out.println("Editora" + editora);
        System.out.println("Preço" + preco);
    }
    public double getTaxaEnvio(){
        if(impresso) {
            return preco * 0.07;
        }
        return 0;
    }
}

