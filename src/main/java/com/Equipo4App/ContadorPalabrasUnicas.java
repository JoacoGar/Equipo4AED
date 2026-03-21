package com.Equipo4App;

import java.util.ArrayList;

public class  ContadorPalabrasUnicas extends ContadorPalabras {

    @Override
    public int contarPalabras(String texto) {
        if (texto == null) return 0;

        texto = texto.trim();

        if (texto.isEmpty()) return 0;

        String[] palabras = texto.split(" ");

        ArrayList<String> lista = new ArrayList<>();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {

                palabra = palabra.toLowerCase();

                if (!lista.contains(palabra)) {
                    lista.add(palabra);
                }
            }
        }

        return lista.size();
    }
}