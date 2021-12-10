/*
    Desafio Bee 1043 : Triângulo.

    Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o
    perímetro do triângulo e apresente a mensagem:

    Perimetro = XX.X

    Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

    Area = XX.X

    Entrada:

        A entrada contém três valores reais.

    Saída:

        O resultado deve ser apresentado com uma casa decimal.

    Situação: Aceito.

 */

package ciclo_IV;
import java.util.Scanner;

public class bee_1043_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            double area = (a + b) * c / 2;
            System.out.printf("Area = %.1f\n", area);
        }

    }

}
