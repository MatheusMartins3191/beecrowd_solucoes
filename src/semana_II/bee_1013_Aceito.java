/*

    Desafio Bee 1013 : O Maior.

   Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
   Utilize a fórmula:

        MaiorAB = (a + b + abs(a-b)) / 2

    Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para
    chegar no resultado esperado.

    Entrada:

        O arquivo de entrada contém três valores inteiros.

    Saída:

        Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

    Situação: Aceito.

 */

package semana_II;

import java.util.Scanner;

public class bee_1013_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maior = 0;

        int maiorAB = (a + b + Math.abs(a-b)) / 2;

        if (maiorAB > c) {
            maior = maiorAB;
        } else {
            maior = c;
        }

        System.out.println(maior + " eh o maior");

    }

}
