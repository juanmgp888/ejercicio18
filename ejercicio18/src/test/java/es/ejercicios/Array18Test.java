package es.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class Array18Test {

    @Test
    public void testSegundoMasPequeno() {
        // Crear el ArrayList e inicializar con los números
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(25);
        numeros.add(72);
        numeros.add(8);
        numeros.add(100);

        // Ordenar de menor a mayor
        Collections.sort(numeros);

        // Obtener el valor en el índice 1 (segundo número más pequeño)
        int resultado = numeros.get(1);

        // Verificar que el segundo número más pequeño es 2
        assertEquals(25, resultado);
    }
}

