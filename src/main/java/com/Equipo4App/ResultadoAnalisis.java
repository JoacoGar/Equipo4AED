package com.Equipo4App;

public class ResultadoAnalisis {

    private int cantidadPalabras;

    public ResultadoAnalisis(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    @Override
    public String toString() {
        return "Cantidad de palabras: " + cantidadPalabras;
    }
}