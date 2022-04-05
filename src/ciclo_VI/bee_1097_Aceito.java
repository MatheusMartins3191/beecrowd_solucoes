/*
    Desafio Bee 1097 : Sequencia IJ3.

    Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    Entrada:

    Não há nenhuma entrada neste problema.

    Saída:

    Imprima a sequencia conforme exemplo abaixo.

        I=1 J=7
        I=1 J=6
        I=1 J=5
        I=3 J=9
        I=3 J=8
        I=3 J=7
        ...
        I=9 J=15
        I=9 J=14
        I=9 J=13

    Situação: Aceito.

 */

package ciclo_VI;

public class bee_1097_Aceito {

    public static void main (String[] args) {

        int i = 1;
        int j = 7;
        int repetidor = 3;

        while (i <= 9) {

            for (int z = 0; z < repetidor; z++) {

                System.out.println("I=" + i + " J=" + j);
                j -= 1;

            }

            i += 2;
            j += 5;

        }


    }

}
