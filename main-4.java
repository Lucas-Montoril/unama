public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro("Java", "Autor A");
        Livro l2 = new Livro("Python", "Autor B");
        Livro l3 = new Livro("JavaScript", "Autor C");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        biblioteca.mostrarLivros();

        biblioteca.emprestarLivro("Java");
        biblioteca.mostrarLivros();

        biblioteca.devolverLivro("Java");
        biblioteca.mostrarLivros();
    }
}