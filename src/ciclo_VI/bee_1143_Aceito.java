/*
   Desafio Bee 1142: Quadrado e ao Cubo.

   Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão
   apresentadas na execução do programa.

   Entrada:

   O arquivo de entrada contém um número inteiro positivo N.

   Saída:

   Imprima a saída conforme o exemplo fornecido.

   1 1 1
   2 4 8
   3 9 27
   4 16 64
   5 25 125

   Situação: Aceito.

 */

package ciclo_VI;

import java.util.Scanner;

public class bee_1143_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int numero = entradaDeDados.nextInt();

        for (int i = 1; i <= numero; i++) {
            int quadrado = (int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);
            System.out.println(i + " " + quadrado + " " + cubo);
        }

        entradaDeDados.close();

    }

}
