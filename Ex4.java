/******************************************************************************
quarto programa 
*******************************************************************************/
import java.util.Scanner;
public class Ex4
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double salario; 
	int ts;
	
	System.out.print("Informe o salário do funcionário: ");
        salario = ler.nextDouble();
	
	System.out.print("Informe o tempo de serviço: ");
        ts = ler.nextInt();
        
	double bonus; 
	if (ts >= 5) {
	bonus = salario * 0.20; 
	} else {
	bonus = salario * 0.10;
	}
	System.out.println("O valor do bonus é:R$  " + bonus);
	}
}
