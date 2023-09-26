import java.util.Scanner;

public class EquilibrandoSaldo {
        
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldoAtual = scanner.nextDouble();
            double valorDeposito = scanner.nextDouble();
            double valorRetirada = scanner.nextDouble();

            // Calcula o novo saldo 
            double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;

            // Imprime o saldo atualizado formatado com uma casa decimal
            System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtualizado);
        }
    }
}