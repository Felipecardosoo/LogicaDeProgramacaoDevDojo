package ACADEMY.DEVDOJO.estruturas.condicionais.ifs.elses;

/*

DADO UM DETERMINADO SALARIO
SE O SALARIO FOR MAIOR QUE 4500 IMPRIMA 30% DO VALOR
SENAO IMPRIMA 15% DO VALOR
DESAFIO: UTILIZE APENAS UMA VARIAVEL PARA GUARDAR O RESULTADO E IMPRIMIR NO FINAL

 */
public class CalculadoraImpostoComCondicionalDesafio {
    public static void main(String[] args) {
        float salario = 4700.50F;
        float resultado = 0F;
        if(salario > 4500){
            resultado = salario * 0.3F;
        } else {
            resultado = salario * 0.15F;
        }
        System.out.println("O valor final é: " + resultado);
    }
}
