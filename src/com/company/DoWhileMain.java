package com.company;

public class DoWhileMain {

    public static void main(String[] args) {

        // - Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

        int numeroWhile = 9;
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3); // El bucle while se ejecuta solo una vez porque la condición no se cumple.
    }
}
