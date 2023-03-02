package devdojo.aulas.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite Um número");
        int numero = input.nextInt();
        int i = 0;

        while (i <= numero){
            if (i % 2 != 0){
                System.out.println("A sequencia é: " + i);
            }
            i = i+1;
        }
    }
}
/*
//Outra maneira de fazer, começando do 1

import java.util.Scanner;

public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        System.out.println("Digite um Valor: ");
        int n = input.nextInt();

        while (number <= n) {
            System.out.println("A sequencia de impares é: " + number);
            number = number + 2;

        }
    }
}

 */





