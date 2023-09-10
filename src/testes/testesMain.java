package testes;

import Entidades.Cliente;

import java.util.Scanner;

public class testesMain {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner scan = new Scanner(System.in);
        System.out.println("*** MENU INÍCIADO ***");


        int loop1 = 1;
        while (loop1 == 1) {

            System.out.println("\n 1 - Deposito\n 2 - Transferir\n 3 - Ver Saldo " +
                    "\n 4 - Sair \nDigite a opção desejada:");

            int opcao1 = scan.nextInt();

            switch (opcao1) {
                case 1:
                    System.out.println("\n Como deseja depositar: \n 1 - Gerar Chave Pix\n 2 - Gerar Boleto" +
                            "\n 3 - Voltar ao menu anterior");
                    int subloop1 = scan.nextInt();

                    System.out.println("\n Valor do deposito: ");
                    cliente.depositar(scan.nextDouble());

                    if (subloop1 == 1) {
                        System.out.println("\nChave pix aleatória: xxxxxxxxxxxxxxxx");

                    } else if (subloop1 == 2) {
                        System.out.println("\nCódigo do boleto: xxxxxxxxxxxxxxxxx");

                    } else {
                        break;
                    }

                case 2:

                    System.out.println("\n Valor da transferência: ");
                    cliente.transferir(scan.nextDouble());
                    System.out.println("\n Para quem deseja transferir(CPF/CNPJ ou Chave Pix): ");


            }


        }


    }
}
