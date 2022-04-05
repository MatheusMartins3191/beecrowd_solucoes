/*
   Desafio Bee 1101 : Sequência de Números e Soma.

   Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero).
   Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo
   o N e M).

   Entrada:

   O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai conter um
   número nulo ou negativo.

   Saída:

   Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.

   Situação: Aceito.

 */

package ciclo_VI;

import java.util.Scanner;

public class bee_1101_Aceito {

    public static void main (String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int M;
        int N;
        int soma = 0;
        String resultado = "";

        do  {

            M = entradaDeDados.nextInt();

            if (M <= 0) {
                break;
            }

            N = entradaDeDados.nextInt();

            if (N <= 0) {
                break;
            }

            if (M < N) {

                for (int i = M; i <= N; i++) {
                    soma += i;
                    resultado = resultado + i + " ";
                }

                System.out.println(resultado + "Sum=" + soma);
                soma = 0;
            }


            if (M > N) {
                for (int i = N; i <= M; i++) {
                    soma += i;
                    resultado = resultado + i + " ";
                }
                System.out.println(resultado + "Sum=" + soma);
                soma = 0;
            }

            resultado = "";

        } while (M > 0 && N > 0);

    }

}
