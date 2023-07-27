package ACADEMY.DEVDOJO.estruturas.variaveis;/*
Crie uma variavel que ira guardar o valor de um salario
        calcule a porcentagem desse salario, os valores da porcetagem:
        sera
        *30%
        *15%
        *5%

        A cada vez que voce calcular guarde o resultado em uma variavel
        Imprima o resultado e reutilize a variavel que guarda o resultado para o novo calculo repetindo o processo

 */

 public class ReutilizandoVariaveis {
     public static void main(String[] args) {
        double salario = 5000;
        double resultado = salario * 0.3;
         System.out.println("30% é: " + resultado);
         resultado = salario * 0.15;
         System.out.println("15% é: " + resultado);
         resultado = salario * 0.05;
         System.out.println("5% é: " + resultado);

    }
}
