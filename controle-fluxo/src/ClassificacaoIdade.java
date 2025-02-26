import java.util.Scanner;

public class ClassificacaoIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem vindo a verificação de faixa etária.\nInforma sua idade: ");
        int idade = scanner.nextInt();

        if (idade > 0 && idade <= 12) {

            System.out.print("Criança");

        }

        else if (idade > 12 && idade <= 17) {

            System.out.print("Adolescente");
        }

        else if ( idade > 17 && idade <= 59) {

            System.out.print("Adulto");
        }

        else {

            System.out.print("Idoso");


        }
        
        scanner.close();

    }
    
}
