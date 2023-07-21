package br.com.DesafiosDioJavaBasico;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int primeiroNumero = terminal.nextInt();
        System.out.println("Digite outro número: ");
        int segundoNumero = terminal.nextInt();

        try {
            for(int i = 0; i <= contar(primeiroNumero, segundoNumero); i ++){
                System.out.println("Imprimindo o número " + i);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Número não pode dar negativo.");
        }
    }

    static int contar(int primeiroNumero, int segundoNumero) throws IllegalArgumentException {
        if (segundoNumero < primeiroNumero){
            throw new IllegalArgumentException();
        } else {
            return segundoNumero - primeiroNumero;
        }
    }


}

