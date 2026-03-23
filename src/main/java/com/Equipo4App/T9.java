package com.Equipo4App;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class T9 {
    static String traducir(char letra) {
        String[] teclas = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int indiceTecla = 0; indiceTecla < teclas.length; indiceTecla++) {
            String tecla = teclas[indiceTecla];

            if (tecla.contains(letra + "")) {
                int numeroTeclado = indiceTecla + 2;
                int cantPulsaciones = tecla.indexOf(letra) + 1;

                String resultado = "";
                for (int i = 0; i < cantPulsaciones; i++) {
                    resultado += numeroTeclado;
                }
                return resultado;
            }
        }

        return "";
    }

    public static String leerArchivo (String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            Scanner sc = new Scanner(archivo);

            String linea = sc.next();
            ArrayList<String> lineasTraducidas = new ArrayList<>();

            while (linea != "") {
                linea = new StringBuilder(linea).reverse().toString();
                ArrayList<String> letrasTraducidas = new ArrayList<>();
                for (char c : linea.toLowerCase().toCharArray()) {
                    letrasTraducidas.add(traducir(c));
                }
                lineasTraducidas.add(String.join(" \n ", letrasTraducidas));
                linea = sc.next();
            }

            return String.join(" ", lineasTraducidas);

        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado.");
        } catch (Exception e) {
            System.out.println("Error en el formato de los datos.");
        }

        return "";
    }

    public static void escribirArchivo(String rutaArchivo, String contenido) {
        try (FileWriter writer = new FileWriter("archivo.txt")) {
            writer.write(contenido);
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    public static void transformacionT9(String rutaEntrada, String rutaSalida) {
        String contenido = leerArchivo(rutaEntrada);
        escribirArchivo(rutaSalida, contenido);
    }
}