/******************************************************************************
15 - Soma dos números de 1 a 15
*******************************************************************************/
public class Ex15 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 15; i++) {
            soma += i;
        }
        System.out.println("Soma dos números de 1 a 15: " + soma);
    }
}