/*
    Desafio Bee 1018: Cédulas

    Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser
    decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de
    notas necessárias.

    Entrada:

        O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

    Saída:

        Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo
    fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a
    mensagem: “Presentation Error”.

    Situação: Aceito.

 */

package ciclo_III;
import java.util.Scanner;

public class bee_1018_Aceito {

    public static void main ( String[] args ) {

        Scanner input = new Scanner( System.in );

        int N = input.nextInt();
        int count;

        System.out.println(N);

        count = N / 100;
        System.out.println(count + " nota(s) de R$ 100,00");
        N = N - (count * 100);

        count = N / 50;
        System.out.println(count + " nota(s) de R$ 50,00");
        N = N - (count * 50);

        count = N / 20;
        System.out.println(count + " nota(s) de R$ 20,00");
        N = N - (count * 20);

        count = N / 10;
        System.out.println(count + " nota(s) de R$ 10,00");
        N = N - (count * 10);

        count = N / 5;
        System.out.println(count + " nota(s) de R$ 5,00");
        N = N - (count * 5);

        count = N / 2;
        System.out.println(count + " nota(s) de R$ 2,00");
        N = N - (count * 2);

        count = N;
        System.out.println(count + " nota(s) de R$ 1,00");

    }

}
