package br.com.etechoracio.playlivros.model;

public class Usuario {
    public String foto;
    public String nome;
    public Usuario (String nome){
        this.nome =  nome;
    }
    static void main(){
        Avaliacao avaliacaoHoracio = new Avaliacao();
        avaliacaoHoracio.usuario = new Usuario("Horacio Augusto da Silveira");
    }
}

