/*
   Desafio Bee 1049 : Animal.

   Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da
   esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras
   fornecidas.

    Entrada:

        A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com
    todas as letras minúsculas.

    Saída:

        Imprima o nome do animal correspondente à entrada fornecida.

    Situação: Aceito.

 */

package ciclo_V;
import java.util.Scanner;

public class bee_1049_Aceito {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        String ossos = input.next();
        String tipoAnimal = input.next();
        String alimentacao = input.next();
        String animal = "";

        if (ossos.equals("vertebrado")) {
            if (tipoAnimal.equals("ave")) {
                if (alimentacao.equals("carnivoro")) {
                    animal = "aguia";
                } else if (alimentacao.equals("onivoro")) {
                    animal = "pomba";
                }
            } else if (tipoAnimal.equals("mamifero")) {
                if (alimentacao.equals("onivoro")) {
                    animal = "homem";
                } else if (alimentacao.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (ossos.equals("invertebrado")) {
            if (tipoAnimal.equals("inseto")) {
                if (alimentacao.equals("hematofago")) {
                    animal = "pulga";
                } else if (alimentacao.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (tipoAnimal.equals("anelideo")) {
                if (alimentacao.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (alimentacao.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);

    }

}
