package devdojo.aulas.variaveis;

/*
Cálculo de Imposto:
Crie uma classe que calcule uma determinada porcentagem de um dado salario
*Criar uma classe
*Aceitar um valor de entrada para o salario
*Definir o valor da porcentagem (perguntar quanto)
*Calcular a porcentagem
 */
public class Ex004 {
    public static void main(String[] args) {
        float salario = 2500.00F;
        float porcentagem = 30F;
        float porcentagemDoSalario = salario * (porcentagem / 100);
        System.out.println("A porcentagem do seu salário é: " + porcentagemDoSalario);


    }
}