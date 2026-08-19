package org.example;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /**
         * 2. Ler dois números inteiros e exibir a soma, a subtração, o produto,
         * a divisão inteira e o resto da divisão.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor informe um número inteiro");
        int numero1 = sc.nextInt();
        System.out.println("Por favor informe outro número inteiro");
        int numero2 = sc.nextInt();

        System.out.println("A soma é " + (numero1 + numero2));
        System.out.println("A subtração é " + (numero1 - numero2));
        System.out.println("A divisão é " + (numero1 / numero2));
        System.out.println("A multiplicação é " + (numero1 * numero2));

    }
}
