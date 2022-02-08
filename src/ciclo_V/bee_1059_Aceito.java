/*
    Desafio Bee 1059 : Números Pares.

    Faça um programa que mostre os números pares entre 1 e 100, inclusive.

    Entrada:

        Neste problema extremamente simples de repetição não há entrada.

    Saída:

        Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.

    Situação: Aceito.

 */

package ciclo_V;

public class bee_1059_Aceito {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }

    }
}
