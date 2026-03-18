package com.Equipo4App;

public class UtilMath{

    /*
     Casos borde:
     - 0! = 1
     - 1! = 1
     - negativos: no definido → se retorna -1
     - valores grandes pueden desbordar int
    */
    public static void factorial (int num){
        if (num < 0) System.out.println("-1");
        if (num == 0 || num == 1) System.out.println("1");

        int resultado = 1;
        for (int i = 2; i <= num; i++){
            resultado = resultado * i;
        }
        System.out.println("El resultado de !" + num + " es: " + resultado);
    }

    public static boolean esPrimo(int num){
        if (num<2) return false;
        if (num==2) return true;
        if (num%2==0) return false;
        for (int i=3;i*i<=num;i+=2)
            if (num%i==0) return false;
        return true;
    }

    // suma de pares con WHILE
    public static void sumaPares(int num){
        int suma = 0;
        int i = 0;
        while(i <= num){
            if(i % 2 == 0){
                suma += i;
            }
            i++;
        }
        System.out.println(suma);
    }

    // suma de impares con WHILE
    public static void sumaImpares(int num){
        int suma = 0;
        int i = 0;
        while(i <= num){
            if(i % 2 != 0){
                suma += i;
            }
            i++;
        }
        System.out.println(suma);
    }

    // metodo reutilizable que decide
    public static void sumaSegunPrimo(int num){
        if(esPrimo(num)){
            sumaPares(num);
        }else{
            sumaImpares(num);
        }
    }
}