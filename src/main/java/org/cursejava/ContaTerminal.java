package org.cursejava;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Locale.setDefault(Locale.US);

    	System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        int numero = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = sc.nextDouble();

   
       System.out.println("Olá ".concat(nomeCliente)
               .concat(", obrigado por criar uma conta em nosso banco. Sua agência é ")
               .concat(agencia)
               .concat(", conta ")
               .concat(Integer.toString(numero))
               .concat(" e seu saldo ")
               .concat(Double.toString(saldo))
               .concat(" já está disponível para saque.")); 

    
       
        
        sc.close();
    	
    }
}