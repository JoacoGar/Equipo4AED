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

        System.out.println( "------------------ Ejercicio 7 ------------------" );

        /* Para detectar correctamente los palíndromos, es necesario ignorar mayúsculas, tildes y signos de puntuación.
        Por ejemplo, la frase "¿Acaso hubo búhos acá?" es un palíndromo, pero solo si se eliminan los signos y se normalizan las letras.
        */

        PruebaPalindromo.prueba();

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



        System.out.println( "------------------ Ejercicio 9 ------------------" );
        ContadorPalabras contadorPalabras = new ContadorPalabras();

        String texto1 = "Este texto tiene varias palabras";
        System.out.println("Texto: " + texto1);
        int resultado1 = contadorPalabras.contarPalabras(texto1);
        System.out.println("Cantidad de palabras: " + resultado1);

        String texto2 = "  Contador   de palabras  ";
        System.out.println("Texto: " + texto2);
        int resultado2 = contadorPalabras.contarPalabras(texto2);
        System.out.println("Cantidad de palabras: " + resultado2);

        String texto3 = "   ";
        System.out.println("Texto: " + texto3);
        int resultado3 = contadorPalabras.contarPalabras(texto3);
        System.out.println("Cantidad de palabras: " + resultado3);

        ContadorPalabras contadorUnicas = new ContadorPalabrasUnicas();

        String texto4 = "palabra palabra contador contador";
        System.out.println("Texto: " + texto4);
        int resultado4 = contadorUnicas.contarPalabras(texto4);
        System.out.println("Palabras únicas: " + resultado4);

        String t1 = "contador de palabras";
        String t2 = "prueba de funcionamiento";

        System.out.println("Texto 1: " + t1);
        System.out.println("Texto 2: " + t2);

        int resultado5 = contadorPalabras.contarPalabras(t1, t2);
        System.out.println("Suma de palabras: " + resultado5);

        ResultadoAnalisis analisis = new ResultadoAnalisis(resultado4);
        System.out.println(analisis);

        System.out.println( "------------------ Ejercicio 10 ------------------" );

        ContadorPalabras cp = new ContadorPalabras();

        // Prueba con lineas simulando archivo
        String[] lineas = {
                "Este es un texto de prueba",
                "para contar palabras en varias lineas"
        };

        System.out.println("Lineas:");
        for (String l : lineas) {
            System.out.println(l);
        }

        int total = cp.contarPalabras(lineas);
        System.out.println("Total de palabras: " + total);

        // Prueba de palabras comunes
        String[] palabras1 = {"java", "codigo", "archivo"};
        String[] palabras2 = {"codigo", "texto", "archivo"};

        System.out.println("Palabras comunes (arreglo):");
        String[] comunes1 = cp.palabrasComunes(palabras1, palabras2);
        for (String s : comunes1) {
            System.out.println(s);
        }

        System.out.println("Palabras comunes (colecciones):");
        String[] comunes2 = cp.palabrasComunesSet(palabras1, palabras2);
        for (String s : comunes2) {
            System.out.println(s);
        }

        System.out.println( "------------------ Ejercicio 13 ------------------" );
        enum Resultado {
            VICTORIA, EMPATE, RESULTADO
        }

        for (Resultado e : Resultado.values()) {
            System.out.println(e);
        }

        Enumerados pruebaContarVocales = new Enumerados();

        pruebaContarVocales.contar("aaeeioumlss");

        System.out.println( "------------------ Ejercicio 14 ------------------" );

        T9.transformacionT9("entrada T9.txt", "salida T9.txt");
    }
}
