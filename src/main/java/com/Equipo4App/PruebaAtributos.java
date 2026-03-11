package com.Equipo4App;

public class PruebaAtributos {
    /*
     Aca van los atributos de la clase
     */
    int numero;
    boolean booleano;
    double decimal;
    char caracter;
    String cadena;
    // int int; // Nombre de variable inválido, da error: java: <identifier> expected

    public void mostrarValoresPorDefecto() {
        int numeroLocal ;
        boolean booleanoLocal;
        /*
        * Las variables locales solo son accesibles dentro del método,
        * las de la instancia dentro de todos los métodos de la clase
        */
        System.out.println("int: "+this.numero);
        System.out.println("double: "+this.decimal);
        System.out.println("boolean: "+ this.booleano);
        System.out.println("String: "+this.cadena);
        System.out.println("char: "+this.caracter);
    }
}