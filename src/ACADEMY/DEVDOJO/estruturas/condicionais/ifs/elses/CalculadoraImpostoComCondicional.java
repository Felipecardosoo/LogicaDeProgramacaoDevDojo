package ACADEMY.DEVDOJO.estruturas.condicionais.ifs.elses;

/*

DADO UM DETERMINADO SALARIO
SE O SALARIO FOR MAIOR QUE 4500 IMPRIMA 30% DO VALOR
SENAO IMPRIMA 15% DO VALOR

 */
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4700.50F;
        if(salario > 4500){
            float trintaPorCento = salario * 0.3F;
            System.out.println("30% = " + trintaPorCento);
        }else {
            float quinzePorCento = salario * 0.15F;
            System.out.println("15% = " + quinzePorCento);
        }
    }

}
