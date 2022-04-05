/*
    Desafio Bee 1096 : Sequencia IJ2.

    Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    Entrada:

        Não há nenhuma entrada neste problema.

    Saída:

        Imprima a sequencia conforme exemplo abaixo

        I=1 J=7
        I=1 J=6
        I=1 J=5
        I=3 J=7
        I=3 J=6
        I=3 J=5
        ...
        I=9 J=7
        I=9 J=6
        I=9 J=5

    Situação: Aceito.

 */

package ciclo_VI;

public class bee_1096_Aceito {

    public static void main (String[] args) {

        int i = 1;
        int j = 7;
        int repetidor = 3;

        while (i <= 9) {

            for (int k = 0; k < repetidor; k++) {
                System.out.println("I=" + i + " J=" + j);
                j -= 1;
            }

            i += 2;
            j = 7;

        }

    }

}
