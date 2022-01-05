import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Tabuada {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Tabuada de qual numero?");

      int n = 0, contador = 1;
      
      n = entrada.nextInt();

      do{
         int produto = n * contador;
         System.out.printf("\n%d x %d = %d", n, contador, produto);
         contador++;
      }while(contador <= 10);

   }
}
