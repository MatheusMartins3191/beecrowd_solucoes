/*
    Desafio Bee 1045 : Tipos de Triângulos.

    Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior
    dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos,
    sempre escrevendo uma mensagem adequada:

        se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
        se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
        se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
        se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
        se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
        se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

    Entrada:

        A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

    Saída:

        Imprima todas as classificações do triângulo especificado na entrada.

Situação: Aceito.

 */

package ciclo_IV;
import java.util.Scanner;
import java.lang.Math;

public class bee_1045_Aceito {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        double n[] = new double[3];

        double maior = 0.0;

        for (int i = 0; i < 3; i++) {
            n[i] = input.nextDouble();
        }

        for (int i = 0; i < 3; i++) {
            for (int z = i + 1; z < 3; z++) {

                if (n[i] < n[z]) {
                    maior = n[z];
                    n[z] = n[i];
                    n[i] = maior;
                }

            }
        }

        double calc = Math.pow(n[1], 2) + Math.pow(n[2], 2);

        if (n[0] >= n[1] + n[2]) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            if (Math.pow(n[0], 2) == calc) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (Math.pow(n[0], 2) > calc) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (Math.pow(n[0], 2) < calc) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (n[0] == n[1] && n[1] == n[2]) {
                System.out.println("TRIANGULO EQUILATERO");
            }

            if ((n[0] == n[1] && n[1] != n[2]) || (n[0] == n[2] && n[2] != n[1]) || (n[1] == n[2] && n[2] != n[0])) {
                System.out.println("TRIANGULO ISOSCELES");
            }

        }

    }

}
