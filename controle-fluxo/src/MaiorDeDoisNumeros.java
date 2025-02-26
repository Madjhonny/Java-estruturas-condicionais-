import java.util.Scanner;

public class MaiorDeDoisNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Verificação de maior e menor entre dois número inteiros.\nInforme o primeiro valor: ");
        int primeiroValor = scanner.nextInt();
        
        System.out.print("Informe o segundo valor: ");
        int segundoValor = scanner.nextInt();

        if (primeiroValor > segundoValor) {
            System.out.println("O primeiro valor informado é maior que o segundo!");
        }

        else if (segundoValor > primeiroValor) {
            System.out.print("O segundo valor informado é maior que o primeiro!");
        }
        
        else {
            System.out.print("Os valores são iguais!");
        }

        scanner.close();


    }
    
}
