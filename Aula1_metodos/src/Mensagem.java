import javax.lang.model.util.ElementScanner6;
import javax.sound.sampled.SourceDataLine;

public class Mensagem {
   public static void obterMensagem(int hora){
      if (hora <= 12) {
         System.out.println("Bom dia!");
      } else if (hora > 12 && hora < 18){
         System.out.println("Boa tarde!");
      } else{
         System.out.println("Boa noite!");
      }
   }
}
