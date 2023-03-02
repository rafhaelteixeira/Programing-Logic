package devdojo.aulas.estruturascondicionais.CondicionaisIfElse;

/*
Condicionais Aula 2 - Exercicio
Receba uma idade como entrada
Se idade for maior que 18 imprima "Adulto"
Senão imprima "Ainda nao é adulto"
 */
public class Ex008 {
    public static void main(String[] args) {
        int idade = 18;
        //==, !=, >, >=, <, <=
        if (idade > 18) {
            System.out.println("Já é Adulto");
        } else {
            System.out.println("Ainda não é adulto");
        }

    }
}
