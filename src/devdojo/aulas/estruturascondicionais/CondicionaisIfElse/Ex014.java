package devdojo.aulas.estruturascondicionais.CondicionaisIfElse;

import java.util.Scanner;

/*Condicionais aula 8* - OR (||)
exercicio
Eu, como administrador do sistema, gostaria de permitir que os proprios
usuarios cadastrassem o nome de usuario(login) para agilizar o processo de migração
do sistema antigo para o novo.
O usuario nao pode deixar vazio "", ou criar um usuario com login "admin" ou "administrador"
Se o valor for valido, o sistema devera exibir uma mensagem com <nome de usuario> cadastrado com sucesso
Senão o sistema deverá mostrar o erro "usuario invalido"
 */
public class Ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastre seu login: ");
        String login = input.next();
/*O operador == não funciona para strings no java, apenas para os tipos primitivos
  Atribuir a variavel (login) a equals.("nome a ser validado")
  Caso seja necessario ignorar a formatação das letras utilizar equalsIgnoreCase*/
        if (login.equals("") || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")) {
            System.out.println(login + " Login invalido");
        } else {
            System.out.println(login + " Cadastrado com sucesso");
        }
    }
}
