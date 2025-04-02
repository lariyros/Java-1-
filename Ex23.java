/******************************************************************************
23- Médias dos pesos das pessoas da mesma faixa etária
*******************************************************************************/
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd1a10 = 0, qtd11a20 = 0, qtd21a30 = 0, qtd31mais = 0;
        double soma1a10 = 0, soma11a20 = 0, soma21a30 = 0, soma31mais = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            System.out.print("Digite o peso da pessoa " + i + ": ");
            double peso = sc.nextDouble();

            if (idade >= 1 && idade <= 10) {
                soma1a10 += peso;
                qtd1a10++;
            } else if (idade >= 11 && idade <= 20) {
                soma11a20 += peso;
                qtd11a20++;
            } else if (idade >= 21 && idade <= 30) {
                soma21a30 += peso;
                qtd21a30++;
            } else {
                soma31mais += peso;
                qtd31mais++;
            }
        }

        System.out.println("Média de peso (1 a 10 anos): " + (qtd1a10 > 0 ? soma1a10 / qtd1a10 : 0));
        System.out.println("Média de peso (11 a 20 anos): " + (qtd11a20 > 0 ? soma11a20 / qtd11a20 : 0));
        System.out.println("Média de peso (21 a 30 anos): " + (qtd21a30 > 0 ? soma21a30 / qtd21a30 : 0));
        System.out.println("Média de peso (31 anos ou mais): " + (qtd31mais > 0 ? soma31mais / qtd31mais : 0));

        sc.close();
    }
}