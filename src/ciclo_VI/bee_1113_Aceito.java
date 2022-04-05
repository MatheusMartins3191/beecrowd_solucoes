/*
   Desafio Bee 1113 : Crescente e Decrescente.

   Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que
   indique se estes valores foram digitados em ordem crescente ou decrescente.

   Entrada:

   A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura deve ser encerrada
   ao ser fornecido valores iguais para X e Y.

   Saída:

   Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, caso contrário
   imprima a mensagem “Decrescente”.

   Situação: Aceito.

 */

package ciclo_VI;
import java.util.Scanner;

public class bee_1113_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int X;
        int Y;

        do {

            X = entradaDeDados.nextInt();
            Y = entradaDeDados.nextInt();

            if (X > Y) {
                System.out.println("Decrescente");
            }

            if (Y > X) {
                System.out.println("Crescente");
            }


        } while (X != Y);

    }

}
