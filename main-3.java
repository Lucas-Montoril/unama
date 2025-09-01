public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(123, 1000);

        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(1500);

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}