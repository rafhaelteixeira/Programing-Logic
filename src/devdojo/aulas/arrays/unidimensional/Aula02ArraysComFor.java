package devdojo.aulas.arrays.unidimensional;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i+1) + ":");
            notas[i] = input.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }
        media = media/ notas.length;
        System.out.println("Media das notas: " + media);
    }
}