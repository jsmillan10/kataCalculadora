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
}