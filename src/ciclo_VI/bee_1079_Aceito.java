/*
   Desafio Bee 1079 : Médias Ponderadas.

   Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3
   valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
   valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

    Entrada:

    O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de teste com
    três valores com uma casa decimal cada valor.

    Saída:

    Para cada caso de teste, imprima a média ponderada dos 3 valores

    Situação: Aceito.

 */

package ciclo_VI;
import java.util.Scanner;

public class bee_1079_Aceito {

    public static void main (String[] args) {

        Scanner entradaDeDados =  new Scanner(System.in);

        int quantidadeCasosDeTestes = entradaDeDados.nextInt();
        double numeros[] =  new double[3];
        double media = 0.0;

        for (int i = 0; i < quantidadeCasosDeTestes; i++) {

            for (int j = 0; j < 3; j++) {
                numeros[j] = entradaDeDados.nextDouble();

                if (j == 0) {
                    numeros[j] *= 2;
                } else if (j == 1) {
                    numeros[j] *= 3;
                } else if (j == 2) {
                    numeros[j] *= 5;

                }

                media += numeros[j];


            }

            System.out.printf("%.1f\n", (media / 10.0));

            media = 0;
        }

        entradaDeDados.close();

    }

}
