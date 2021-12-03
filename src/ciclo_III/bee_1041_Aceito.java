/*
    Desafio Bee 1041: Coordenadas de um ponto.

    Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir,
    determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
    (x = y = 0).

    Se o ponto estiver na origem, escreva a mensagem “Origem”.

    Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

    Entrada:

        A entrada contem as coordenadas de um ponto.

    Saída:

        A saída deve apresentar o quadrante em que o ponto se encontra.

    Situação: Aceito.

 */

package ciclo_III;
import java.util.Scanner;

public class bee_1041_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        double x = input.nextDouble();
        double y = input.nextDouble();

        String msg = "";

        if ( (x == 0) && (y == 0)) {
            msg = "Origem";
        } else if ((x < 0 || x > 0) && (y == 0)) {
            msg = "Eixo X";
        } else if ((x == 0) && (y < 0 || y > 0)) {
            msg = "Eixo Y";
        } else if (x > 0 && y > 0) {
            msg = "Q1";
        } else if (x < 0 && y > 0) {
            msg = "Q2";
        } else if (x < 0 && y < 0) {
            msg = "Q3";
        } else {
            msg = "Q4";
        }

        System.out.println(msg);

    }

}
