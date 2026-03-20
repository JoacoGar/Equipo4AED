package com.Equipo4App;

import java.util.Scanner;

public class Multsuma {

    // Método original con double
    public static double multsuma(double a, double b, double c) {
        return a * b + c;
    }

    // Método sobrecargado con int
    public static int multsuma(int a, int b, int c) {
        return a * b + c;
    }

    //Método para multiplicar dos arreglos
    public static int[] multiplicarArreglos(int[] a, int[] b) {
        if (!validarArreglos(a, b)) {
            return null;
        }

        int[] resultado = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] * b[i];
        }

        return resultado;
    }

    //Validación: mismo tamaño
    public static boolean validarArreglos(int[] a, int[] b) {
        return a.length == b.length;
    }

    //Método de entrada
    public static int[] leerArreglo(Scanner sc, int tamaño) {
        int[] arr = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    //Método de salida
    public static void mostrarArreglo(int[] arr) {
        if (arr == null) {
            System.out.println("No se pudo realizar la operación.");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ejemplo multsuma
        System.out.println("Multsuma int: " + multsuma(2, 3, 4));
        System.out.println("Multsuma double: " + multsuma(2.5, 3.0, 4.1));

        //Ejemplo arreglos
        System.out.print("Tamaño de arreglos: ");
        int n = sc.nextInt();

        System.out.println("Arreglo A:");
        int[] a = leerArreglo(sc, n);

        System.out.println("Arreglo B:");
        int[] b = leerArreglo(sc, n);

        int[] resultado = multiplicarArreglos(a, b);

        System.out.println("Resultado:");
        mostrarArreglo(resultado);

        sc.close();
    }
}

//La sobrecarga de métodos se implementa definiendo dos versiones del método multsuma, una que trabaja con datos de tipo int y otra con double, permitiendo realizar la misma operación (a * b + c) con distintos tipos de datos según sea necesario; el programa además incluye la multiplicación de arreglos de enteros utilizando una estrategia de validación que consiste en verificar que ambos arreglos tengan la misma longitud, ya que solo así es posible realizar una multiplicación elemento a elemento, donde cada posición del arreglo resultado se obtiene multiplicando los valores correspondientes de cada arreglo; en caso de que los tamaños no coincidan, la operación no se realiza y se informa al usuario; finalmente, el programa está organizado separando responsabilidades en distintos métodos: uno para la entrada de datos (leerArreglo), otros para los cálculos (multsuma y multiplicarArreglos) y otro para la salida de resultados (mostrarArreglo), lo que mejora la claridad, reutilización y mantenimiento del código.