package devdojo.aulas.arrays.unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArraysMelhorado {
    public static void main (String[] args){
        int [] array1 = new int[3];
        int [] array2 = new int[3];
        int [] array3 = new int[3];
        Scanner input = new Scanner(System.in);
        String resultado = "";

        for (int i = 0; i < array1.length ; i++) {
            System.out.println("Vetor 1, Posição: " + i);
            array1[i] = input.nextInt();
            System.out.println("Vetor 2, Posição: " + i);
            array2[i] = input.nextInt();
            array3[i] = array1[i] * array2[i];
            resultado = resultado + array3[i] + " ";
        }
        System.out.println(resultado);
    }
}
