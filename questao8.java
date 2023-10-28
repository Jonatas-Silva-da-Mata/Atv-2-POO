import java.util.Scanner;
public class questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da diária normal: ");
        double diariaNormal = scanner.nextDouble();

        double taxaPromocao = 0.22;
        int mesesAltaTemporada = 5;
        double taxaOcupacaoSemPromocao = 0.40;
        double taxaOcupacaoComPromocao = 0.70;

        double diariaPromocao = diariaNormal * (1 - taxaPromocao);
        double arrecadacaoSemPromocao = diariaNormal * mesesAltaTemporada * taxaOcupacaoSemPromocao;
        double arrecadacaoComPromocao = diariaPromocao * mesesAltaTemporada * taxaOcupacaoComPromocao;
        double lucroOuPrejuizo = arrecadacaoComPromocao - arrecadacaoSemPromocao;

        System.out.println("Valor da diária no período da promoção: " + diariaPromocao);
        System.out.println("Valor médio arrecadado sem promoção, durante um mês: " + arrecadacaoSemPromocao);
        System.out.println("Valor médio arrecadado com a promoção, durante um mês: " + arrecadacaoComPromocao);
        System.out.println("Lucro ou prejuízo mensal com a promoção: " + lucroOuPrejuizo);

        scanner.close();
    }
}
