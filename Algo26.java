import java.util.Scanner;

public class Algo26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int data, dia, mes, ano, numeroData;

        System.out.println("Digite a data no formata DDMMAA: ");
        data = sc.nextInt();

        dia = data / 10000;

        mes = data % 10000 / 100;

        ano = data % 100;

        numeroData = mes * 10000 + dia * 100 + ano;

        System.out.println("=============");
        System.out.println("Dia: " + dia);
        System.out.println("=============");
        System.out.println("Mês: " + mes);
        System.out.println("=============");
        System.out.println("Ano: " + ano);
        System.out.println("=============");
        System.out.println("Data no formato MMDDAA: " + numeroData);
        System.out.println("=============");
    }
}