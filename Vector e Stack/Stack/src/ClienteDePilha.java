
import java.util.Stack;

/*
 Exemplo de cliente de pilha:  lê strings da entrada padrão e insere-as numa pilha, a menos que a string lida seja "-", caso em que remove uma string da pilha
 */

/**
 *
 * @author bONGANI
 */
public class ClienteDePilha {

   public static void main(String[] args) {
      Stack<String> pilha;
//new Stack<String>() cria uma instância da classe Stack, com tipo concreto String no lugar do parâmetro Item.  Assim, a variável pilha passa a ser uma pilha de Strings.
      
      pilha = new Stack<String>();

      while (!StdIn.isEmpty()) {
         String str = StdIn.readString();
 //str é uma instância da classe String de Java. O método equals() compara str com outra string.  (A propósito, a expressão if (str != "-") é sintaticamente errada. A expressão if (!equals(str, "-") também está errada.)
         if (!str.equals("-"))
            pilha.push(str);
         else if (!pilha.isEmpty()) 
                 StdOut.print(pilha.pop() + " ");
// StdIn e StdOut são bibliotecas de métodos estáticos que cuidam da entrada padrão e saída padrão respectivamente.
      }
      StdOut.println("(" + pilha.size() + " left on stack)");
   }
//O método main() é declarado como static porque ele faz parte da classe ClienteDePilha toda e não de instâncias particulares da classe.  É bem verdade, entretanto, que ninguém vai pensar em construir uma instância desse programa cliente (dizendo new ClienteDePilha()
}
