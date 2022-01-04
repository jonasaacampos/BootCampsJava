public class Main {
   public static void main(String[] args) {
      
      //saudacao com base na hora
      Mensagem.obterMensagem(12);
      System.out.println("\n");
      
      Calculadora.soma(3, 1);
      Calculadora.subtracao(3, 1);
      Calculadora.multiplcacao(3, 2);
      Calculadora.divisao(3, 1);

      System.out.println("\n");

      Emprestimo.calcularEmprestimo(1_000, 10);


   }
}
