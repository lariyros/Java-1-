/******************************************************************************
9 - Cálculo do valor a ser pago no estacionamento
*******************************************************************************/
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora de entrada: ");
        int he = sc.nextInt();
        System.out.print("Minuto de entrada: ");
        int me = sc.nextInt();
        System.out.print("Hora de saída: ");
        int hs = sc.nextInt();
        System.out.print("Minuto de saída: ");
        int ms = sc.nextInt();

        int minutosEntrada = he * 60 + me;
        int minutosSaida = hs * 60 + ms;

        int tempoTotal = minutosSaida - minutosEntrada;

        int horasCobradas = (tempoTotal + 59) / 60; 

        int pag;
        if (horasCobradas == 1) {
            pag = 4;
        } else if (horasCobradas == 2) {
            pag = 6;
        } else {
            pag = 6 + (horasCobradas - 2);
        }

        System.out.println("Valor a pagar: R$ " + pag);
        
    }
}