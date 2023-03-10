import java.util.Scanner;

public class Algo40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double quociente, resto, dividendo, divisor;

        System.out.println("Entre com o dividendo: ");
        dividendo = sc.nextDouble();

        System.out.println("Entre com o divisor: ");
        divisor = sc.nextDouble();

        quociente = dividendo / divisor;

        resto = dividendo % divisor;

        System.out.println("=============");
        System.out.println("Dividendo: " + dividendo);
        System.out.println("=============");
        System.out.println("Divisor: " + divisor);
        System.out.println("=============");
        System.out.println("Quociente: " + quociente);
        System.out.println("=============");
        System.out.println("Resto: " + resto);
        System.out.println("=============");
    }
}