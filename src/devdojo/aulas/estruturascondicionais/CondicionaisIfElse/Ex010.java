package devdojo.aulas.estruturascondicionais.CondicionaisIfElse;

/*Condicionais Aula 4 - Exercicio
Dado um determinado numero inteiro
Imprima se ele é impar ou par
*/
public class Ex010 {
    public static void main(String[] args) {
        int numero1 = 20;

        if ((numero1 % 2) == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
