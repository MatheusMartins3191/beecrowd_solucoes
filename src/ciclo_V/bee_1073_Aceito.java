/*

    Desafio Bee 1073 : Quadrado de Pares

    Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

    Entrada:

        A entrada contém um valor inteiro N (5 < N < 2000).

    Saída:

        Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

    Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará
    resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;
import java.lang.Math;

public class bee_1073_Aceito {

    public static void main (String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int numero = entradaDeDados.nextInt();

        for (int i = 1; i <= numero; i++) {

            if (i % 2 == 0) {
                int quadradoDoNumeroPar = (int) Math.pow(i, 2);
                System.out.println(i + "^2=" + quadradoDoNumeroPar);
            }

        }

    }

}
