import java.util.Scanner;

public class Algo41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorUm, valorDois, valorTres, valorQuatro, mediaPonderada;

        System.out.println("=============");
        System.out.println("Entre com o primeiro valor: ");
        valorUm = sc.nextDouble();
        System.out.println("=============");
        System.out.println("Entre com o segundo valor: ");
        valorDois = sc.nextDouble();
        System.out.println("=============");
        System.out.println("Entre com o terceiro valor: ");
        valorTres = sc.nextDouble();
        System.out.println("=============");
        System.out.println("Entre com o quarto valor: ");
        valorQuatro = sc.nextDouble();
        System.out.println("=============");

        mediaPonderada = (valorUm * 1 + valorDois * 2 + valorTres * 3 + valorQuatro * 4) / 10;

        System.out.println("Média ponderada: " + mediaPonderada);
    }
}