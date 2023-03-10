import java.util.Scanner;

public class Algo43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero, logaritimo;

        System.out.println("=============");
        System.out.println("Entre com um logaritimando: ");
        System.out.println("=============");
        numero = sc.nextDouble();

        logaritimo = Math.log(numero) / Math.log(10);

        System.out.println("Logaritimo: " + logaritimo);
    }
}