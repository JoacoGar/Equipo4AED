package com.Equipo4App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ContadorPalabras implements ProcesadorTexto {

    private int cantidad;

    public ContadorPalabras() {
        this.cantidad = 0;
    }

    @Override
    public int contarPalabras(String texto) {
        if (texto == null) return 0;

        texto = texto.trim();

        if (texto.isEmpty()) return 0;

        String[] palabras = texto.split(" ");

        int contador = 0;

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                contador++;
            }
        }

        cantidad = contador;
        return cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Sobrecarga
    public int contarPalabras(String[] textos) {
        int total = 0;

        for (String t : textos) {
            total += contarPalabras(t);
        }

        return total;
    }

    public int contarPalabras(String texto1, String texto2) {
        return contarPalabras(texto1) + contarPalabras(texto2);
    }

    // Ejercicio 10

    public String[] obtenerLineas(String archivo) {

        String[] lineas = new String[100];
        int contador = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));

            String linea;

            while ((linea = br.readLine()) != null) {
                lineas[contador++] = linea;
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error al leer archivo");
        }

        String[] resultado = new String[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = lineas[i];
        }
        return resultado;
    }

    // Palabras comunes usando arreglos
    public String[] palabrasComunes(String[] a, String[] b) {
        String[] resultado = new String[a.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    resultado[k++] = a[i];
                    break;
                }
            }
        }

        String[] comunes = new String[k];
        for (int i = 0; i < k; i++) {
            comunes[i] = resultado[i];
        }
        return comunes;
    }

    // Palabras comunes usando colección
    public String[] palabrasComunesSet(String[] a, String[] b) {
        Set<String> setA = new HashSet<>();
        Set<String> resultado = new HashSet<>();

        for (String palabra : a) {
            setA.add(palabra);
        }
        for (String palabra : b) {
            if (setA.contains(palabra)) {
                resultado.add(palabra);
            }
        }
        return resultado.toArray(new String[0]);
    }

    /* Para resolver la intersección con arreglos se usan dos bucles, comparando cada elemento de un arreglo con el otro.
        Es una solución directa, pero puede volverse poco eficiente si hay muchos datos.
        En cambio, usando una colección como Set, se pueden evitar duplicados automáticamente y la búsqueda de elementos es más sencilla con contains().
        Esto hace que el código sea más corto.
        */
}