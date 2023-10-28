import java.util.Scanner;
public class questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a duração do evento em segundos: ");
        int duracaoSegundos = scanner.nextInt();
        
        scanner.close();
        
        int horas = duracaoSegundos / 3600;
        int minutos = (duracaoSegundos % 3600) / 60;
        int segundos = duracaoSegundos % 60;
        
        System.out.printf("Duração do evento: %02d:%02d:%02d%n", horas, minutos, segundos);
    }
}

