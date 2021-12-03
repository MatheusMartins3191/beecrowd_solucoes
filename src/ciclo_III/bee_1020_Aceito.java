/*
    Desafio Bee 1020: Idade em dias.

    Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

    Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste
    nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com
    objetivo de testar raciocínio matemático simples.

    Entrada:

        O arquivo de entrada contém um valor inteiro.

    Saída:

        Imprima a saída conforme exemplo fornecido.

    Situação: Aceito.

 */

package ciclo_III;
import java.util.Scanner;

public class bee_1020_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        int idade = input.nextInt();

        int anos = idade / 365;
        idade = idade - (anos * 365);

        int meses = idade / 30;
        idade = idade - (meses * 30);

        int dias = idade;

        System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");

    }

}
