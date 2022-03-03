package com.company;

public class IfMain {

    public static void main(String[] args) {

        // - Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.

        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("Positivo");
        } else if (numeroIf == 0) {
            System.out.println("0");
        } else {
            System.out.println("Negativo");
        }
    }
}
