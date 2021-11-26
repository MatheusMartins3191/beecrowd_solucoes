/*
    Desafio Bee 1007 : Diferença!

        Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo
    produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

    Entrada:

        O arquivo de entrada contém 4 valores inteiros.

    Saída:

        Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco
    antes e depois da igualdade.

    Situação: Aceito.

 */

package ciclo_II;

//Importações:

import java.util.Scanner;

public class bee_1007_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner ( System.in );

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int DIFERENCA = ( A * B ) - ( C * D );

        System.out.println("DIFERENCA = " + DIFERENCA);

    }

}
