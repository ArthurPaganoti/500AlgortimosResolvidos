import java.util.Scanner;

public class Algo25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia, data, mes, ano;

        System.out.println("Digite a data no formato DDMMAA: ");
        data = sc.nextInt();

        dia = data / 10000;

        mes = data % 10000 / 100;

        ano = data % 100;

        System.out.println("=============");
        System.out.println("Dia: " + dia);
        System.out.println("=============");
        System.out.println("Mês: " + mes);
        System.out.println("=============");
        System.out.println("Ano: " + ano);
        System.out.println("=============");
    }
}