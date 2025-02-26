import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        
        float saldo = 1500;

        System.out.print("Quanto deseja sacar? ");
        float saldoSacar = scanner.nextFloat();

        scanner.close();

        if (saldoSacar > saldo) {

           System.out.print("Saldo insuficiente para saque!");

        }

        else {

            System.out.print("Saldo desejado enviado!");



    }

}

}