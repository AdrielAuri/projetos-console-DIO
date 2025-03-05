package ContaBanco;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== BANCO BRADESCO =====\n\n- Sessão de cadastro -");
        System.out.printf("\nInforme seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.printf("\nInforme o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine(); //necessário para limpar o buffer da quebra de linha
        System.out.printf("\nInforme o número da agência: ");
        String agencia = sc.nextLine();
        System.out.printf("\nInforme o saldo pra depósito: ");
        double saldoCliente = sc.nextDouble();
        sc.nextLine();

        ContaTerminal conta1 = new ContaTerminal(nomeCliente, numeroConta, agencia, saldoCliente);
        conta1.exibirInformacao();

        sc.close();
    }

}