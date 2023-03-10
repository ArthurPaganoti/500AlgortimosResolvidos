import java.util.Scanner;

public class Algo48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioMinimo, quantidade, preco, valorPago, valorDesconto;

        System.out.println("=============");
        System.out.println("Entre com o sálario mínimo: ");
        System.out.println("=============");
        salarioMinimo = sc.nextDouble();
        System.out.println("Entre com a quantidade em quilowatt: ");
        System.out.println("=============");
        quantidade = sc.nextDouble();

        preco = salarioMinimo / 700;

        valorPago = preco * quantidade;

        valorDesconto = valorPago * 0.9;

        System.out.println("=============");
        System.out.println("Preço do quilowatt: " + preco);
        System.out.println("=============");
        System.out.println("Valor a ser pago: " + valorPago);
        System.out.println("=============");
        System.out.println("Valor com desconto aplicado: " + valorDesconto);
        System.out.println("=============");
    }
}