// Criar um vetor com 4 notas e exibir em tela a média aritmética
// das notas

public class Exercicio5 {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.0, 9.5};
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("Média das notas: " + media);
    }
}
