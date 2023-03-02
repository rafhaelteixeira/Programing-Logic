package devdojo.aulas.estruturascondicionais.CondicionaisIfElse;

/*Condicionais aula 6
Eu como usuario gostaria de ter o nome e a idade de participantes de
um torneio de natação e gostaria que o sistema imprimisse da seguinte forma
menor que 10 anos: <nome> participara da categoria infantil
entre 11 e 15 anos <nome> participara da categoria juvenil
entre 16 e 19 anos <nome> participara da categoria pré adulto
acima de 20 anos <nome> participara da categoria adulto
para que eu possa classificar rapidamente todos os participantes
Leitura complementar:
processo de desenvolvimento de software
metodologias ágeis (SCRUM - KANBAN) */
public class ex012 {
    public static void main(String[] args) {
        String nome = "rafhael";
        int idade = 16;

        if (idade <= 10) {
            System.out.println(nome + " Participará na categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Participará na categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participará na categoria Pré-adulto");
        } else {
            System.out.println(nome + " Participará na categoria adulto");
        }
    }
}
