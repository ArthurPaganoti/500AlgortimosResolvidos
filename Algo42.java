import java.util.Scanner;

public class Algo42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double angulo, rang;

        System.out.println("=============");
        System.out.println("Digite um angulo em graus: ");
        System.out.println("=============");
        angulo = sc.nextDouble();

        rang = angulo * 3.14 / 180;

        System.out.println("=============");
        System.out.println("Seno: " + Math.sin(rang));
        System.out.println("=============");
        System.out.println("Co-seno: " + Math.cos(rang));
        System.out.println("=============");
        System.out.println("Tangente: " + Math.tan(rang));
        System.out.println("=============");
        System.out.println("Secante: " + 1 / Math.cos(rang));
        System.out.println("=============");
        System.out.println("Co-secante: " + 1 / Math.sin(rang));
        System.out.println("=============");
        System.out.println("Co-tangente: " + 1 / Math.tan(rang));
        System.out.println("=============");
    }
}