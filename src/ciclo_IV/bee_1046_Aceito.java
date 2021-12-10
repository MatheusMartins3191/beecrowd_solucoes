/*
    Desafio Bee 1046 : Tempo de Jogo.

    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar
    em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

    Entrada:

        A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

    Saída:

        Apresente a duração do jogo conforme exemplo abaixo.

    Situação: Aceito.

 */

package ciclo_IV;
import java.util.Scanner;

public class bee_1046_Aceito {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        int hrInicial = input.nextInt();
        int hrFinal = input.nextInt();
        int tempoDuracao = 0;

        if (hrInicial == hrFinal) {
            tempoDuracao = 24;
            System.out.println("O JOGO DUROU " + tempoDuracao + " HORA(S)");
        } else if (hrInicial < hrFinal) {
            tempoDuracao = hrFinal - hrInicial;
            System.out.println("O JOGO DUROU " + tempoDuracao + " HORA(S)");
        } else if (hrInicial > hrFinal) {
            tempoDuracao = (24 - hrInicial) + hrFinal;
            System.out.println("O JOGO DUROU " + tempoDuracao + " HORA(S)");
        }

    }

}
