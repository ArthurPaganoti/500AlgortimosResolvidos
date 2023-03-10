import java.util.Scanner;

public class Algo44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero, base, logaritimando;

        System.out.println("=============");
        System.out.println("Entre com o logaritimando: ");
        System.out.println("=============");
        logaritimando = sc.nextDouble();
        System.out.println("Entre com a base: ");
        System.out.println("=============");
        base = sc.nextDouble();

        numero = Math.log(logaritimando) / Math.log(base);

        System.out.println("O logaritimo é: " + numero);
    }
}