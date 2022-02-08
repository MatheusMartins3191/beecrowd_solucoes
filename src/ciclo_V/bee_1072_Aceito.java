/*

    Desafio Bee 1072 : Intervalo 2

    Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
    informações.

    Entrada:

        A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
    Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

    Saída:

        Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1072_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int quantDeNumerosASeremInformados = entradaDeDados.nextInt();
        int contador = 0;
        int contadorIn = 0;
        int contadorOut = 0;

        while (contador < quantDeNumerosASeremInformados) {

            int numero = entradaDeDados.nextInt();

            if (numero >= 10 && numero <= 20) {
                contadorIn++;
            } else {
                contadorOut++;
            }

            contador++;
        }

        System.out.println(contadorIn + " in");
        System.out.println(contadorOut + " out");

    }

}
