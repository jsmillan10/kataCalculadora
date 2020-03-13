package com.agiles.tests;

import com.agiles.source.Calculadora;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setup(){
        calculadora = new Calculadora();
    }

    @Test
    public void stringVacio(){
        int result = calculadora.operar("");
        assertEquals(0, result);
    }

    @Test
    public void stringUnNumero(){
        int result = calculadora.operar("1");
        assertEquals(1, result);
    }

    @Test
    public void stringDosNumeros(){
        int result = calculadora.operar("15");
        assertEquals(6, result);
    }
}