import java.util.Scanner;

import br.com.banco.Conta;
public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta("João", "123.456.789-10", "123456789", "Rua 1", "123456789", "jose@gmail.com");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        conta.setNumeroConta(sc.nextLine());
        System.out.println("Digite o número da agência: ");
        conta.setAgencia(sc.nextLine());
        System.out.println("Digite o tipo da conta: ");
        conta.setTipoConta(sc.nextLine());
        System.out.println("Digite o saldo: ");
        conta.setSaldo(sc.nextDouble());
        System.out.println("Digite o limite: ");
        conta.setLimite(sc.nextDouble());
        System.out.println("Digite o valor do saque: ");
        conta.setValorSaque(sc.nextDouble());
        conta.Sacar();
        System.out.println("Digite o valor do depósito: ");
        conta.setValorDeposito(sc.nextDouble());
        conta.Depositar();

        System.out.println("Nome: " + conta.getNome());
        System.out.println("CPF: " + conta.getCpf());
        System.out.println("RG: " + conta.getRg());
        System.out.println("Endereço: " + conta.getEndereco());
        System.out.println("Telefone: " + conta.getTelefone());
        System.out.println("E-mail: " + conta.getEmail());
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Tipo da conta: " + conta.getTipoConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Limite: " + conta.getLimite());


        sc.close();

    }
}
