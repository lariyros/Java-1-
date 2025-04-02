/******************************************************************************
Ex 8 - Calcular peso ideal
*******************************************************************************/
import java.util.Scanner;
public class Ex8
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo da pessoa (masculino ou feminino): ");
        String sexo = scanner.next();

        double pesoIdeal = 0;

        if (sexo.equalsIgnoreCase("masculino")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("feminino")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido!");
            scanner.close();
            return;
        }

        System.out.println("O peso ideal é: " + pesoIdeal + " kg");

    }
}


 