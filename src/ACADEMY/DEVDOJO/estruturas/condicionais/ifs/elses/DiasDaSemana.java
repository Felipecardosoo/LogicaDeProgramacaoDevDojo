package ACADEMY.DEVDOJO.estruturas.condicionais.ifs.elses;

//RECEBA UM NUMERO INTEIRO DO USUARIO E IMPRIMA O DIA DA SEMANA CORRESPONDENTE
//SENDO 1 SEGUNDA-FEIRA
//SENDO 2 TERÇA-FEIRA E ASSIM POR DIANTE..


import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int dia = input.nextInt();
        if (dia == 1) {
            System.out.println("Segunda-feira");
        } else if (dia == 2) {
            System.out.println("Terça-feira");
        } else if (dia == 3) {
            System.out.println("Quarta-feira");
        } else if (dia == 4) {
            System.out.println("Quinta-feira");
        } else if (dia == 5) {
            System.out.println("Sexta-feira");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Dia inválido!");
        }
    }
}
