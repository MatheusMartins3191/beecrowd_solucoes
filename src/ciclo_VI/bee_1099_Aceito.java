/*
    Desafio Bee 1099 : Soma de Ímpares Consecutivos II.

    Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois
    inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

    Entrada:

    A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste
    consiste em uma linha contendo dois inteiros X e Y.

    Saída:

    Imprima a soma de todos valores ímpares entre X e Y.

    Situação: Aceito.

 */

package ciclo_VI;

import java.util.Scanner;

public class bee_1099_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int quantidadeCasosDeTeste = entradaDeDados.nextInt();
        int contador = 0;
        int num1;
        int num2;
        int somaNumerosImparesDoIntervalo = 0;

        while (contador < quantidadeCasosDeTeste) {

            num1 = entradaDeDados.nextInt();
            num2 = entradaDeDados.nextInt();

            if (num1 < num2) {

                for (int i = num1 + 1; i < num2; i++) {

                    if (i % 2 != 0) {
                        somaNumerosImparesDoIntervalo += i;
                    }

                }
            }

            if (num1 > num2) {

                for (int i = num2 + 1; i < num1; i++) {

                    if (i % 2 != 0) {
                        somaNumerosImparesDoIntervalo += i;
                    }

                }

            }



            System.out.println(somaNumerosImparesDoIntervalo);

            somaNumerosImparesDoIntervalo = 0;

            contador++;

        }

    }

}
