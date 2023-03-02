package devdojo.aulas.estruturascondicionais.CondicionaisIfElse;

import java.util.Scanner;

/*Condicionais aula 7
Recebendo dados do teclado
refazer o exercicios anterior recebendo os dados do teclado:
Eu como usuario gostaria de ter o nome e a idade de participantes de
um torneio de natação e gostaria que o sistema imprimisse da seguinte forma
menor que 10 anos: <nome> participara da categoria infantil
entre 11 e 15 anos <nome> participara da categoria juvenil
entre 16 e 19 anos <nome> participara da categoria pré adulto
acima de 20 anos <nome> participara da categoria adulto
para que eu possa classificar rapidamente todos os participantes
 */
public class ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do atleta: ");
        String nome = input.next();
        System.out.println("Digite a idade do atleta: ");
        int idade = input.nextInt();

        if (idade <= 10){
            System.out.println("O atleta: "+nome+" participará da categoria infantil");
        }else if (idade >= 11 && idade <=15){
            System.out.println("O atleta: "+nome+" participará da categoria juvenil");
        }else if(idade >= 16 && idade <= 19){
            System.out.println("O atleta: "+nome+" participará da categoria pré adulto");
        }else{
            System.out.println("O atleta: "+nome+" participará da categoria adulto");

        }
    }

}
