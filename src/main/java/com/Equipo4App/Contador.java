package com.Equipo4App;

import java.util.Scanner;

public class Contador {
    final int MAX_CONT = 10;
    int contador;
    int incremento = 1;

    public void conteoConWhile() {
        contador = 0;
        while (contador < MAX_CONT) {
            System.out.println("Contador: " + contador);
            contador += incremento;
        }
    }

    public void conteoConDoWhile() {
        contador = 0;
        do {
            System.out.println("Contador: " + contador);
            contador += incremento;
        } while (contador < MAX_CONT);
    }

    public void conteoConFor() {
        for (int i = 0; i < MAX_CONT; i += incremento) {
            System.out.println("Contador: " + i);
        }
    }

    public void switchDecisionBucle() {
        Scanner scanner = new Scanner(System.in); // Declaro escáner para entrada de datos por terminal
        boolean seguir = true;
        do {
            System.out.print("Ingrese una opción para ejecutar el conteo: 1 - while, 2 - do while, 3 - for, 4 - salir ");
            int opc = scanner.nextInt();


            switch (opc) {
                case 1:
                    conteoConWhile();
                    System.out.println(contador);
                    break;
                case 2:
                    conteoConDoWhile();
                    System.out.println(contador);
                    break;
                case 3:
                    conteoConFor();
                    System.out.println(contador);
                    break;
                case 4:
                    seguir = false;
                    break;
            }
        } while (seguir);
    }
    /*
    * Usaría while en situaciones donde se deba ejecutar de manera indefinida hasta cierta condicion, por ejemplo mientras el jugador no pierda, seguir corriendo el juego,
    * Do while en el caso de que siempre se deba ejecutar algo una primera vez antes de preguntar, y for cuando sea algo definido, por ejemplo recorrer arrays */


    /*
    * Un atributo de instancia pertenece a cada objeto creado, por lo que cada instancia
    * tiene su propio valor. En cambio, un atributo static pertenece a la
    * clase y es compartido por todas las instancias, por lo que si una lo modifica,
    * el cambio se refleja en todas.
    */
}
