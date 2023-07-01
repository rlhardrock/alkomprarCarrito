package com.alkomprar.utils;

import java.util.Random;

public class Aleatorizar {

    public int generarIndiceAleatorio(int tamanoArreglo) {
        Random random = new Random();
        return random.nextInt(tamanoArreglo);
    }
}
