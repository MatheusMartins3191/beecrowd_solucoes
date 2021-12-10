/*
    Desafio Bee 1044 : Múltiplos.

    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
    indicando se os valores lidos são múltiplos entre si.

    Entrada:

        A entrada contém valores inteiros.

    Saída:

        A saída deve conter uma das mensagens conforme descrito acima.


    Situação: Aceito.

 */

package ciclo_IV;
import java.util.Scanner;

public class bee_1044_Aceito {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if ( ((a > b) && (a % b == 0)) || ((b > a) && (b % a == 0))) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }

}
