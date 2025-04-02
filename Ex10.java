/******************************************************************************
10 - Cálculo do valor para encher o tanque
*******************************************************************************/
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de carro (G - gasolina / A - álcool): ");
        char tc = sc.next().toUpperCase().charAt(0);
        System.out.print("Capacidade do tanque (litros): ");
        double ct = sc.nextDouble();

        double vg;
        if (tc == 'G') {
            vg = ct * 1.80;
        } else {
            vg = ct * 1.00;
        }

        System.out.println("Valor gasto para encher o tanque: R$ " + vg);
    }
}
