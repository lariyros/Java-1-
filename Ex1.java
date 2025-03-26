/******************************************************************************
meu primeiro programa 
*******************************************************************************/

public class Ex1 {
    public static void main(String[] args) {
        double n1, n2, soma, divisão, media; //Declarar variaveis
	    Scanner ler = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe a primeira nota: ");
        n1 = ler.nextDouble();

        System.out.print("Informe a segunda nota: ");
        n2 = ler.nextDouble();

        // Processamento
        media = (n1 + n2) / 2;
        
        System.out.println("A média final é: " + media);

        
        if (media >= 7) {
            System.out.println("O aluno está aprovado");
        } else {
            System.out.println("O aluno foi reprovado");
        }

    
    }
}
