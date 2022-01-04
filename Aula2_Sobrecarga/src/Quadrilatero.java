public class Quadrilatero {
   public static void area(int lado){
      System.out.println("Area do quadrado: " + Math.pow(lado, 2));
   }

   public static void area(int lado1, int lado2){
      double a = lado1 * lado2;
      System.out.println("Area: " + a);
   }

   public static void area(int baseMaior, int baseMenor, int altura){
      double a = ((baseMaior + baseMenor) * altura) / 2;
      System.out.println("Area Trapezio: " + a);
   }

   public static void area(float diagonal1, float diagonal2){
      double a = ((diagonal1 * diagonal2) / 2);
      System.out.println("Area do losango: " + a);
   }

}
