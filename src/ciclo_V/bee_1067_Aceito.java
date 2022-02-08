/*
   Desafio Bee 1067 : Números Ímpares.

   Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
   se for o caso.

    Entrada:

        O arquivo de entrada contém 1 valor inteiro qualquer.

    Saída:

        Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1067_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int numero = entradaDeDados.nextInt();

        for (int i = 1; i <= numero; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }

}
