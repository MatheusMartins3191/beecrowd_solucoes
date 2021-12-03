/*
    Desafio Bee 1035: Teste de Seleção 1.

    Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com
    D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem
    "Valores aceitos", senão escrever "Valores nao aceitos".

    Entrada:

        Quatro números inteiros A, B, C e D.

    Saída:

        Mostre a respectiva mensagem após a validação dos valores.

    Situação: Aceito.

 */

package ciclo_III;
import java.util.Scanner;

public class bee_1035_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        String msg = "Valores nao aceitos";

        if ((b > c) && (d > a)) {
            if ((c + d) > (a + b)) {
                if ((c > 0) && (d > 0)) {
                    if (a % 2 == 0) {
                        msg = "Valores aceitos";
                    }
                }
            }
        }

        System.out.println(msg);

    }

}
