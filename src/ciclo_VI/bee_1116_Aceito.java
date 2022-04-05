/*
    Desafio Bee 1116: Dividindo X por Y.

    Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for
    possível mostre a mensagem “divisao impossivel” para os valores em questão.

    Entrada:

    A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos
    em seguida.

    Saída:

    Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não
    seja possível efetuar o cálculo.

    Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)

    Situação: Aceito.

 */

package ciclo_VI;

import java.util.Scanner;

public class bee_1116_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int numA;
        int numB;
        double resultDivisao;

        int quantNumeros = entradaDeDados.nextInt();

        for (int i = 0; i < quantNumeros; i++) {

            numA = entradaDeDados.nextInt();
            numB = entradaDeDados.nextInt();

            if (numB == 0) {
                System.out.println("divisao impossivel");
            } else {
                resultDivisao = (double) numA / numB;
                System.out.println(resultDivisao);
            }

        }

        entradaDeDados.close();

    }

}
