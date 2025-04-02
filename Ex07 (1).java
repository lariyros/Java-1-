/******************************************************************************
Ex 7 - mostre a sua omissão e seu salário bruto neste mês
******************************************************************************/
import java.util.Scanner;
public class Ex07 
{
   
    public static void main(String[] args) {
        double salario = 1200.00;  
        double comissao = 0.10;    
        double corteComissao = 2000.00;  

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o total vendido no mês de abril: R$ ");
        double total = scanner.nextDouble();

        
        double valorComissao = 0;
        if (total > corteComissao) {
            valorComissao = (total - corteComissao) * comissao;  
        }

        
        salario += valorComissao;

        
        System.out.println("\nDetalhes do pagamento:");
        System.out.println("Total vendido: R$ " + total);
        System.out.println("Comissão: R$ " + valorComissao);
        System.out.println("Salário total: R$ " + salario);
    }
}
