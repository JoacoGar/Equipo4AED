package com.Equipo4App;

public class PruebaPalindromo {
    public static boolean probarPalindromo(String input) {
        String original = input;

        /*
        Como la clase String es inmutable, cada vez que se crea un objeto String su contenido no puede modificarse,
        cada vez que se aplica un método como toLowerCase() o replace(), se crea un nuevo String en memoria en lugar de modificar el original.
        */

        // A minus
        String limpio = input.toLowerCase();

        // Normalizar tildes
        limpio = limpio
            .replace("á", "a")
            .replace("é", "e")
            .replace("í", "i")
            .replace("ó", "o")
            .replace("ú", "u");

        // Eliminar signos
        char[] signos = {'?', '¿', '!', '.', ',', ';', ':', ' '};

        for (char c : signos) {
            limpio = limpio.replace(String.valueOf(c), "");
        }

        String invertido = new StringBuilder(limpio).reverse().toString();

        boolean esPalindromo = limpio.equals(invertido);

        System.out.println("\nFrase original: " + original);
        System.out.println("Normalizada: " + limpio);
        System.out.println("Invertida: " + invertido);
        System.out.println("¿Es palíndromo?: " + esPalindromo);

        return esPalindromo;
    }

    public static void prueba() {
        String hannah = "Did Hannah see bees? Hannah did.";
        String frase = "Anita lava la tina";

        System.out.println("--- PALÍNDROMOS ---");
        probarPalindromo(frase);
        probarPalindromo(hannah);
        probarPalindromo("¿Acaso hubo búhos acá?");
        probarPalindromo("Esto no es un palindromo");

        System.out.println("\n--- MÉTODOS DE STRING ---");

        String texto = "  Hola Mundo Java  ";

        System.out.println("Original: " + texto);
        System.out.println("trim(): " + texto.trim());
        System.out.println("toLowerCase(): " + texto.toLowerCase());
        System.out.println("toUpperCase(): " + texto.toUpperCase());

        System.out.println("substring(2, 6): " + texto.substring(2, 6));
        System.out.println("subSequence(2, 6): " + texto.subSequence(2, 6));

        String[] partes = texto.trim().split(" ");
        System.out.println("split(): ");
        for (String p : partes) {
            System.out.println(" - " + p);
        }

        System.out.println("indexOf('Mundo'): " + texto.indexOf("Mundo"));
        System.out.println("lastIndexOf('a'): " + texto.lastIndexOf("a"));
        System.out.println("contains('Java'): " + texto.contains("Java"));

        System.out.println("replace('Java', 'Python'): " + texto.replace("Java", "Python"));
        System.out.println("replaceAll('[aeiou]', '*'): " + texto.replaceAll("[aeiou]", "*"));
        System.out.println("replaceFirst('a', '*'): " + texto.replaceFirst("a", "*"));

        System.out.println("\n--- MICROCONSULTAS ---");

        System.out.println("Frase: " + hannah);
        System.out.println("Longitud: " + hannah.length());
        System.out.println("Carácter en índice 5: " + hannah.charAt(5));
        System.out.println("Substring(4, 10): " + hannah.substring(4, 10));
    }
}

