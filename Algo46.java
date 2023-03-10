import java.util.Scanner;

public class Algo46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo, novoSaldo;

        System.out.println("=============");
        System.out.println("Digite o saldo: ");
        System.out.println("=============");
        saldo = sc.nextDouble();

        novoSaldo = saldo * 1.01;

        System.out.println("Novo saldo: " + novoSaldo);
    }
}