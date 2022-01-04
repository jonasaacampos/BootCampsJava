public class Emprestimo {
   public static void calcularEmprestimo(double valor, int parcelas){
      double valorParcela = valor / parcelas;

      System.out.printf("O valor da parcela sera de R$ %.2f", valorParcela);
   }
   
}
