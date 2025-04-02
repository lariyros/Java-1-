/******************************************************************************

*******************************************************************************/
import java.util.Scanner; 
public class Ex6
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1;
		
		System.out.println("Informe um numero: ");
		n1 = ler.nextInt();
		
		if ( n1 % 2 == 0) {
		System.out.println("Numero par");
		} else {
		    System.out.println("Numero impar");
		    
		}
	}	
}

