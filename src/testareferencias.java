public class testareferencias {

    static void main() {
        Livro livroA = new Livro();
        livroA.titulo = "Meu Livro A";
        System.out.println(livroA.titulo);

        Livro livroB = livroA;
        livroB.titulo = "Meu Livro B";
        System.out.println(livroB.titulo);
        System.out.println(livroA.titulo);
    }

}
