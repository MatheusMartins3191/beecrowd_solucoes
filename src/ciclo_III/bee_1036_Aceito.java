/*
    Desafio Bee 1036: Fórmula de Bhaskara.

    Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular
    as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero
    negativo.

    Entrada:

        Leia três valores de ponto flutuante (double) A, B e C.

    Saída:

        Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário,
    imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
    Imprima sempre o final de linha após cada mensagem.

    Situação: Aceito.

 */

package ciclo_III;
import java.util.Scanner;

public class bee_1036_Aceito {

    public static void main ( String[] args ) {

        Scanner input = new Scanner( System.in );

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double x1, x2;

        //Cálculo do DELTA:
        double delta = Math.pow(b , 2) - (4 * a * c);

        if ((delta > 0) && (a != 0)) {
            x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
            x2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        } else {
            System.out.println("Impossivel calcular");
        }

    }

}
