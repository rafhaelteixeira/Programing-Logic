package devdojo.aulas.arrays.unidimensional;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 7.5;
        double nota3 = 7.5;
        double nota4 = 7.5;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
        //O mesmo resultado utilizando o array.
        double[] notas = new double[4];
        System.out.println("-----------------------");
        notas[0] = 7.5;
        notas[1] = 8;
        notas[2] = 9.5;
        notas[3] = 5;
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
        //Podemos atingir o mesmo resultado acima com um simples for.
        System.out.println("------------------------------");
        System.out.println("O tamanho do array " + notas.length);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);

        }


    }
}
