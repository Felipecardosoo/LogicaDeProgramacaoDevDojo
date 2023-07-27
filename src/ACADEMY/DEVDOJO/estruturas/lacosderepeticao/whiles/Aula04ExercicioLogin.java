package ACADEMY.DEVDOJO.estruturas.lacosderepeticao.whiles;

import java.util.Scanner;

/*
APRESENTAR AO USUARIO UMA TELA SOLICITANDO UM LOGIN E DEPOIS UMA SENHA O USUARIO E SENHA CORRETOS
DEVEM ESTAR ARMAZENADOS EM CONSTANTES NO SEU PROGRAMA. SE O USUARIO ACERTAR O USUARIO E A SENHA EXIBIR A
MENSAGEM ''ACESSO CONCEDIDO'', CASO CONTRARIO EXIBIR ''ACESSO NEGADO'' E VOLTAR A PEDIR USUARIO E SENHA
ESSA CONDICAO DEVE SE REPETIR ATE QUE O USUARIO ACERTE A COMBINACAO.

"final" depois de colocar final vc nao pode mais alterar

 */
public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Luffy"; //como se estivesse em um banco de dados
        final String password = "ReiDosPiratas"; //como se estivesse em um banco de dados
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite seu login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passowordDigitado = scanner.nextLine();
            if (login.equals(loginDigitado) && password.equals(passowordDigitado)) {
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
            System.out.println("ACESSO NEGADO");

        }
        System.out.println("PROGRAMA TERMINADO");
    }
}
