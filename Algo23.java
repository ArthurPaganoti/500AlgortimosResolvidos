import java.util.Scanner;

public class Algo23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=============");
        System.out.println("Digite um número com três casas: ");
        int numero = sc.nextInt();
        System.out.println("=============");

        int divisao = numero % 100 / 10;

        System.out.println("Algarimo da casa das dezenas: " + divisao);
    }
}