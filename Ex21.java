/******************************************************************************
21 - Análise de características físicas
*******************************************************************************/
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade50peso60 = 0, somaIdadesBaixos = 0, baixos = 0, olhosAzuis = 0, ruivosSemOlhosAzuis = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Cor dos olhos (A/P/V/C): ");
            char olhos = sc.next().toUpperCase().charAt(0);
            System.out.print("Cor dos cabelos (P/C/L/R): ");
            char cabelos = sc.next().toUpperCase().charAt(0);

            if (idade > 50 && peso < 60) idade50peso60++;
            if (altura < 1.50) {
                somaIdadesBaixos += idade;
                baixos++;
            }
            if (olhos == 'A') olhosAzuis++;
            if (cabelos == 'R' && olhos != 'A') ruivosSemOlhosAzuis++;
        }

        double mediaIdadeBaixos = baixos > 0 ? (double) somaIdadesBaixos / baixos : 0;
        double porcentagemOlhosAzuis = (olhosAzuis / 20.0) * 100;

        System.out.println("Pessoas com idade > 50 e peso < 60kg: " + idade50peso60);
        System.out.println("Média de idade de pessoas < 1.50m: " + mediaIdadeBaixos);
        System.out.println("Porcentagem de olhos azuis: " + porcentagemOlhosAzuis + "%");
        System.out.println("Pessoas ruivas sem olhos azuis: " + ruivosSemOlhosAzuis);
        sc.close();
    }
}