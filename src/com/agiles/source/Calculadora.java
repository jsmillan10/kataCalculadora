package com.agiles.source;

public class Calculadora {

    public Calculadora(){

    }

    public int operar(String str) {
        if (str.isEmpty())
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
