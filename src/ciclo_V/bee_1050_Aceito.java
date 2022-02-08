/*
   Desafio Bee 1050 : DDD.

   Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o
   DDD pertence, considerando tabela:

    Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:

    DDD nao cadastrado

    Entrada:

        A entrada consiste de um único valor inteiro.

    Saída:

        Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir
    DDD correspondente ao número digitado.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1050_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ddd = input.nextInt();
        String msg = "";

        switch (ddd) {
            case 61:
                msg = "Brasilia";
                break;
            case 71:
                msg = "Salvador";
                break;
            case 11:
                msg = "Sao Paulo";
                break;
            case 21:
                msg = "Rio de Janeiro";
                break;
            case 32:
                msg = "Juiz de Fora";
                break;
            case 19:
                msg = "Campinas";
                break;
            case 27:
                msg = "Vitoria";
                break;
            case 31:
                msg = "Belo Horizonte";
                break;
            default:
                msg = "DDD nao cadastrado";
                break;
        }

        System.out.println(msg);

    }

}
