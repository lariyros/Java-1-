/******************************************************************************
16 - Exibir o nome do usuário 10 vezes
*******************************************************************************/
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println(nome);
        }
    }
}