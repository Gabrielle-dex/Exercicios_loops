package dio.loops;
import java.util.Scanner;

/*
Faça um programa que leia 5 números(independe do valor)
e informe o maior número
e a média desses números.
*/
  public class Exercicio3_MaioreMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

//          1-5 numeros, ira ser somado todos, para saber a media
            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

//      só vai mostrar no fim do laço
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
  }

