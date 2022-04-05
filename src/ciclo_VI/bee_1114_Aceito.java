/*
   Desafio Bee 1114 : Senha Fixa.

   Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta
   informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a
   mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

   Entrada:

   A entrada é composta por vários casos de testes contendo valores inteiros.

   Saída:

   Para cada valor lido mostre a mensagem correspondente à descrição do problema.

   Situação: Aceito.

 */

package ciclo_VI;
import java.util.Scanner;

public class bee_1114_Aceito {
    public static void main (String[] args) {

        Scanner entradaDeDados = new Scanner (System.in);

        int senhaVálida = 2002;
        int senhaFornecida;
        int auxiliar = 0;

        while (auxiliar == 0) {

            senhaFornecida = entradaDeDados.nextInt();

            if (senhaFornecida == senhaVálida) {
                auxiliar = 1;
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }

        }

        entradaDeDados.close();

    }
}
