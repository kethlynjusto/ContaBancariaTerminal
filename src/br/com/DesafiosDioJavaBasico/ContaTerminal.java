package br.com.DesafiosDioJavaBasico;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner Agencia = new Scanner(System.in);
        System.out.println("Digite o número da Agência com dígito: ");
        agencia = Agencia.nextLine();

        Scanner Conta = new Scanner(System.in);
        System.out.println("Digite o número da Conta: ");
        conta = Conta.nextInt();

        Scanner NomeCliente = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nomeCliente = NomeCliente.nextLine();

        Scanner Saldo = new Scanner(System.in);
        System.out.println("Digite o seu saldo: ");
        saldo = Saldo.nextInt();

        System.out.println(("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é: " + agencia + ", conta " + conta + " e seu saldo " + saldo +
                " já está disponível para saque."));

    }
}