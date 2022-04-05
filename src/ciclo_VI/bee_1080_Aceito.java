/*
   Desafio Bee 1080 : Maior e Posição.

   Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

   Entrada:

   O arquivo de entrada contém 100 números inteiros, positivos e distintos.

   Saída:

   Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

   Situação: Aceito.

 */

package ciclo_VI;
import java.util.Scanner;

public class bee_1080_Aceito {

    public static void main (String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int numero[] = new int[100];
        int maiorNumero = 0;
        int posicaoMaiorNumero = 0;

        for (int i = 0; i < 100; i++) {
            numero[i] = entradaDeDados.nextInt();
            if (numero[i] > maiorNumero) {
                maiorNumero = numero[i];
                posicaoMaiorNumero = i + 1;
            }
        }

        System.out.println(maiorNumero);
        System.out.println(posicaoMaiorNumero);

    }

}
