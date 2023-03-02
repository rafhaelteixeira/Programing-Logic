package devdojo.aulas.lacosderepeticao.whiles;

/*
Aprensentar ao usuário uma tela solicitando um login e depois uma senha, o usuario e a
senha corretos devem estar armazenados em constantes em seu programa.
Se o usuario acertar o login e senha, Exibir a mensagem:
 ACESSO CONCEDIDO. caso contrario exibir a mensagem:
 ACESSO NEGADO e voltar a pedir o usuario e senha, e
 ssa condição deve se repetir até que o usuário acerte a condição
 */
import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String login = "";
        String senha = "";

        while (login != ("Administrador") && senha != ("ADMIN")){
            System.out.println("Digite seu login: ");
            login = input.next();
            System.out.println("Digite sua Senha: ");
            senha = input.next();

            if (login.equals("Administrador") && senha.equals("ADMIN")){
                System.out.println("ACESSO PERMITIDO");
                System.out.println("PROGRAMA TERMINADO");
                break;
            }else {
                System.out.println("ACESSO NEGADO");
            }
        }
    }
}
//**Atenção: Refazer amanhã.......
//Refaça.....
/*
Outra Maneira de Fazer

public class testes {
    public static void main(String[] args) {
    //variavel final = Constante
       final String login = "Luffy";
       final String password = "ReiDosPiratas";
       boolean exibirTela = true;
       Scanner input = new Scanner(System.in);

       while(exibirTela){
           System.out.println("Digite seu Login");
           String loginDig = input.next();
           System.out.println("Digite sua senha");
           String passDig = input.next();
           if (login.equals(loginDig) && password.equals(passDig)){
               System.out.println("ACESSO CONCEDIDO");
               exibirTela = false;
           }else {
               System.out.println("ACESSO NEGADO");
           }
       }

    }
}
 */
