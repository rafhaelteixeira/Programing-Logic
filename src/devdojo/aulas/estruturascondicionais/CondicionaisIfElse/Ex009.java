package devdojo.aulas.estruturascondicionais.CondicionaisIfElse;

/*Condicionais Aula 3 - Exercicio
  Dado um determinado salario
  se o salario for maior que 4500 imprima 30% do valor
  senao imprima 15% do valor
  desafio 1: Utilize apenas uma variavel para guardar o resultado e imprimir no final
  desafio 2: Diga na impressao se é 30% ou 10%
 */
public class Ex009 {
    public static void main(String[] args) {
        double salario = 5000.00;
        double porcentagem1 = salario * 30 / 100;
        double porcentagem2 = salario * 15 / 100;

        if (salario > 4500.00) {
            /*variaveis tem escopo e se usadas dentro de um if
             * nao podem ser usadas dentro de um else, tendo que
             * ser declaradas novamente
             * Ex: float trintaPorcento = salario * 0,3
             *     System.out.println("A porcentagem é: " + trintaPorcento)*/
            System.out.println("a porcentagem é: " + porcentagem1);
        } else {
            /*ex: float quinzePorcento = salario * 0.15
                  System.out.println("A porcentagem é: " + quinzePorcento)
             *Declarando as variaveis fora do if e do else, elas podem ser usadas
              dentro do escopo*/
            System.out.println("a porcentagem é: " + porcentagem2);
        }
    }
}
/*
Pode também criar variáveis dentro do if e do else
lembrando que as variaveis criadas dentro de um escopo
nao sao reconhecidas por outro escopo.
public class Desafio1{

public static void main(String[] args) {
	float salario = 4570F;

	if (salario >4500) {
		float resultado = salario * 30/100;
		System.out.println("A porcentagem é: " + resultado);
	}else{
		float resultado = salario * 15/100;
		System.out.println("A porcentagem é: " + resultado);
	}
}
}
 */
/*
Desafio 1: Utilize uma variavel para guardar o resultado e imprimir no fina
Compilado e funcionando
public class Desafio1{

public static void main(String[] args) {
	float salario = 4570F;
	float resultado = 0;

	if (salario >4500) {
		resultado = salario * 30/100;
		System.out.println("A porcentagem é: " + resultado);
	}else{
		resultado = salario * 15/100;
		System.out.println("A porcentagem é: " + resultado);
	}
  }
}
 */
/* Desafio 2
public class Desafio2{

public static void main(String[] args) {
	float salario = 7845;
	float resultado = 0;
    String porcentagem = "";

	if (salario >4500) {
		resultado = salario * 30/100;
		System.out.println("O valor final em porcentagem de: "+porcentagem +" é de: "+resultado);
	}else{
		resultado = salario * 15/100;
		System.out.println("O valor final em porcentagem de: "+porcentagem +" é de: "+resultado);
	}
}
}*/
