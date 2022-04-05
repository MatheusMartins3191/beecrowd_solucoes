/*
    Desafio Bee 1098 : Sequencia IJ4.

    Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    Entrada:

    Não há nenhuma entrada neste problema.

    Saída:

    Imprima a sequencia conforme exemplo abaixo.

        I=0 J=1
        I=0 J=2
        I=0 J=3
        I=0.2 J=1.2
        I=0.2 J=2.2
        I=0.2 J=3.2
        .....
        I=2 J=?
        I=2 J=?
        I=2 J=?

    Situação: Aceito.

 */
package ciclo_VI;

public class bee_1098_Aceito {

    public static void main (String[] args) {

        int i = 0;
        int j = 1;
        int valorAnteriorDeJ = 0;
        int valorASomarJ = 0;
        int valorASomarI = 0;
        String valorI;
        String valorJ = "";

        while (i <= 2) {

            valorAnteriorDeJ = j;

            for (int contador = 0; contador < 3; contador++) {

                if (valorASomarI == 0) {
                    valorI = "" + i + "";
                } else {
                    valorI = "" + i + "." + valorASomarI;
                }

                if (valorASomarJ == 0) {
                    valorJ = "" + j + "";
                } else {
                    valorJ = "" + j + "." + valorASomarJ;
                }

                System.out.println("I=" + valorI + " J=" + valorJ);

                j++;

                if (contador == 2) {
                    j = valorAnteriorDeJ;
                }

            }

            if (valorASomarJ < 8) {
                valorASomarJ += 2;
            } else {
                valorASomarJ = 0;
                j += 1;
            }

            if ( valorASomarI < 8) {
                valorASomarI += 2;
            } else {
                valorASomarI = 0;
                i += 1;
            }

            if (i == 2 && valorASomarI == 2) {
                break;
            }

        }

    }

}
