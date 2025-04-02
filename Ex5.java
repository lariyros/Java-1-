/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner; 
public class Ex5
{
	public static void main(String[] args) {
	     Scanner ler = new Scanner(System.in);
	double s, ve; 
	int np;	
		
    System.out.print("Informe o salário: ");
        s = ler.nextDouble();
        
    System.out.print("Informe o valor do emprestimo: ");
        ve = ler.nextDouble();
	
	System.out.print("Informe o numero de parcelas: ");
        np = ler.nextInt();
        
     double parcela = ve / np;
     
     if (parcela <= s * 0.30) {
    System.out.println("Emprestimo aprovado");
    } else{
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     System.out.println("Emprestimo negado");
    }
	}
}
