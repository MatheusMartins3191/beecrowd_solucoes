/*

   Desafio Bee 1071 : Soma de Ímpares Consecutivos

   Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

    Entrada:

        O arquivo de entrada contém dois valores inteiros.

    Saída:

        O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores
    fornecidos na entrada que deverá caber em um inteiro.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1071_Aceito {
    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int primeiroNumero = entradaDeDados.nextInt();
        int segundoNumero = entradaDeDados.nextInt();
        int somaNumerosImpares = 0;
        int maiorNumero = 0;

        if (primeiroNumero > segundoNumero) {
            maiorNumero = primeiroNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = maiorNumero;
        }

        int numeroParaVerificacao = primeiroNumero + 1;

        while (numeroParaVerificacao < segundoNumero) {

            if (numeroParaVerificacao % 2 != 0) {
                somaNumerosImpares += numeroParaVerificacao;
            }

            numeroParaVerificacao++;

        }

        System.out.println(somaNumerosImpares);
    }
}
