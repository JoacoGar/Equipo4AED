package com.Equipo4App;

/**
 * Hello world!

 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println( "------------------ Ejercicio 1 ------------------" );
        PruebaAtributos prueba = new PruebaAtributos();
        prueba.mostrarValoresPorDefecto();

        System.out.println( "------------------ Ejercicio 2 ------------------" );
        ArithmeticDemo aritmetica = new ArithmeticDemo();
        aritmetica.demostrar();
        aritmetica.operacionesBasicas();

        System.out.println( "------------------ Ejercicio 3 ------------------" );
        Contador contador = new Contador();
        contador.switchDecisionBucle();
    }
}
