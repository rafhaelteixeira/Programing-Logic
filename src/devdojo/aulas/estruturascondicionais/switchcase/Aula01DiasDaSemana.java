package devdojo.aulas.estruturascondicionais.switchcase;
//Exercício anterior utilizando o switch.

import java.util.Scanner;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7");
        int dia = input.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sabadão");
                break;
            case 7:
                System.out.println("Domingão");
                break;
            default:
                System.out.println("Dia inválido");
        }//nao necessita fazer um if no final, usar o default.

    }
}
