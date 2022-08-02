package dio.loops;
import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
  public class Exercicio6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
//       se colocar 0 todos os número vão ser igual a 0
        int multiplicacao = 1;

//   1 o que vai ser
//   2 até quando deve repetir
//   i-- menos i = i - 1
//sempre colocar do lado de fora dos laços as frases, pois senão vai repetir também
//    print sem ln,
        System.out.print(fatorial +"! = ");
        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
  }
