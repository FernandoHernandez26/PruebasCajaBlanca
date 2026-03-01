/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegointergalactico2;

import java.util.Random;
import java.util.Scanner;

public class JuegoIntergalactico2 {

    //  Genera un número de 3 dígitos con los dados
    public static int lanzarDados(Random rnd) {
        int d1 = rnd.nextInt(9); 
        int d2 = rnd.nextInt(9);
        int d3 = rnd.nextInt(9);
        int direccion = d1 * 100 + d2 * 10 + d3;
        System.out.println("Tirada: " + d1 + d2 + d3 + " Galaxia " + direccion);
        return direccion;
    }

    // Calcula la suma reducida de los dígitos
    public static int reducirDireccion(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        if (suma > 9) {
            return reducirDireccion(suma); // recursividad
        }
        return suma;
    }

    //  Función recursiva para avanzar en el tablero
    public static void jugar(int casilla, int direccionAnterior, Random rnd, Scanner sc) {
        // Condiciones de fin
        if (casilla == 42) {
            System.out.println("¡Has llegado a la casilla 42! Ganaste el juego.");
            return;
        }
        if (casilla == 33) {
            System.out.println(" Agujero negro en la casilla 33. Fin del juego.");
            return;
        }

        // Espera al jugador
        System.out.println("\nPulsa ENTER para lanzar los dados...");
        sc.nextLine();

        // Tirada de dados
        int nuevaDireccion = lanzarDados(rnd);
        int valor = reducirDireccion(nuevaDireccion);

        // Diferencia con la dirección anterior
        int diferencia = Math.abs(valor - direccionAnterior);

        if (diferencia <= 4) {
            casilla += diferencia;
            System.out.println("Avanzas " + diferencia + " casillas → ahora estas en la casilla " + casilla);
        } else {
            System.out.println("Las galaxias no son cercanas → no avanzas.");
        }

        // Peligros
        if (casilla == 31) {
            System.out.println(" Extraterrestres peligrosos en la casilla 31 → retrocedes a la casilla 13.");
            casilla = 13;
        }
        if (casilla > 42) {
            System.out.println("Te pasaste de la casilla 42 → vuelves a la casilla 1.");
            casilla = 1;
        }

        // Llamada recursiva
        jugar(casilla, valor, rnd, sc);
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Bienvenido al JUEGO INTERGALACTICO ");
        jugar(1, 0, rnd, sc); // Comienza en casilla 1
    }
}
