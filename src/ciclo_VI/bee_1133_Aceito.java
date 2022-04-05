/*
   Desafio Bee 1133: Resto da Divisão.

   Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da divisão dele por
   5 for igual a 2 ou igual a 3.

   Entrada:

   O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.

   Saída:

   Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.

   Situação: Aceito.

 */

package ciclo_VI;

import java.util.Scanner;

public class bee_1133_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int num1 = entradaDeDados.nextInt();
        int num2 = entradaDeDados.nextInt();

        for (int contador = num1 + 1; contador < num2; contador++) {
            if ((contador % 5 == 2) || (contador % 5 == 3)) {
                System.out.println(contador);
            }
        }

        for (int contador = num2 + 1; contador < num1; contador++) {
            if ((contador % 5 == 2) || (contador % 5 == 3)) {
                System.out.println(contador);
            }
        }

        entradaDeDados.close();

    }

}
