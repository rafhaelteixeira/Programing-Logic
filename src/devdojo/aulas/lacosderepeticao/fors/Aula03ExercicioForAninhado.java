package devdojo.aulas.lacosderepeticao.fors;

public class Aula03ExercicioForAninhado {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Fazendo tabuada do numero: "+i);
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " X " + j + " = " + (i*j));
                
            }
            
        }
    }
}
