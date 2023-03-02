package devdojo.aulas.variaveis;

/*
Reutilizando devdojo.aulas.Variáveis:
Crie uma variável que iŕa guardar o valor de um salario
calcule a porcentagem desse salario, os valores são
*30% - *15% - *5%
A cada vez que você calcular guarde o resultado em uma variavel, imprima o resultado
e reutilize a variavel que guarda o resultado para o novo calculo.
 */public class Ex005 {
    public static void main(String[] args) {
        double salario = 4479.00;
        double resultado = (salario * 30/100);
        System.out.println("30% é: "+resultado);
        resultado = (salario * 15/100);
        System.out.println("15% é: " +resultado);
        resultado = (salario * 5/100);
        System.out.println("5% é: " + resultado);


    }
}
