/*
   Desafio Bee 1132: Multiplos de 13.

   Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre
   X e Y, incluindo ambos.

   Entrada:

   O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

   Saída:

   Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se
   for o caso.

   Situação: Aceito.

 */

package ciclo_VI;

import java.util.Scanner;

public class bee_1132_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int num1 = entradaDeDados.nextInt();
        int num2 = entradaDeDados.nextInt();
        int soma = 0;

        for (int contador = num1; contador <= num2; contador++) {

            if (contador % 13 != 0) {
                soma += contador;
            }

        }

       for (int contador = num2; contador <= num1; contador++) {

            if (contador % 13 != 0) {
                soma += contador;
            }

       }

        System.out.println(soma);

        entradaDeDados.close();

    }

}
