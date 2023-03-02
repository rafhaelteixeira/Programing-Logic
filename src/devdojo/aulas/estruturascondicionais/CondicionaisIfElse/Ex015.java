package devdojo.aulas.estruturascondicionais.CondicionaisIfElse;

import java.util.Scanner;

//receba um numero inteiro do usuario e imprima o dia da semana correspondente
public class Ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro de 1 a 7");
        int numero = input.nextInt();

        if (numero == 1) {
            System.out.println("Segunda-feira");
        } else if (numero == 2) {
            System.out.println("Terca-feira");
        } else if (numero == 3) {
            System.out.println("quarta feira");
        } else if (numero == 4) {
            System.out.println("Quinta-feira");
        } else if (numero == 5) {
            System.out.println("Sexta feira");
        } else if (numero == 6) {
            System.out.println("Sábado");
        } else if (numero == 7) {
            System.out.println("Domingo");
        }else {
            System.out.println("dia invalido");
        }
    }
}
