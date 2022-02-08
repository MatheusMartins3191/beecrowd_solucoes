/*
   Desafio Bee 1070 : Seis Números Ímpares.

   Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha,
   inclusive o X ser for o caso.

    Entrada:

        A entrada será um valor inteiro positivo.

    Saída:

        A saída será uma sequência de seis números ímpares.


    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1070_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int numero = entradaDeDados.nextInt();
        int quantNumParaTestarSeEhImparAposValorInformadoPeloUsuario = 12;

        for (int i = numero; i < numero + quantNumParaTestarSeEhImparAposValorInformadoPeloUsuario; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }

}
