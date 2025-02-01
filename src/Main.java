import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var newConta = new ContaTerminal();

        System.out.println("Por favor, digite o número da Sua Conta: ");
        newConta.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite o número da Agência: ");
        newConta.setAgencia(scanner.next());

        System.out.println("Por favor, digite o nome do Titular: ");
        newConta.setTitular(scanner.next());

        System.out.println("Por favor, digite o Saldo da Conta: ");
        newConta.setSaldo(scanner.nextDouble());

        String msg = "Olá " + newConta.getTitular() + ", " +
                "obrigado por criar uma conta em nosso banco, sua agência é " + newConta.getAgencia() +
                ", conta " + newConta.getNumero() + " e seu saldo " + newConta.getSaldo()
                + " já está disponivel para saque.";
        System.out.println(msg);
    }
}
