/*
    Desafio Bee 1064 : Positivos e Media.

    Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se
    mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

    Entrada:

        A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números
    será positivo.

    Saída:

        O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores
    positivos digitados.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;
import java.text.DecimalFormat;

public class bee_1064_Aceito {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double num;
        int count = 0;
        double soma = 0;

        for (int i = 0; i < 6; i++) {

            num = input.nextDouble();

            if (num > 0) {
                count++;
                soma += num;
            }

        }

        double media = soma / count;

        System.out.println(count + " valores positivos");
        System.out.println(df.format(media));

    }
}
