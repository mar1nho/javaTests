import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("", 1000.0, "123456", "corrente");

        System.out.println("Olá, qual o seu nome?");
        String userName = scanner.next();
        conta.setTitular(userName);
        while (continuar) {

            System.out.println("Olá " + userName + ", o que gostaria de fazer hoje? 1- Depositar 2- Sacar 3- Ver Saldo");

            int choosen = scanner.nextInt();
            if (choosen == 1) {
                System.out.println("Quanto gostaria de depositar?");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
            } else if (choosen == 2) {
                System.out.println("Quanto gostaria de sacar?");
                double valor = scanner.nextDouble();
                conta.sacar(valor);
            } else if (choosen == 3) {
                System.out.println("Seu saldo atual é de R$ " + conta.getSaldo());
            }

            System.out.println("Deseja continuar? 1- Sim 2- Não");
            int escolha = scanner.nextInt();
            if (escolha == 2) {
                continuar = false;
            }
        }
    }
}
