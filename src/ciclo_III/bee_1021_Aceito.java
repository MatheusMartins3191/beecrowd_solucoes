/*
    Desafio Bee 1021: Notas e Moedas.

    Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir,
    calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são
    de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação
    de notas necessárias.

    Entrada:

        O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

    Saída:

        Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

    Obs: Utilize ponto (.) para separar a parte decimal.

    Situação: Aceito.

 */

package ciclo_III;
import java.util.Scanner;

public class bee_1021_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();

        int partInteira = (int) valor;

        //Código para tratar da parte decimal:

            valor = valor * 100;
            int partDecimal = (int) valor - partInteira * 100;

        int count;

        System.out.println("NOTAS:");

        count = partInteira / 100;
        partInteira = partInteira - (count * 100);
        System.out.println(count + " nota(s) de R$ 100.00");

        count = partInteira / 50;
        partInteira = partInteira - (count * 50);
        System.out.println(count + " nota(s) de R$ 50.00");

        count = partInteira / 20;
        partInteira = partInteira - (count * 20);
        System.out.println(count + " nota(s) de R$ 20.00");

        count = partInteira / 10;
        partInteira = partInteira - (count * 10);
        System.out.println(count + " nota(s) de R$ 10.00");

        count = partInteira / 5;
        partInteira = partInteira - (count * 5);
        System.out.println(count + " nota(s) de R$ 5.00");

        count = partInteira / 2;
        partInteira = partInteira - (count * 2);
        System.out.println(count + " nota(s) de R$ 2.00");

        //MOEADAS:

        System.out.println("MOEDAS:");

        count = partInteira;
        System.out.println(count + " moeda(s) de R$ 1.00");

        count = partDecimal / 50;
        partDecimal = partDecimal - (count * 50);
        System.out.println(count + " moeda(s) de R$ 0.50");

        count = partDecimal / 25;
        partDecimal = partDecimal - (count * 25);
        System.out.println(count + " moeda(s) de R$ 0.25");

        count = partDecimal / 10;
        partDecimal = partDecimal - (count * 10);
        System.out.println(count + " moeda(s) de R$ 0.10");

        count = partDecimal / 5;
        partDecimal = partDecimal - (count * 5);
        System.out.println(count + " moeda(s) de R$ 0.05");

        count = partDecimal / 1;
        partDecimal = partDecimal - (count * 1);
        System.out.println(count + " moeda(s) de R$ 0.01");

    }

}

