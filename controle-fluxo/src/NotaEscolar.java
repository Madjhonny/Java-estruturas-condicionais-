import java.util.Scanner;

public class NotaEscolar {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua nota para veriricar sua situação: ");
        float nota = scanner.nextFloat();

        if (nota >= 7 && nota <= 11) {

            System.out.print("Aprovado!");
        }

        else if (nota >= 5 && nota <= 6.9) {

            System.out.println("Recuperação!");

        }

        else if (nota >=1 && nota < 5) {
            System.out.println("Reprovado!");
        }

        else {
            System.out.println("ERRO!!");
        }

        scanner.close();


    }
    
}
