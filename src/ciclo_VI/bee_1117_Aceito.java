/*
   Desafio Bee 1117: Validação de Nota.

   Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral.
   Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota
   deve ser validada separadamente.

   Entrada:

   A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas
   notas válidas.

   Saída:

   Se uma nota inválida for lida, deve ser impressa a mensagem "nota invalida".
   Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor
   deve ser apresentado com duas casas após o ponto decimal.

   Situação: Aceito.

 */

package ciclo_VI;

import java.util.Scanner;
import java.text.DecimalFormat;

public class bee_1117_Aceito {

    public static void main (String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int contador = 0;
        double nota;
        double soma = 0.00;
        double media;
        String mensagem;

        while (contador < 2) {

            nota = entradaDeDados.nextDouble();

            if (nota < 0 || nota > 10) {
                mensagem = "nota invalida";
                System.out.println(mensagem);
            } else {
                soma += nota;
                contador++;
            }

        }

        media = soma / 2;

        System.out.println("media = " + df.format(media));

        entradaDeDados.close();

    }

}
