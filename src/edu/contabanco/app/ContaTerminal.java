package edu.contabanco.app;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        String numeroAgencia;
        int numeroConta;
        double valorSaldo;

        String resultado;

        System.out.println("Por favor, digite seu nome:");
        nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        numeroAgencia = scanner.nextLine();    

        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o valor do saldo:");
        valorSaldo = scanner.nextDouble();

        resultado = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, numeroAgencia, numeroConta, valorSaldo); 

        System.out.println(resultado);

        scanner.close();
    }
    
}
