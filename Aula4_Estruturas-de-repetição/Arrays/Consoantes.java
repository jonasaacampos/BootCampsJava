package Arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Consoantes {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      String[] consoantes = new String[6];
      int quantidadeConsoantes = 0, contator = 0;

      do {
         System.out.print("Letra: ");
         String letra = entrada.next();

         if (!(letra.equalsIgnoreCase("a") |
               letra.equalsIgnoreCase("e") |
               letra.equalsIgnoreCase("i") |
               letra.equalsIgnoreCase("o") |
               letra.equalsIgnoreCase("u"))) {
            consoantes[contator] = letra;
            quantidadeConsoantes++;
         }
         contator++;

      } while (contator < consoantes.length);

      System.out.print("Consoantes: ");

      for (String consoante : consoantes) {
         if (consoante != null)
            System.out.print(consoante + " ");
      }
      System.out.println("Foram digitadas " + quantidadeConsoantes + " consoantes.");
   }

}
