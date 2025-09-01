public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Samara", 20);
        Pessoa p2 = new Pessoa("Lucas", 25);

        System.out.println("Pessoa 1: " + p1.nome + " - " + p1.idade);
        System.out.println("Pessoa 2: " + p2.nome + " - " + p2.idade);
    }
}