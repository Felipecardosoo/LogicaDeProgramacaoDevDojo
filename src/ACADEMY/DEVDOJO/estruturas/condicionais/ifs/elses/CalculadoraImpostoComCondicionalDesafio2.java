package ACADEMY.DEVDOJO.estruturas.condicionais.ifs.elses;

/*

DADO UM DETERMINADO SALARIO
SE O SALARIO FOR MAIOR QUE 4500 IMPRIMA 30% DO VALOR
SENAO IMPRIMA 15% DO VALOR
DESAFIO: UTILIZE APENAS UMA VARIAVEL PARA GUARDAR O RESULTADO E IMPRIMIR NO FINAL
DESAFIO 2: DIGA NA IMPRESSAO SE É 30% OU 15%

 */
public class CalculadoraImpostoComCondicionalDesafio2 {
    public static void main(String[] args) {
        float salario = 4700.50F;
        float resultado = 0F;
        String porcentagem = "";
        if(salario > 4500){
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("O valor final em porcentagem de " +porcentagem+ " é de " +resultado);

    }
}
