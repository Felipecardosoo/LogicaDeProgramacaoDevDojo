package ACADEMY.DEVDOJO.estruturas.condicionais.ifs.elses;/*
RECEBA UMA IDADE COMO ENTRADA
SE IDADE FOR MAIOR QUE 18 IMPRIMA "ADULTO"
SENÃO IMPRIMA "AINDA NÃO É ADULTO"

// == , != , > , >= , < , <=

*/

public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 15;

        if (idade > 18) {
            System.out.println("Adulto");
        }
        else{
            System.out.println("Ainda Não é Adulto");
        }
    }
}
