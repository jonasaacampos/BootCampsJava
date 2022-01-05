import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class MaiorMedia {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      int numero;
      int maior = 0;
      int soma = 0;

      int contador = 0;

      do {
         System.out.println("Insira um numero: ");
         numero = entrada.nextInt();
         
         soma += numero;
         if (numero > maior) maior = numero;
         contador++;
      } while(contador < 5);

      System.out.println("Maior: " + maior);
      System.out.println("Media: " + (soma / 5) );

   }
}
