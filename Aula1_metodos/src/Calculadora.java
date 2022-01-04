import javax.print.event.PrintJobListener;
import javax.sound.sampled.SourceDataLine;

public class Calculadora {
   public static void soma(int n1, int n2) {
      int resultado = n1 + n2;
      System.out.printf("A soma de %d e %d resulta em %d.", n1, n2, resultado);
   }

   public static void subtracao(int n1, int n2) {
      int resultado = n1 - n2;
      System.out.printf("\nA subtracao de %d e %d resulta em %d.", n1, n2, resultado);
   }

   public static void multiplcacao(int n1, int n2) {
      double resultado = n1 * n2;
      System.out.printf("\nO produto de %d e %d resulta em %.2f .", n1, n2, resultado);
   }
   
   public static void divisao(int n1, int n2) {
      double resultado = n1 / n2;
      System.out.printf("\nA divisao de %d e %d resulta em %.2f .", n1, n2, resultado);
   }

}