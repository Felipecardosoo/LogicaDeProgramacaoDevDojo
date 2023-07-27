package ACADEMY.DEVDOJO.estruturas.variaveis;

/*
*Crie uma classe que calcula uma determinada porcentagem de um dado salário
*Crie umma classe
*Aceitar um valor de entrada para o salário
*Definir o valor da porcentagem (perguntar o valor da porcentagem)
*Calcular a porcentagem
*
*/
public class CalculadoraImposto {
    public static void main(String[] args) {
        float salario = 2500.00F;
        float porcentagem = 30;
        float porcentagemDoSalario = salario * (porcentagem / 100);
        System.out.println(porcentagemDoSalario);
    }
}
