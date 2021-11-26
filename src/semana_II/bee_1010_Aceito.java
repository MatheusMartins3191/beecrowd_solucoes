/*
    Desafio Bee 1010 : Cálculo Simples!

    Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código
    de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

    Entrada:

    O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e
    um valor com 2 casas decimais.

    Saída:

    A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois
    pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

    Situação: Aceito.

 */

package semana_II;

import java.util.Scanner;

public class bee_1010_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        int cont = 0;

        double valorTotal = 0.0;

        while (cont < 2) {

            int codPeca = input.nextInt();
            int quantPecas = input.nextInt();
            double valorPeca = input.nextFloat();

            valorTotal += valorPeca * quantPecas;

            cont++;

        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

    }

}
