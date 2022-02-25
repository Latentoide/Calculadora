package PruebasBiblioteca;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class MiscelaneaTest {

    @Test
    void suma() {
        assertEquals(73, Miscelanea.suma(30,43));
    }

    @Test
    void generaAleatorioEntre() {
        int[] aux = {7,8,9,10,11};
        assertAll(
                ()-> assertEquals(aux[0] ,Miscelanea.generaAleatorioEntre(7,11)),
            ()-> assertEquals(aux[1] ,Miscelanea.generaAleatorioEntre(7,11)),
            ()-> assertEquals(aux[2] ,Miscelanea.generaAleatorioEntre(7,11)),
            ()-> assertEquals(aux[3] ,Miscelanea.generaAleatorioEntre(7,11)),
            ()-> assertEquals(aux[4] ,Miscelanea.generaAleatorioEntre(7,11))
        );

    }

    @Test
    void concatena() {
        assertEquals("gatopardo", Miscelanea.concatena("gato", "pardo"));
    }

    @Test
    void getMayor() {
        assertEquals(11, Miscelanea.getMayor(7,11));
    }

    @Test
    void getMaximo() {
        int[] array = {8,9,1,10,3,13};
        assertEquals(13, Miscelanea.getMaximo(array));
    }

    @Test
    void getElemento() {
        int[] array = {8,9,1,10,3,13};
        assertEquals(3, Miscelanea.getElemento(array,4));
    }

    @Test
    void factorial() {
        assertEquals(4,Miscelanea.factorial(24));
    }

    @Test
    void esPrimo() {
        assertAll(
                () -> assertTrue(Miscelanea.esPrimo(12)),
                () -> assertTrue(Miscelanea.esPrimo(13))
        );
    }

    @Test
    void areaCirculo() {
        assertEquals(Math.pow(4,2)*Math.PI, Miscelanea.areaCirculo(4));
    }

    @Test
    void areaTriangulo() {
        assertEquals(14, Miscelanea.areaTriangulo(4,7));
    }

    @Test
    void areaCuadrado() {
        assertEquals(16, Miscelanea.areaCuadrado(4));
    }

    @Test
    void decimalABinario() {
        assertEquals("1101", Miscelanea.decimalABinario(13));
    }
}