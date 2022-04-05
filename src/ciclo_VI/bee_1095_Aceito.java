/*
    Desafio Bee 1095 : Sequencia IJ1.

    Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    Entrada:

    Não há nenhuma entrada neste problema.

    Saída:

    Imprima a sequencia conforme exemplo abaixo

        I=1 J=60
        I=4 J=55
        I=7 J=50
        ...
        I=? J=0


    Situação: Aceito.

 */

package ciclo_VI;

public class bee_1095_Aceito {

    public static void main(String[] args) {

        int j = 60;
        int i = 1;

        while (j >= 5) {

            if (j == 60) {
                System.out.println("I=1 J=60");
            }

            i += 3;
            j -= 5;

            System.out.println("I=" + i + " J=" + j);

        }

    }

}
