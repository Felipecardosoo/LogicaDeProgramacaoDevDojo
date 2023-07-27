package ACADEMY.DEVDOJO.estruturas.condicionais.ifs.elses;

import java.util.Scanner;

/*

DESAFIO:

EU, COMO ADM DO SISTEMA, GOSTARIA DE PERMITIR QUE OS PROPRIOS USUARIOS
CADASTRASSEM O NOME DE USUARIO (LOGIN) NO SISTEMA PARA AGILIZAR O PROCESSO
DE MIGRAÇÃO DO SISTEMA ANTIGO PARA O NOVO.

O USUARIO NAO PODE DEIXAR O LOGIN VAZIO "", OU CRIAR UM USUARIO COM O LOGIN "ADMIN" OU "ADMINISTRADOR"
SE O VALOR ENTRADO FOR VALIDO, O SISTEMA DEVERA EXIBIR UMA MENSAGEM "<NOME DO USUARIO> CADASTRADO COM SUCESSO"
SENAO O SISTEMA DEVERA MOSTRAR O ERRO "USUARIO INVALIDO"

 */
/// *SOMENTE PARA STRING USAMOS .EQUALS PARA (IGUAL)COMPARAÇÃO* \\\

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        if(nome.equalsIgnoreCase("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuário Inválido");
        }else {
            System.out.println(nome + " foi cadastrado com sucesso!");
        }

    }
}
