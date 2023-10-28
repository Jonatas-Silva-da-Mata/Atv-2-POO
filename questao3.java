import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o tempo gasto na viagem (horas): ");
        double tempo = scanner.nextDouble();
        
        System.out.print("Informe a velocidade média (Km/h): ");
        double velocidade = scanner.nextDouble();
        
        scanner.close();
        
        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12.0;
        
        System.out.println("Velocidade média: " + velocidade + " Km/h");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " Km");
        System.out.println("Quantidade de litros utilizada: " + litrosUsados + " litros");
    }
}
