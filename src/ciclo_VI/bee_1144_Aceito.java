/*
   Desafio Bee 1142: Quadrado e ao Cubo.

   Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão apresentadas na execução do programa,
   seguindo a lógica do exemplo abaixo. Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.

   Entrada:

   O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

   Saída:

   Imprima a saída conforme o exemplo fornecido.

    1 1 1
   1 2 2
    2 4 8
   2 5 9
    3 9 27
   3 10 28
    4 16 64
   4 17 65
    5 25 125
   5 26 126

   Situação: Aceito.

 */

package ciclo_VI;
import java.util.Scanner;

public class bee_1144_Aceito {
    public static void main (String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int numero = entradaDeDados.nextInt();
        int quadrado;
        int cubo;
        int quadradoMaisUm;
        int cuboMaisUm;


        for (int i = 1; i <= numero; i++) {
            quadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);

            System.out.println(i + " " + quadrado + " " + cubo);

            quadradoMaisUm = quadrado + 1;
            cuboMaisUm = cubo + 1;

            System.out.println(i + " " + quadradoMaisUm + " " + cuboMaisUm);

        }

        entradaDeDados.close();

    }

}
