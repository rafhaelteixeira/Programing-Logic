package devdojo.aulas.estruturascondicionais.CondicionaisIfElse;

import java.util.Scanner;

/*condicionais aula 10
 * Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parametros
 * para que eu possa agilizar o processo de cadastramento
 * Sexo, sendo valido apenas M ou F e idade
 * Se o sexo for masculino e a idade for maior ou igual a 18, o sistema deve imprimir: alistamento obrigatorio
 * Se o sexo for masculino e a idade for menor que18, o sistema deve imprimir: alistamento nao permitido
 *Se o sexo for feminino e a idade for maior ou igual a 18, o sistema deve perguntar se a pessoa deseja se alistar
 *Se o sexo for feminino e a idade for menor que 18, o sistema deve imprimir: alistamento nao permitido*/
public class ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu sexo? ");
        String sexo = input.next();
        System.out.println("Qual a sua idade? ");
        int idade = input.nextInt();

        if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("Alistamento Obrigatorio");
        } else if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("Você deseja se alistar?");
            String resposta = input.next();
            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Você agora faz parte do exercito brasileiro");
            } else {
                System.out.println("Que pena, precisamos de mulheres no exercito.");
            }
        }
    }
}
