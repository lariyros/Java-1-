/******************************************************************************

*******************************************************************************/
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = ler.nextLine(); 
        
        double n1, n2, n3;

        System.out.print("Digite a primeira nota: ");
        n1 = ler.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        n2 = ler.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        n3 = ler.nextDouble();
        
        double soma = n1 + n2 + n3;
        double media = soma / 3;
        
        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média das notas é: " + media);
        
        // Verificar se o aluno foi aprovado ou precisa estudar mais
        if (media >= 5) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno, você precisa estudar mais!");
        }
        
        
    }
}
