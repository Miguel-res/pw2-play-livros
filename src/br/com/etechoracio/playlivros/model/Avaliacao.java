package br.com.etechoracio.playlivros.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Avaliacao {
        public int estrelas;
        public String titulo;
        public LocalDateTime data;
        public String comentario;
        public Usuario usuario;
        public boolean aprovado;

        public void exibir() {
                System.out.println("Usuario" + usuario);
                System.out.println(estrelas + " Estrelas " + titulo);
                System.out.println("Avaliado em " + obterDataPorExtenso());
                System.out.println("Comentario" + comentario);
        }

        public String obterDataPorExtenso() {
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
                String resultado = formatador.format(data);
                return resultado;
        }
}

