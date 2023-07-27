package ACADEMY.DEVDOJO.estruturas.condicionais.SWITCHCASE;

/*
COMO GERENTE EU GOSTARIA QUE MEUS USUARIOS PUDESSEM DIGITAR O TIPO DA CONTA
E O SISTEMA IMPRIMA QUAL A PORCENTAGEM DE JUROS QUE AQUELA CONTA IRÁ OFERECER
PARA O CLIENTE COM O INTUITO DE AGILIZAR O ACESSO AS INFORMAÇÕES

OS TIPOS DAS CONTAS SÃO
CONTA_POUPANÇA 0.05%
CONTA_CORRENTE 0.02%
CONTA_INVESTIMENTO 0.1%
 */

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        String conta = "CONTA_POUPANÇA";
        switch (conta) {
            case "CONTA_POUPANÇA":
                System.out.println("0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("CONTA_INVÁLIDA!");
                break;
        }

    }
}
