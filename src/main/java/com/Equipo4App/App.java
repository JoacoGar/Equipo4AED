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

        System.out.println( "------------------ Ejercicio 4 ------------------" );
        UtilMath pruebaUtil = new UtilMath();
        pruebaUtil.factorial(5); //Resultado esperado 120
        pruebaUtil.sumaSegunPrimo(23); //Resultado esperado 132

        System.out.println( "------------------ Ejercicio 5 ------------------" );
        Marcapasos marcapasos = new Marcapasos("JHSYU7", 78, 100);
        System.out.println(marcapasos.toString());

    }
}
