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

        System.out.println( "------------------ Ejercicio 8 ------------------" );
        /* Un StringBuilder es una clase que permite construir y modificar
         cadenas de texto sin crear nuevos objetos cada vez que se realiza un cambio.
         String es inmutable, StringBuilder es mutable.
         */

        // Se crea el StringBuilder sb
        StringBuilder sb = new StringBuilder("Hola");
        System.out.println(sb);

        //append
        sb.append(", Soy un StringBuilder!");
        System.out.println(sb);

        //insert
        sb.insert(4," Aca se inserto");
        System.out.println(sb);

        //delete
        sb.delete(4, 20);
        System.out.println(sb);

        //deleteCharAt
        sb.deleteCharAt(0);
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);

        //setLength
        sb.setLength(4);
        System.out.println(sb);

        //ensureCapacity
        System.out.println("La capacidad antes de usar ensureCapacity es: " + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("Ahora es: " + sb.capacity());

        /* Comparar Stings con == produce errores logicos porque dicho operador
        compara direcciones de memoria, en cambio el metodo equals(), compara
        contenido de los Strings
         */

        String a = new String("hola");
        String b = new String("hola");

        System.out.println(a == b);      // false
        System.out.println(a.equals(b)); // true






    }
}
