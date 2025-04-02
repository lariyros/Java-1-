/******************************************************************************
11 - Cálculo do crédito especial do banco
*******************************************************************************/
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo médio: ");
        double saldoMedio = sc.nextDouble();

        double credito;
        if (saldoMedio >= 0 && saldoMedio <= 200) {
            credito = 0;
        } else if (saldoMedio <= 400) {
            credito = saldoMedio * 0.20;
        } else if (saldoMedio <= 600) {
            credito = saldoMedio * 0.30;
        } else {
            credito = saldoMedio * 0.40;
        }

        System.out.println("Saldo médio: R$ " + saldoMedio);
        System.out.println("Crédito especial: R$ " + credito);
    }
}