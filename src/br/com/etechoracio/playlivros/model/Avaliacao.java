package br.com.etechoracio.playlivros.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Avaliacao {
        private int estrelas;
        private String titulo;
        private LocalDateTime data;
        private String comentario;
        private Usuario usuario;
        private boolean aprovado;

        public void aprovar(){
                this.aprovado = true;
        }
        public Usuario getUsuario() {
                return usuario;
        }

        public void setEstrelas(int estrelas) {
                this.estrelas = estrelas;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public void setData(LocalDateTime data) {
                this.data = data;
        }

        public void setComentario(String comentario) {
                this.comentario = comentario;
        }

        public void setUsuario(Usuario usuario) {
                this.usuario = usuario;
        }

        public void exibir() {
                System.out.println(usuario.getNome());
                System.out.println(estrelas + " Estrelas " + titulo);
                System.out.println("Avaliado em " + obterDataPorExtenso());
                System.out.println("Comentario: " + comentario);
        }

        public String obterDataPorExtenso() {
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
                String resultado = formatador.format(data);
                return resultado;
        }
}

