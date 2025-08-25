
// Criar um vetor com 10 idades e exibir em tela as idades maiores
// que 18 anos 


public class Exercicio4 {
    public static void main(String[] args) {
        int[] idades = {12, 19, 22, 15, 30, 18, 21, 14, 25, 17};

        System.out.println("Idades maiores que 18:");
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println(idade);
            }
        }
    }
}
