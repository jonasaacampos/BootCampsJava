import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParImpar{
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int quantidadeNumeros;
      int numero;
      int quantidadePares = 0, quantidadeImpares = 0, contador = 0;

      System.out.println("Qantos numeros ira digitar?");

      quantidadeNumeros = entrada.nextInt();

      do {
         System.out.println("Insira um numero: ");
         numero = entrada.nextInt();

         if (numero % 2 == 0) quantidadePares++;
         else quantidadeImpares++;

         contador++;

      }while (contador < quantidadeNumeros);

      System.out.println("Quantidade Pares: " + quantidadePares);
      System.out.println("Quantidade Impares: " + quantidadeImpares);

   }
}