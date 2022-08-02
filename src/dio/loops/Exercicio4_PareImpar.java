package dio.loops;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
  public class Exercicio4_PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //input

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

//      Você decidi quantos quer colocar antes de entra no do-while
        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

//          para saber se é impar ou par
            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;

//          (pós fixado) count = count +1;
            count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
  }
