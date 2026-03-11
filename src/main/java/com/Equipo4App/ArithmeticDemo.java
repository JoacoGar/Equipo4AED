package com.Equipo4App;

import java.util.Scanner;

public class ArithmeticDemo {
    public void demostrar() {
        int resultado = 1 + 10;
        resultado -= 1;
        resultado += 1;
        resultado *= 2;
        resultado /= 2;
        resultado %= 2;


        System.out.println("Resultado: " + resultado);

        //Explicacion
        int a = 5;
        int i = 10;
        a += ++i;
        // El orden de evaluación de la línea anterior es ++i, luego a + ++i, luego se asigna
        System.out.println("i despues de incrementar: " + i);
        System.out.println("a despues de a += ++i " + a);
        /*
         * el ++i hace que el valor de i sea igual a su valor anterior + 1, y el a+= hace que el valor de a sea igual a su valor anterior + el valor de luego del igual, en este caso i++, entonces a = a + i + 1
         */
    }

    public void operacionesBasicas() {
        Scanner scanner = new Scanner(System.in); // Declaro escáner para entrada de datos por terminal

        System.out.print("Ingrese el primer número: ");
        String numIngresado = scanner.nextLine(); // Leo el primer número
        int num = Integer.parseInt(numIngresado); // Lo convierto a entero
        
        System.out.println("Ingrese el segundo número: ");
        String num2Ingresado = scanner.nextLine(); // Leo el segundo
        int num2 = Integer.parseInt(num2Ingresado); // Convierto a int

        // Imprimo resultados
        System.out.println("El resultado de la suma es: " + (num + num2));
        System.out.println("El resultado de la resta es: " + (num - num2));
        // El orden de evaluación de la línea anterior es (num - num2), luego la concatenación con el texto, y por último el método println
        System.out.println("El resultado de la multiplicación es: " + (num * num2));
        System.out.println("El resultado de la división es: " + (num / num2));
        System.out.println("El resultado del resto es: "+ (num % num2));
    }
    // TODO: preguntar por tabla de conversiones
}