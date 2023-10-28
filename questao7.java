import java.util.Scanner;
public class questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do saque (valor inteiro): ");
        int valorSaque = scanner.nextInt();

        int notas100 = valorSaque / 100;
        valorSaque %= 100;

        int notas50 = valorSaque / 50;
        valorSaque %= 50;

        int notas10 = valorSaque / 10;
        valorSaque %= 10;

        int notas5 = valorSaque / 5;
        valorSaque %= 5;

        int notas1 = valorSaque;

        System.out.println("O valor do saque pode ser expresso em:");
        System.out.println(notas100 + " notas de 100");
        System.out.println(notas50 + " notas de 50");
        System.out.println(notas10 + " notas de 10");
        System.out.println(notas5 + " notas de 5");
        System.out.println(notas1 + " notas de 1");

        scanner.close();
    }
}

