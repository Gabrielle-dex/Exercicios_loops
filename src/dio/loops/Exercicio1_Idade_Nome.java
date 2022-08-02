package dio.loops;
import java.util.Scanner;
/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
// CTRL + D duplica linha
    public class Exercicio1_Idade_Nome {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

            String nome;
            int idade;

//          Laço de repetição
            while(true) {
                System.out.println("Nome: ");
                nome = scan.next();
                if (nome.equals("0")) break;

                System.out.println("Idade: ");
                idade = scan.nextInt();
            }

            System.out.println("Continua aqui...");

        }

    }
