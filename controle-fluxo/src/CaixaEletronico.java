import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        
        float saldo = 1500;
        

        System.out.print("Quanto deseja sacar? ");
        float saldoSacar = scanner.nextFloat();

        if (saldoSacar <= saldo) {

             float novoSaldo = saldo - saldoSacar;


            System.out.println("Saque desejeado foi200 enviado! \n Seu saldo atual é de " + novoSaldo);

        
        }

        else {

            System.out.println("Saldo insuficiente para saque!");
        }

        scanner.close();

    }
    

}

