/*
    Desafio Bee 1019: Conversão de Tempo.

    Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o
    expresso no formato horas:minutos:segundos.

    Entrada:

        O arquivo de entrada contém um valor inteiro N.

    Saída:

        Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo
    fornecido.

    Situação: Aceito.

 */


package ciclo_III;
import java.util.Scanner;

public class bee_1019_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        int tempo = input.nextInt();

        //1min - 60s
        //1hr - 60min - 60*60s

        int horas = tempo / 3600;
        tempo = tempo - (horas * 3600);

        int min = tempo / 60;
        tempo = tempo - (min * 60);

        int seg = tempo;

        System.out.println(horas + ":" + min + ":" + seg);


    }

}
