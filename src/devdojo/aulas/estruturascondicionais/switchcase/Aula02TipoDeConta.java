package devdojo.aulas.estruturascondicionais.switchcase;

import java.util.Scanner;

/*Como gerente eu gostaria que meus usuarios pudessem digitar o tipo de conta
e o sistema imprima qual a porcentagem de juros que aquela conta vai oferecer
para o cliente, para agilizar o acesso as informações
CONTA-POUPANCA 0.05%
CONTA-CORRENTE 0.02%
CONTA-INVESTIMENTO 0.1%*/
public class Aula02TipoDeConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tipo de conta, poupanca:1, corrente:2, investimento:3");
        String tipoDeConta = input.next();

        switch (tipoDeConta){
            case "poupanca":
                System.out.println("Rendimento da conta 0.05%");
                break;
            case "corrente":
                System.out.println("Rendimento da conta 0.02%");
                break;
            case "investimento":
                System.out.println("Rendimento da conta 0.1%");
                break;
            default:
                System.out.println("Conta inválida");

        }


    }
}
