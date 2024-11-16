
package es.ejercicios.ejercicio18;

import java.util.ArrayList;
import java.util.Collections;

// Enunciado ejercicio 18:
// 18. Write a Java program to find the second smallest element in an array. 

public class Array18{

    public static void main(String[] args){
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Agregar números al ArrayList
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        // Los ordenamos de menor a mayor
        Collections.sort(numeros);

        // Busco el índice 1, que será el segundo menor número del ArrayList
        int resultado = numeros.get(1);
        System.out.println(resultado);

    }
}
