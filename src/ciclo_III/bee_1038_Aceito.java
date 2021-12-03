/*
    Desafio Bee 1038: Lanche.

    Com base na tabela do desafio, escreva um programa que leia o código de um item e a quantidade deste item.
    A seguir, calcule e mostre o valor da conta a pagar.

    Entrada:

        O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme
    tabela.

    Saída:

        O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto
    decimal.

    Situação: Aceito.

 */

package ciclo_III;
import java.util.Scanner;

public class bee_1038_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codigo = input.nextInt();
        int quantidade = input.nextInt();
        double valorUnidade = 0;

        switch (codigo){
            case 1:
                valorUnidade = 4.00;
                break;
            case 2:
                valorUnidade = 4.50;
                break;
            case 3:
                valorUnidade = 5.00;
                break;
            case 4:
                valorUnidade = 2.00;
                break;
            case 5:
                valorUnidade = 1.50;
                break;
        }

        double valorTotal = quantidade * valorUnidade;

        System.out.printf("Total: R$ %.2f\n", valorTotal);

    }

}
