package ACADEMY.DEVDOJO.estruturas.condicionais.ifs.elses;

/*

COMO SECRETARIO DE ALISTAMENTO MILITAR EU GOSTARIA QUE MEU SISTEMA ACEITASSE OOS SEGUINTES PARAMETROS
PARA QUE EU POSSA AGILIZAR O PROCESSO DE CADASTRAMENTO:
SEXO, SENDO VALIDO APENAS M OU F E IDADE.

SE O SEXO FOR MASCULINO E A IDADE FOR MAIOR OU IGUAL A 18 O SISTEMA DEVE IMPRIMIR "ALISTAMENTO OBRIGATORIO"
SE O SEXO FOR MASCULINO E A IDADE FOR MENOR QUE 18 O SISTEMA DEVE IMPRIMIR "ALISTAMENTO Ñ PERMITIDO"
SE O SEXO FOR FEMININO A IDADE FOR MAIOR OU IGUAL A 18 O SISTEMA DEVE PERGUNTAR SE A PESSOA DESEJA SE ALISTAR
SE O SEXO FOR FEMININO E A IDADE FOR MENOR QUE 18 O SISTEMA DEVE IMPRIMIR ALISTAMENTO Ñ PERMITIDO

 */
public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 17;
        if ((sexo == 'M' || sexo == 'F') && (idade < 18)) {
            System.out.println("Alistamento não Permitido");
        } else if ((sexo == 'M') && (idade >= 18)){
            System.out.println("Alistamento Obrigátorio");
        }else if((sexo == 'F') && (idade >= 18)){
            System.out.println("Deseja se Alistar?");
        }
    }
}
