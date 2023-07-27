package ACADEMY.DEVDOJO.estruturas.condicionais.ifs.elses;

import java.util.Scanner;

public class TorneioDeNatacao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        System.out.println("Digite o seu idade: ");
        int idade = input.nextInt();
        if (idade <= 10) {
            System.out.println(nome + " Participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participará da categoria Pré-Adulto");
        } else {
            System.out.println(nome + " Participará da categoria Adulto");
        }
    }
}

