package com.ejercicio;

public class Tema_3 {
    public static void main(String[] args) {
        // Primera parte
        int sumaNumeros = Suma(10, 20, 30);
        System.out.println("(1ra parte) La suma es: " + sumaNumeros);

        // Segunda parte
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println("(2da parte) El número de puertas es: " + miCoche.numPuertas);
    }

    // Función Suma de la Primera parte
    public static int Suma(int a, int b, int c){
        return a + b + c;
    }

    // Clase Coche se la Segunda parte
    static class Coche {
        public int numPuertas = 0;

        public void IncrementarPuertas(){
            numPuertas++;
        }
    }
}
