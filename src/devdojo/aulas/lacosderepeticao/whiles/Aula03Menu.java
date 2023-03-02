package devdojo.aulas.lacosderepeticao.whiles;

import java.util.Scanner;

/*
como usuario eu gostaria de ter um menu visual que seja navegavel atraves de numeros
o menu deve ser exibido da seguinte forma
1. calcular o imposto
2. depositar salario
3. Sair
O menu deve ficar disponivel enquanto eu nao digitar o numero 3.
Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
 */
public class Aula03Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Digite a opção: ");
            System.out.println("1. Calcular o imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            opcao = input.nextInt();
        }
        if (opcao == 3) {
            System.out.println("Finalizando o programa");
        }
    }
}

//*Obs: O exercicio original nao possui o if.


