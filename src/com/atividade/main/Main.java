package com.atividade.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double valor = 0.00;
        boolean repetir = true;

        do {
            try {
                System.out.print("Digite o valor em reais (R$0.00): ");
                valor = sc.nextDouble();
                repetir = false;
            } catch (InputMismatchException e) {
                System.out.println("Apenas números decimais!");
                sc.nextLine();
            } finally {
                System.out.println("-\nFinally foi executado\n-");
            }
        }while(repetir);

        System.out.println("Valor informado: R$"+valor);
    }

}
