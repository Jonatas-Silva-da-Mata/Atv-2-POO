import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();
        
        double fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}
