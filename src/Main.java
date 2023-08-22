import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBanco contaBanco = new ContaBanco();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema bancário");
        System.out.print("Para começar, por favor, digite seu nome: ");
        contaBanco.setNomeCliente(scanner.nextLine());

        System.out.print("Agora digite sua agência: ");
        contaBanco.setAgencia(scanner.next());

        System.out.print("Digite o número da conta: ");
        contaBanco.setNumero(scanner.nextInt());

        System.out.print("Digite a quantidade de dinheiro em sua conta: ");
        contaBanco.setSaldo(scanner.nextDouble());

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String formattedSaldo = currencyFormat.format(contaBanco.getSaldo());

        System.out.println("Olá " + contaBanco.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + contaBanco.getAgencia() + ", conta " + contaBanco.getNumero() + " e seu saldo " + formattedSaldo
                + " já está disponível para saque");    }
}