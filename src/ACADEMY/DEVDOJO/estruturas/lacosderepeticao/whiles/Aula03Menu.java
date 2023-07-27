package ACADEMY.DEVDOJO.estruturas.lacosderepeticao.whiles;
/*

COMO USUARIO EU GOSTARIA DE TER UM MENU VISUAL QUE SEJA NAVEGAVEL ATRAVES DE NUMEROS
O MENU DEVE SER EXIBIDO DA SEGUINTE FORMA

1-CALCULAR IMPOSTO
2-DEPOSITAR SALARIO
3-SAIR

O MENU DEVE FICAR DISPONIVEL ENQUANTO EU NAO DIGITAR O NUMERO 3
DESSA FORMA O SISTEMA FICARA EM EXECUCAO EVITANDO TER QUE SER REINCIADO A CADA OPERACAO

 */

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        while(opcao != 3){
            System.out.println("1-CALCULAR IMPOSTO");
            System.out.println("2-DEPOSITAR SALARIO");
            System.out.println("3-SAIR");
            System.out.println("Digite uma opção");
            opcao = teclado.nextInt();
        }
        System.out.println("Programa encerrado!");
    }
}
