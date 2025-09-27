/*
 *1. Implemente um programa que receba o nome do aluno(valor1), a data da atividade(data) e 02 valores inteiros (valor3). Uma variável armazena caracteres e outra variável armazena data. Na variável valor4, troque os valores que estão armazenados nas variáveis valor3 e valor1. No final, imprima na tela a informação das variáveis valor1, valor3, data e valor4.
 *
 *Saída do programa Exemplo do resultado
 *
 *NOME DO ALUNO(A):
 *DATA DA ATIVIDADE:
 *VALOR DA VARIAVEL  VALOR1:
 *VALOR DA VARIAVEL  VALOR2:
 *VALOR DA VARIAVEL  VALOR3:
 *VALOR DA TROCA DA VARIAVEL VALOR3  PELO VALOR1  E IGUAL:
 */

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String valor1 = scanner.nextLine();

        LocalDate data = LocalDate.now();

        System.out.println("Digite um número inteiro:");
        String valor2 = scanner.nextLine();

        System.out.println("Digite um número inteiro:");
        String valor3 = scanner.nextLine();



        System.out.println("NOME DO ALUNO(A): " + valor1);
        System.out.println("DATA DA ATIVIDADE: " + data);
        System.out.println("VALOR DA VARIAVEL  VALOR1: " + valor1);
        System.out.println("VALOR DA VARIAVEL  VALOR2: " + valor2);
        System.out.println("VALOR DA VARIAVEL  VALOR3: " + valor3);

        String valor4 = valor1;
        valor1 = valor3;
        valor3 = valor4;

        System.out.println("VALOR DA TROCA DA VARIAVEL VALOR3  PELO VALOR1 E IGUAL: " + valor3);

        scanner.nextLine();


    }
}