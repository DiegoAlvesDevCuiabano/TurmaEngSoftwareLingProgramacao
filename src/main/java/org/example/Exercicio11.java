package org.example;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
         * 11. Ler três números inteiros distintos e exibir o maior deles.
         * */
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3;
        int maior, menor;

        System.out.println("Informe o primeiro número");
        numero1 = sc.nextInt();
        maior = numero1;
        menor = numero1;
        sc.nextLine();

        System.out.println("Informe o segundo número");
        numero2 = sc.nextInt();
        sc.nextLine();
        if(numero2 > maior) {
            maior = numero2;
        } else if (numero2 < menor) {
            menor = numero1;
        }

        System.out.println("Informe o terceiro número");
        numero3 = sc.nextInt();
        sc.nextLine();

        if(numero3 > maior) {
            maior = numero3;
        } else if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);


    }
}
