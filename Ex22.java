/******************************************************************************
22 - Idade média e distribuição por sexo
*******************************************************************************/
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaIdades = 0, somaHomens = 0, somaMulheres = 0, homens = 0, mulheres = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            somaIdades += idade;
            if (sexo == 'M') {
                somaHomens += idade;
                homens++;
            } else {
                somaMulheres += idade;
                mulheres++;
            }
        }

        System.out.println("Idade média do grupo: " + (somaIdades / 7.0));
        System.out.println("Idade média dos homens: " + (homens > 0 ? somaHomens / (double) homens : 0));
        System.out.println("Idade média das mulheres: " + (mulheres > 0 ? somaMulheres / (double) mulheres : 0));
        sc.close();
    }
}