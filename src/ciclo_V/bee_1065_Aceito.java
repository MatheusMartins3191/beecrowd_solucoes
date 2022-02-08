/*

    Desafio Bee 1065 : Pares entre 5 números.

    Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

    Entrada:

        O arquivo de entrada contém 5 valores inteiros quaisquer.

    Saída:

        Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1065_Aceito {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        int contador = 0;

        for (int i = 0; i < 5; i++) {

            num = input.nextInt();
            if (num % 2 == 0) {
                contador++;
            }

        }

        System.out.println(contador + " valores pares");

    }
}
