import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor para saber se o mesmo é par ou impar: ");
        int valor = scanner.nextInt();

        if (valor % 2 == 0) {

            System.out.print("O valor informado é par!");

        }

        else {

            System.out.print("O valor informado é impar!");

        }


        scanner.close();
        
    }
    
}
