package ACADEMY.DEVDOJO.estruturas.lacosderepeticao.whiles;

import java.util.Scanner;

/*
EU GOSTARIA DE IMPRIMIR TODOS OS NUMEROS IMPARES DE 0 ATE VALOR DIGITADO PELO USUARIO

---> "%" operador de módulo (ou resto da divisão)
___> "!=" diferente

 */
public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valorFinal = teclado.nextInt();
        int i = 0;
        while (i <= valorFinal) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
            i = i + 1;
        }

    }
}
