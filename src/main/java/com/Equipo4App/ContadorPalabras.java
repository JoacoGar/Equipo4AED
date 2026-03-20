package com.Equipo4App;

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

}