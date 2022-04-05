/*
   Desafio Bee 1115: Quadrante.

   Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
   Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas
   coordenadas for NULA (nesta situação sem escrever mensagem alguma).

   Entrada:

   A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

   Saída:

   Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o
   exemplo.

   Situação: Aceito.

 */

package ciclo_VI;

import java.util.Scanner;

public class bee_1115_Aceito {

    public static void main (String[] args) {

    Scanner entradaDeDados = new Scanner(System.in);

    int X;
    int Y;
    int aux = 1;

    do {

        X = entradaDeDados.nextInt();
        Y = entradaDeDados.nextInt();

        if (X == 0 || Y == 0) {
            break;
        }

        if (X > 0 && Y > 0) {
            System.out.println("primeiro");
        }

        if (X > 0 && Y < 0) {
            System.out.println("quarto");
        }

        if (X < 0 && Y < 0) {
            System.out.println("terceiro");
        }

        if (X < 0 && Y > 0) {
            System.out.println("segundo");
        }

    } while(aux == 1);

    entradaDeDados.close();

    }

}
