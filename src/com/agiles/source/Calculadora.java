package com.agiles.source;

public class Calculadora {

    public Calculadora() {

    }

    public int operar(String str) {
        if (str.isEmpty())
            return 0;
        else if (str.length() == 1)
            return Integer.parseInt(str);
        else if (str.length() > 1) {
            String[] textoSeparado = str.split(",");
            int result = Integer.parseInt(textoSeparado[0]) + Integer.parseInt(textoSeparado[1]);
            return result;
        } else
            return -1;
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
