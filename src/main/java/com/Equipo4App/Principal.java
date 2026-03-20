package com.Equipo4App;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

    //A: leer archivo
    public static void leerEntradaArchivo(String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            Scanner sc = new Scanner(archivo);

            int entero = sc.nextInt();
            double real = sc.nextDouble();
            String texto = sc.next();

            System.out.println("Entero: " + entero);
            System.out.println("Real: " + real);
            System.out.println("Cadena: " + texto);

            double suma = entero + real;
            int division = entero / (int) real;
            int resto = entero % (int) real;

            System.out.println("Suma: " + suma);
            System.out.println("Division entera: " + division);
            System.out.println("Resto: " + resto);

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado.");
        } catch (Exception e) {
            System.out.println("Error en el formato de los datos.");
        }
    }

    //B: leer desde teclado
    public static void leerEntradaStdin() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el radio: ");
            double radio = sc.nextDouble();

            double area = Math.PI * radio * radio;
            double perimetro = 2 * Math.PI * radio;

            System.out.println("Area: " + area);
            System.out.println("Perimetro: " + perimetro);

        } catch (Exception e) {
            System.out.println("Error: debe ingresar un numero valido.");
        }

        sc.close();
    }

    public static void main(String[] args) {

        //A
        leerEntradaArchivo("entrada.txt");

        //B
        leerEntradaStdin();
    }
}