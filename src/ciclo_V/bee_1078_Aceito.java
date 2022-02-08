/*
    Desafio Bee 1078 : Tabuada.

    Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:

        1 x N = N
        2 x N = 2N
        ...
        10 x N = 10N

    Entrada:

    A entrada contém um valor inteiro N (2 < N < 1000).

    Saída:

    Imprima a tabuada de N, conforme o exemplo fornecido.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1078_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int numero = entradaDeDados.nextInt();
        entradaDeDados.close();

        for (int i = 1; i <= 10; i++) {
            int valorTabuada = numero * i;
            System.out.println(i + " x " + numero + " = " + valorTabuada);
        }

    }

}
