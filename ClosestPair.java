/*
 * Algoritmo y complejidad                         Noviember 2022.
 * Nombre: Nilson David Diaz Hasbun 
 * Codigo: 200152551 
 * Prof. M. Diaz-Maldonado
 * Lab 2: Closest Pair
 * 
 * Synopsis:
 * Se nos ordeno hacer un algoritmo que determine el par de puntos más cercano de un grupo de puntos
 * usando primero una implementación de fuerza bruta y luego usando la estrategia de dividir y conquistar
 * estrategia. 
 */
package closestpair;

import java.util.ArrayList;
import java.util.Random;

public class ClosestPair {

    public static ArrayList PuntoL = new ArrayList<Punto>();

    public static void main(String[] args) {
        /**
         * La siguiente sección crea y almacena la cantidad deseada de puntos
         * en un arraylist cada punto con coordenadas x e y aleatorias que oscilan
         * entre 0 y 20
         */
        Random random = new Random();
        for (int i = 1; i <= 6; i++) {
            PuntoL.add(new Punto(random.nextInt(21), random.nextInt(21)));
        }

        for (Object p : PuntoL) {
            Punto a = (Punto) p;
            System.out.println(a.x + ", " + a.y);
        }
        bruteForce(PuntoL);
    }

    /**
     * El siguiente void itera a través de la ArrayList comparando cada punto
 con los demás y determina qué par tiene la Distancia mínima de todos
 e imprime el par y su Distancia en la consola
     *
     * @param lista Una ArrayList que contiene todos los puntos introducidos: El Array con
 todos los puntos de salida: El par más cercano y su Distancia
     */
    public static void bruteForce(ArrayList<Punto> lista) {
        double Cercanos = Distancia(lista.get(0), lista.get(1));
        Punto puntoA = lista.get(0);
        Punto PuntoB = lista.get(1);
        
        for (Punto lista1 : lista) {
            for (int i = lista.indexOf(lista1) + 1; i < lista.size(); i++) {
                if (Distancia(lista1, lista.get(i)) < Cercanos) {
                    Cercanos = Distancia(lista1, lista.get(i));
                    puntoA = lista1;
                    PuntoB = lista.get(i);
                }
            }
        }
        System.out.println("Los puntos mas cercanos son: (" + puntoA.x + ", " + puntoA.y + ") and (" + PuntoB.x + ", " + PuntoB.y + ")");
        System.out.println("Distancia: " + Cercanos);
    }

    /**
     * El siguiente método devuelve la Distancia entre dos objetos punto
 comparando sus x , y
     *
     *@param a El primer punto a comparar
     * @param b El segundo punto a comparar
     * @retorno La distancia entre estos puntos como entradas dobles: Punto a y
 punto b salidas: La Distancia entre los puntos
     */
    public static double Distancia(Punto a, Punto b) {
        return Math.sqrt(Math.pow((b.y - a.y), 2) + Math.pow((b.x - a.x), 2));
        
    }

}
