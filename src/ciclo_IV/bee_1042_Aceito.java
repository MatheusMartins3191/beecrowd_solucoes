/*
    Desafio Bee 1042 : Sort Simples.

    Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha
    em branco e em seguida, os valores na sequência como foram lidos.

    Entrada:

        A entrada contem três números inteiros.

    Saída:

        Imprima a saída conforme foi especificado.

    Situação: Aceito.

 */

package ciclo_IV;

import java.util.Scanner;

public class bee_1042_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        int n[] = new int[3];
        int z[] = new int[3];
        int maior = 0;

        for (int i = 0; i < 3; i++) {
            n[i] = input.nextInt();
            z[i] = n[i];
        }

        for (int i = 0; i < 3; i++) {

            for (int j = i + 1; j < 3; j++) {

                if (n[i] > n[j]) {
                    maior = n[i];
                    n[i] = n[j];
                    n[j] = maior;
                }

            }

        }

        for (int i = 0; i < 3; i++) {
            System.out.println(n[i]);
        }

        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            System.out.println(z[i]);
        }


    }

}
