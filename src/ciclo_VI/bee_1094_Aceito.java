/*
   Desafio Bee 1094 : Experiências.

   Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os
   experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
   utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

   Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela
   sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias
   utilizadas em cada experimento.

   Entrada:

   A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso
   de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um
   caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

   Saída:

   Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em
   relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.

   Situação: Aceito.

 */

package ciclo_VI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bee_1094_Aceito {

    public static void main (String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int quantia = 0;
        String tipo;
        int quantidadeTotalCobaias = 0;
        int quantidadeRatos = 0;
        int quantidadeCoelhos = 0;
        int quantidadeSapos = 0;

        int casosDeTeste = entradaDeDados.nextInt();


        for (int i = 0; i < casosDeTeste; i++) {

            quantia = entradaDeDados.nextInt();
            tipo = entradaDeDados.next();

            switch (tipo) {
                case "R":
                    quantidadeRatos += quantia;
                    break;
                case "S":
                    quantidadeSapos += quantia;
                    break;
                case "C":
                    quantidadeCoelhos += quantia;
                    break;
            }

            quantidadeTotalCobaias += quantia;

        }

        entradaDeDados.close();

        double percentualCoelhos = (quantidadeCoelhos * 100.00) / quantidadeTotalCobaias;
        double percentualRatos = (quantidadeRatos * 100.00) / quantidadeTotalCobaias;
        double percentualSapos = (quantidadeSapos * 100.00) / quantidadeTotalCobaias;

        System.out.println("Total: " + quantidadeTotalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + quantidadeCoelhos);
        System.out.println("Total de ratos: " + quantidadeRatos);
        System.out.println("Total de sapos: " + quantidadeSapos);
        System.out.println("Percentual de coelhos: " + df.format(percentualCoelhos) + " %");
        System.out.println("Percentual de ratos: " + df.format(percentualRatos) + " %");
        System.out.println("Percentual de sapos: " + df.format(percentualSapos) + " %");

    }

}

