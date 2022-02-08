/*
    Desafio Bee 1065 : Pares, ímpares, positivos e negativos.

    Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram
    ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

    Entrada:

        O arquivo de entrada contém 5 valores inteiros quaisquer.

    Saída:

        Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após
    cada uma.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1066_Aceito {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int contPares = 0;
        int contImpares = 0;
        int contPositivos = 0;
        int contNegativos = 0;

        for (int i = 0; i < 5; i++) {

            num = input.nextInt();

            if (num % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }

            if (num < 0) {
                contNegativos++;
            } else if (num > 0) {
                contPositivos++;
            }

        }

        System.out.println(contPares + " valor(es) par(es)");
        System.out.println(contImpares + " valor(es) impar(es)");
        System.out.println(contPositivos + " valor(es) positivo(s)");
        System.out.println(contNegativos + " valor(es) negativo(s)");

    }
}
