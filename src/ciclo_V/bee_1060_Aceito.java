/*
    Desafio Bee 1060 : Números Positivos.

    Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores
    nulos). A seguir, mostre a quantidade de valores positivos digitados.

    Entrada:

        Seis valores, negativos e/ou positivos.

    Saída:

        Imprima uma mensagem dizendo quantos valores positivos foram lidos.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1060_Aceito {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double num;
        int count = 0;

        for (int i = 0; i < 6; i++) {

            num = input.nextDouble();
            if (num > 0) {
                count++;
            }

        }

        System.out.println(count + " valores positivos");

    }
}
