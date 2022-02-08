/*
    Desafio Bee 1075 : Resto 2.

    Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

    Entrada:

    A entrada contém um valor inteiro N (N < 10000).

    Saída:

    Imprima todos valores que quando divididos por N dão resto = 2, um por linha.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1075_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int numero = entradaDeDados.nextInt();

        for (int i = 1; i < 10000; i++) {
            if (i % numero == 2) {
                System.out.println(i);
            }

        }

        entradaDeDados.close();

    }

}
