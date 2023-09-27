import java.util.Scanner;
public class EquilibrandoSaldo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira o saldo atual
            System.out.print("Digite o saldo atual: ");
            double saldoAtual = scanner.nextDouble();

            // Adiciona uma linha em branco
            System.out.println();

            // Solicita ao usuário que insira o valor do depósito
            System.out.print("Digite o valor do depósito: ");
            double valorDeposito = scanner.nextDouble();

            System.out.println();

            // Solicita ao usuário que insira o valor da retirada
            System.out.print("Digite o valor da retirada: ");
            double valorRetirada = scanner.nextDouble();

            System.out.println();

            // Calcula o novo saldo após as transações
            double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;

            // Imprime o saldo atualizado formatado com uma casa decimal
            System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtualizado);
        }
    }
}


