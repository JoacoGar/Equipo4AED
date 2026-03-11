package com.Equipo4App;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PruebaAtributos prueba = new PruebaAtributos();
        prueba.mostrarValoresPorDefecto();

        ArithmeticDemo aritmetica = new ArithmeticDemo();
        aritmetica.demostrar();
        aritmetica.operacionesBasicas();
    }
}
