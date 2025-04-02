/******************************************************************************
13 - Cálculo da área do terreno e classificação
*******************************************************************************/
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno (m): ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno (m): ");
        double comprimento = sc.nextDouble();

        double area = largura * comprimento;
        String classificacao;

        if (area < 100) {
            classificacao = "TERRENO POPULAR";
        } else if (area <= 500) {
            classificacao = "TERRENO MASTER";
        } else {
            classificacao = "TERRENO VIP";
        }

        System.out.println("Área do terreno: " + area + " m²");
        System.out.println("Classificação: " + classificacao);
        sc.close();
    }
}