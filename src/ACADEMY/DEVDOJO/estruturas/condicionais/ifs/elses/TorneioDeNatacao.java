package ACADEMY.DEVDOJO.estruturas.condicionais.ifs.elses;/*
EU COMO USUARIO GOSTARIA DE TER O NOME E A IDADE DE PARTICIPANTES DE
UM TORNEIO DE NATACAO E QUE O SISTEMA IMPRIMISSE DA SEGUINTE FORMA
- MENOR QUE 10 ANOS:  <NOME> PARTICIPARA DA CATEGORIA INFANTIL
- ENTRE 11 E 15 ANOS: <NOME> PARTICIPARA DA CATEGORIA JUVENIL
- ENTRE 16 E 19 ANOS: <NOME> PARTICIPARA DA CATEGORIA PRÉ-ADULTO
- ACIMA DE 20 ANOS:   <NOME> PARTICIPARA DA CATEGORIA ADULTO

PARA QUE EU POSSA RAPIDAMENTE CLASSIFICAR TODOS OS PARTICIPANTES

LEITURA COMPLEMENTAR -> PROCESSOS DE DESENVOLVIMENTO DE SOFTWARE, METODOLOGIAS AGEIS, SCRUM

*/

public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Luffy";
        int idade = 19;
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
