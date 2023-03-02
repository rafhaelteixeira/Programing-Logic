package devdojo.aulas.arrays.multidimensional;

//Multiplicação da diagonal perfeita de uma matriz quadrada.
public class Aula03ExercicioArrayMulti {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[3][3];
        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 32;
        arrayMulti[0][2] = 54;
        arrayMulti[1][0] = 50;
        arrayMulti[1][1] = 12;
        arrayMulti[1][2] = 69;
        arrayMulti[2][0] = 2;
        arrayMulti[2][1] = 5;
        arrayMulti[2][2] = 21;
        int resultado = 1;

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                if (i == j) {
                    resultado = resultado * arrayMulti[i][j];
                }
            }
        }
        System.out.println(resultado);

    }
}
