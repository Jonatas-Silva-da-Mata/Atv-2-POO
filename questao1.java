public class questao1 {
    public static void main(String[] args) {
        int n = 4; // Altere o valor de 'n' conforme necessário

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
