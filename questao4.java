import java.util.Scanner;
public class questao4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        
        System.out.print("Informe o valor em dólares: ");
        double valorDolar = scanner.nextDouble();
        
        scanner.close();
        
        double valorReal = cotacaoDolar * valorDolar;
        
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
