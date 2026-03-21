package com.Equipo4App;

public class Enumerados {
    public enum TipoCaracter {
        VOCAL,
        CONSONANTE,
        DIGITO,
        OTRO
    }

    public static TipoCaracter clasificar (char c){
        c = Character.toLowerCase(c);
        if ("aeiou".indexOf(c) != -1) {
            return TipoCaracter.VOCAL;
        } else if ("bcdfghjklmnñpqrstvwxyz".indexOf(c) != -1) {
            return TipoCaracter.CONSONANTE;
        } else if ("0123456789".indexOf(c) != -1) {
            return TipoCaracter.DIGITO;
        } else {
            return TipoCaracter.OTRO;
        }
    }

    public static void contar (String texto) {
        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            TipoCaracter tipo = clasificar(c);

            if(tipo == TipoCaracter.VOCAL) {
                vocales++;
            } else if (tipo == TipoCaracter.CONSONANTE) {
                consonantes++;
            }
        }
        System.out.println("Vocales : " + vocales);
        System.out.println("Consonantes : " + consonantes);
    }
}
