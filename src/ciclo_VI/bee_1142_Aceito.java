/*
   Desafio Bee 1142: PUM.

   Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão apresentadas na
   execução do programa.

   Entrada:

   O arquivo de entrada contém um número inteiro positivo N.

   Saída:

   Imprima a saída conforme o exemplo fornecido.

    1 2 3 PUM
    5 6 7 PUM
    9 10 11 PUM
    13 14 15 PUM
    17 18 19 PUM
    21 22 23 PUM
    25 26 27 PUM

   Situação: Aceito.

 */

package ciclo_VI;

import java.util.Scanner;

public class bee_1142_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int numero = entradaDeDados.nextInt();
        int contador = 0;
        int soma = 0;
        String textoLinha = "";
        String msgPUM = "PUM";

        for(int i = 0; i < numero; i++) {

            while (contador < 4) {
                soma++;
                if (contador == 3) {
                    textoLinha = textoLinha + msgPUM;
                } else {
                    textoLinha = textoLinha  + soma + " ";
                }
                contador++;
            }

            contador = 0;

            System.out.println(textoLinha);
            textoLinha = "";

        }

        entradaDeDados.close();

    }

}
