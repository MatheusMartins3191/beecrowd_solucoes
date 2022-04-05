/*
   Desafio Bee 1134: Tipo de combustível.

   Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um
   algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
   4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código
   (até que seja válido). O programa será encerrado quando o código informado for o número 4.

   Entrada:

   A entrada contém apenas valores inteiros e positivos.

   Saída:

   Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível,
   conforme exemplo.

   Situação: Aceito.

 */

package ciclo_VI;
import java.util.Scanner;

public class bee_1134_Aceito {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        int tipoInformadoDeCombustível;
        int controlador = 1;
        int totalGasolina = 0;
        int totalAlcool = 0;
        int totalDiesel = 0;

        while (controlador == 1) {

            tipoInformadoDeCombustível = entradaDeDados.nextInt();

            if (tipoInformadoDeCombustível < 1 || tipoInformadoDeCombustível > 4) {
                continue;
            }

            if (tipoInformadoDeCombustível == 1) {
                totalAlcool++;
            } else if (tipoInformadoDeCombustível == 2) {
                totalGasolina++;
            } else if (tipoInformadoDeCombustível == 3) {
                totalDiesel++;
            }

            if (tipoInformadoDeCombustível == 4) {
                controlador = 0;
            }

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + totalAlcool);
        System.out.println("Gasolina: " + totalGasolina);
        System.out.println("Diesel: " + totalDiesel);

        entradaDeDados.close();

    }

}
