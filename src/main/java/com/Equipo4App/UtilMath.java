package com.Equipo4App;

public class UtilMath{
    public static int factorial (int num){
        if (num == 0) return 1;
        if (num == 1) return 1;
        int resultado = 1;
        for (int i = 1; i <= num; i++){
            resultado = resultado * factorial(num - 1);
        }
        return 0;
    }
    public static boolean esPrimo(int num){
        if (num<2) return false;
        if (num==2) return true;
        if (num%2==0) return false;
        for (int i=3;i*i<=num;i+=2)
            if (num%i==0) return false;
        return true;

    }
}x