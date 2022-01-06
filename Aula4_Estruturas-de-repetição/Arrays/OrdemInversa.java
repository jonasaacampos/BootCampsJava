package Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
   public static void main(String[] args) {
      int[] vetor = {-1, 0, 1, 2, 3, 4};
      int tamanhoVetor = vetor.length;
      //System.out.println(tamanhoVetor);

      int contador = 0;
      System.out.print("Vetor: ");
      while(contador < tamanhoVetor) {
         System.out.print(vetor[contador] + " ");
         contador++;
      }

      System.out.println("Vetor invertido: ");
      for(int i = (tamanhoVetor -1); i >=0; i--){
         System.out.print(vetor[i] + " ");

      }

   }
}
