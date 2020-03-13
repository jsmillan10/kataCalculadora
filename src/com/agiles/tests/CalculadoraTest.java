package com.agiles.tests;

import com.agiles.source.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;


class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setup(){
        calculadora = new Calculadora();
    }

    @Test
    public void stringVacio(){
        int result = calculadora.operar("");
        assertEquals("El resultado debe ser", 0);
    }
}