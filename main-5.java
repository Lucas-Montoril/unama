public class Main5 {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua A", 10);
        Endereco e2 = new Endereco("Rua B", 20);

        Pessoa p1 = new Pessoa("Samara", 30, e1);
        Pessoa p2 = new Pessoa("Lucas", 40, e2);

        p1.mostrarDados();
        p2.mostrarDados();
    }
}